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
package net.noisivelet.destinyrandompicker.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.noisivelet.destinyrandompicker.Data.ArmaExótica.Tipo;

/**
 *
 * @author Francis
 */
@JsonIgnoreProperties({ "numClases", "numRaids", "numArmas" })
public class Datos {
    private List<Clase> clases;
    private List<ArmaExótica> armas;
    private List<Raid> raids;
    
    public Datos(){
        clases=null;
        armas=null;
        raids=null;
    }
    public Datos(List<Raid> raids, List<Clase> clases, List<ArmaExótica> armas) {
        this.clases = clases;
        this.armas = armas;
        this.raids = raids;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    public void setArmas(List<ArmaExótica> armas) {
        this.armas = armas;
    }

    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public List<ArmaExótica> getArmas() {
        return armas;
    }

    public List<Raid> getRaids() {
        return raids;
    }
    
    public Raid getRaid(int index){
        return raids.get(index);
    }
    
    public int getNumRaids(){
        return raids.size();
    }
    
    public int getNumArmas(){
        return armas.size();
    }

    public int getNumClases(){
        return clases.size();
    }
    
    public ArmaExótica getArma(int index){
        return armas.get(index);
    }
    
    public Clase getClase(int index){
        return clases.get(index);
    }
    
    static public Datos defaultValues(){
        ArrayList<Raid> raids=new ArrayList<>();
        ArrayList<ArmaExótica> armas=new ArrayList<>();
        ArrayList<Clase> clases=new ArrayList<>();
        
        raids.add(new Raid("Cripta de la Piedra Profunda"));
        raids.add(new Raid("Último Deseo"));
        
        armas.add(new ArmaExótica("Rey de las Ratas", Tipo.CINETICA, true, false));
        armas.add(new ArmaExótica("Brote Perfeccionado", Tipo.CINETICA, true, true));
        
        ArrayList<Subclase> h_sub=new ArrayList<>();
        ArrayList<ArmaduraExótica> h_arm=new ArrayList<>();
        
        h_sub.add(new Subclase("de Gracia"));
        h_sub.add(new Subclase("del Hambre"));
        h_sub.add(new Subclase("Dominasombras", "Estasis:"));
        
        h_arm.add(new ArmaduraExótica("Protocolo Fénix", Arrays.asList(0)));
        h_arm.add(new ArmaduraExótica("Botas de Lunafacción"));
        
        clases.add(new Clase("Hechicero", "Armonización", h_sub, h_arm));
        
        ArrayList<Subclase> c_sub=new ArrayList<>();
        ArrayList<ArmaduraExótica> c_arm=new ArrayList<>();
        
        c_sub.add(new Subclase("del Trampero"));
        c_sub.add(new Subclase("del Foragido"));
        c_sub.add(new Subclase("Fénix", "Estasis:"));
        
        c_arm.add(new ArmaduraExótica("Omnióculus", Arrays.asList(0,1,2)));
        c_arm.add(new ArmaduraExótica("Zapateador"));
        
        clases.add(new Clase("Cazador", "Senda", c_sub, c_arm));
        
        Datos d=new Datos(raids, clases, armas);
        return d;
    }
    
}
