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
import net.noisivelet.destinyrandompicker.Data.ArmaExótica.Slot;

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
}
