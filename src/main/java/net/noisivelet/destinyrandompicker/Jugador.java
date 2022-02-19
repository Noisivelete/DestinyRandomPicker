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

/**
 *
 * @author Francis
 */
public class Jugador {
    public final int id, clase, subclase, exotico_armadura, exotico;

    public Jugador(int id, int clase, int subclase, int exotico_armadura, int exotico) {
        this.id = id;
        this.clase = clase;
        this.subclase = subclase;
        this.exotico_armadura = exotico_armadura;
        this.exotico = exotico;
    }
    
    @Override
    public String toString(){
        String resultado="Jugador #"+id+":\n"
                + "\tClase: "+Main.clases[clase]+"\n";
        String prefijo_subclase=Main.prefijos_subclases[clase];
        if(subclase == Main.subclases[clase].length-1){//Estasis
            prefijo_subclase="Estasis:";
        }
        resultado+="\tSubclase: "+prefijo_subclase+" "+Main.subclases[clase][subclase]+"\n"
                + "\tExótico (Armadura): "+Main.exoticos_clases[clase][exotico_armadura]+" ("+exotico_armadura+")\n"
                + "\tExótico (Arma): "+Main.exoticos[exotico]+" ("+exotico+")";
        return resultado;
    }
}
