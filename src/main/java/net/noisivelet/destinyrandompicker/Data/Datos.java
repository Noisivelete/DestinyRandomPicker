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
@JsonIgnoreProperties({ "numClases", "numActividades", "numArmas" })
public class Datos {
    private List<Clase> clases;
    private List<ArmaExótica> armas;
    private List<Actividad> actividades;
    
    public Datos(){
        clases=null;
        armas=null;
        actividades=null;
    }
    public Datos(List<Actividad> actividades, List<Clase> clases, List<ArmaExótica> armas) {
        this.clases = clases;
        this.armas = armas;
        this.actividades = actividades;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    public void setArmas(List<ArmaExótica> armas) {
        this.armas = armas;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public List<ArmaExótica> getArmas() {
        return armas;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }
    
    public Actividad getActividad(int index){
        return actividades.get(index);
    }
    
    public int getNumActividades(){
        return actividades.size();
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
