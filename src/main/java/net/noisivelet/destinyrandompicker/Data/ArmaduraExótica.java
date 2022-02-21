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
public class ArmaduraExótica extends Exótico{
    private boolean hasGlobalScope; //True si esta armadura exótica se puede usar por cualquier subclase.
    private List<Integer> subclassScope; //Null si hasGlobalScope==true

    public ArmaduraExótica(){
        super("");
    }
    
    public ArmaduraExótica(String nombre) {
        super(nombre);
        hasGlobalScope=true;
        subclassScope=null;
    }
    
    public ArmaduraExótica(String nombre, List<Integer> subclassScope){
        super(nombre);
        hasGlobalScope=false;
        this.subclassScope=subclassScope;
    }
    
    /**
     * Determina si la subclase pasada como parámetro obtiene algún tipo de beneficio por usar este exótico.
     * @param subclase Subclase a comprobar.
     * @return True si esta exótico proporciona alguna ventaja al ser usado con la subclase especificada, false si no.
     */
    public boolean puedeUsarlo(Subclase subclase){
        if(hasGlobalScope) return true;
        
        return subclassScope.contains(subclase.getId());
    }

    public boolean isHasGlobalScope() {
        return hasGlobalScope;
    }

    public void setHasGlobalScope(boolean hasGlobalScope) {
        this.hasGlobalScope = hasGlobalScope;
    }

    public List<Integer> getSubclassScope() {
        return subclassScope;
    }

    public void setSubclassScope(List<Integer> subclassScope) {
        this.subclassScope = subclassScope;
    }
    
    
}
