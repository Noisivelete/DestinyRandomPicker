/*
 * Copyright (C) 2022 Francis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.noisivelet.destinyrandompicker;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import net.noisivelet.destinyrandompicker.Data.ArmaExótica;
import net.noisivelet.destinyrandompicker.Data.ArmaduraExótica;
import net.noisivelet.destinyrandompicker.Data.Clase;
import net.noisivelet.destinyrandompicker.Data.Condition;
import net.noisivelet.destinyrandompicker.Data.Datos;
import net.noisivelet.destinyrandompicker.Data.Subclase;
import net.noisivelet.destinyrandompicker.gui.GeneratedRaidJFrame;
import net.noisivelet.destinyrandompicker.gui.OptionsInterface;

/**
 *
 * @author Francis
 */
public class Main {
    static Datos data=YAMLUtils.getYaml("DestinyRandomPicker.yaml");
    
    public static void main(String args[]){
        FlatDarculaLaf.setup();
        if(data == null){
            JOptionPane.showInternalMessageDialog(null, "No se ha podido cargar el archivo DestinyRandomPicker.yaml necesario para el programa.\nComprueba que el archivo esté en la misma carpeta que el ejecutable .jar e inténtalo de nuevo.", "Error: Datos no encontrados", JOptionPane.ERROR_MESSAGE);
            return;
        }
        OptionsInterface mainFrame=new OptionsInterface();
        mainFrame.setVisible(true);
    }
    
    public static GeneratedRaidJFrame generarRaid(String[] nombres, int[] clases, boolean caos, boolean permisivo){
        Random r=new Random();
        int raid=r.nextInt(data.getNumRaids());
        
        Jugador[] jugadores=new Jugador[6];
        Scanner keyboard = new Scanner(System.in);
        
        ArmaExótica armaEspecial=null; //Arma especial, si hay alguna, para asignar a todos los miembros del equipo.

        for(int i=0;i<6;i++){
            int clase=clases[i];
            if(clase==3)
                clase=r.nextInt(data.getNumClases());
            Clase clase_=data.getClase(clase);
            int subclase=r.nextInt(clase_.getSubclases().size());
            Subclase subclase_=clase_.getSubclase(subclase);
            
            ArmaduraExótica armadura;
            do{
                int armor=r.nextInt(clase_.getArmaduras().size());
                armadura=clase_.getArmadura(armor);
            } while(!armadura.puedeUsarlo(subclase_) && !caos);
            
            ArmaExótica arma;
            boolean armaduraIncompatible;
            boolean armaNoUsable;
            do{
                int exotico=r.nextInt(data.getNumArmas());
                arma=data.getArma(exotico);
                
                armaNoUsable=(!arma.isActivada() && !arma.isEsEspecial());
                
                boolean subclaseCoincide=subclase_.getElemento().equals(arma.getElemento());
                boolean noHayCoincidenciaSubclase=false;
                if(armadura.getWeaponConditions() != null)
                    noHayCoincidenciaSubclase=!subclaseCoincide && armadura.getWeaponConditions().subclassMatch;
                
                armaduraIncompatible=(!permisivo && (!armadura.puedeUsarlo(arma) || noHayCoincidenciaSubclase)); //Una armadura es incompatible si el modo permisivo está desactivado y el arma no cumple las condiciones de la armadura.
            } while(armaNoUsable || armaduraIncompatible);
            
            if(armaEspecial == null){
                if(arma.isEsEspecial()){
                    armaEspecial=arma;
                }
            }
            
            Jugador j=new Jugador(nombres[i], arma, armadura, clase_, subclase_);
            jugadores[i]=j;
        }
        
        if(armaEspecial != null){
            for(Jugador j: jugadores){
                j.arma=armaEspecial;
            }
        }
        
        String resultado="========= Raid aleatoria generada: ==========\n\n";
        resultado+="Raid: "+data.getRaid(raid).getNombre()+"\n";
        for(int i=0;i<6;i++){
            resultado+=jugadores[i]+"\n";
        }
        
        return new GeneratedRaidJFrame(resultado);
    }
}
