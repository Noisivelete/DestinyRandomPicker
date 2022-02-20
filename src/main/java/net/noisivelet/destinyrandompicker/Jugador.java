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

import net.noisivelet.destinyrandompicker.Data.ArmaExótica;
import net.noisivelet.destinyrandompicker.Data.ArmaduraExótica;
import net.noisivelet.destinyrandompicker.Data.Clase;
import net.noisivelet.destinyrandompicker.Data.Subclase;

/**
 *
 * @author Francis
 */
public class Jugador {
    public int id;
    public ArmaExótica arma;
    public ArmaduraExótica armadura;
    public Clase clase;
    public Subclase subclase;

    public Jugador(int id, ArmaExótica arma, ArmaduraExótica armadura, Clase clase, Subclase subclase) {
        this.id = id;
        this.arma = arma;
        this.armadura = armadura;
        this.clase = clase;
        this.subclase = subclase;
    }
    
    @Override
    public String toString(){
        String resultado="Jugador #"+id+":\n"
                + "\tClase: "+clase.getNombre()+"\n";
        String prefijo_subclase=subclase.getPrefix() == null? clase.getPrefijo():subclase.getPrefix();
        resultado+="\tSubclase: "+prefijo_subclase+" "+subclase.getNombre()+"\n"
                + "\tExótico (Armadura): "+armadura.nombre+" ("+armadura.id+")\n"
                + "\tExótico (Arma): "+arma.nombre+" ("+arma.id+")";
        return resultado;
    }
}
