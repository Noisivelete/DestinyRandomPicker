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

import java.util.List;

/**
 *
 * @author Francis
 */
public class Clase {
    private static int id_c;
    private int id;
    private String nombre;
    private String prefijo;
    private List<Subclase> subclases;
    private List<ArmaduraExótica> armaduras;

    public Clase(){
        
    }
    
    public Clase(String nombre, String prefijo, List<Subclase> subclases, List<ArmaduraExótica> armaduras) {
        id=id_c++;
        this.nombre = nombre;
        this.prefijo = prefijo;
        this.subclases = subclases;
        this.armaduras = armaduras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public List<Subclase> getSubclases() {
        return subclases;
    }
    
    public Subclase getSubclase(int id){
        return subclases.get(id);
    }

    public void setSubclases(List<Subclase> subclases) {
        this.subclases = subclases;
    }

    public List<ArmaduraExótica> getArmaduras() {
        return armaduras;
    }
    
    public ArmaduraExótica getArmadura(int id){
        return armaduras.get(id);
    }

    public void setArmaduras(List<ArmaduraExótica> armaduras) {
        this.armaduras = armaduras;
    }
    
    
}
