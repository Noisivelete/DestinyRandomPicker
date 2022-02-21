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

/**
 *
 * @author Francis
 */
public class Raid {
    private static int id_c;
    private int id;
    private String nombre;
    
    /**
     * <b>TODO: Implementar esta funcionalidad; por el momento este valor no es leído.</b><br><br>
     * Posibilidad de que se elija esta raid.<br>
     * Por defecto es 1, que indica 1 única posibilidad de que la raid sea elegida. Cuanto más grande sea el valor, más posibilidades hay.<br>
     * Una raid con 3 de posibilidad tendrá el triple de posibilidades de salir que una con 1 de posibilidad.<br>
     */
    private float posibilidad; 

    public Raid(){
        
    }
    
    public Raid(String nombre, float posibilidad) {
        id=id_c++;
        this.nombre = nombre;
        this.posibilidad = posibilidad;
    }
    
    public Raid(String nombre){
        this(nombre, 1);
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

    public float getPosibilidad() {
        return posibilidad;
    }

    public void setPosibilidad(float posibilidad) {
        this.posibilidad = posibilidad;
    }
    
    
}
