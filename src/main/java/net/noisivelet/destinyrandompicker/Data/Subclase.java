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

import net.noisivelet.destinyrandompicker.Data.Exótico.Elemento;

/**
 *
 * @author Francis
 */
public class Subclase {
    private static int id_c=0;
    private int id;
    private String nombre;
    private String prefix;
    private Elemento elemento;
    
    public Subclase(){
        
    }
    
    public Subclase(String nombre, String prefix, Elemento elemento) {
        id=id_c++;
        this.nombre = nombre;
        this.prefix = prefix;
        this.elemento = elemento;
    }
    
    public Subclase(String nombre, Elemento elemento){
        this(nombre, null, elemento);
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

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
}
