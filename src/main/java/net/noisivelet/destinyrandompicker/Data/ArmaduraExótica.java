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
    private boolean hasGlobalWeaponScope; //True si esta armadura exótica se puede acompañar de cualquier arma exótica
    private Condition weaponConditions; //Condiciones para poder usar un arma específica con esta armadura.

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

    public ArmaduraExótica(String nombre, boolean hasGlobalScope, List<Integer> subclassScope, boolean hasGlobalWeaponScope, Condition weaponConditions) {
        super(nombre);
        this.hasGlobalScope = hasGlobalScope;
        this.subclassScope = subclassScope;
        this.hasGlobalWeaponScope = hasGlobalWeaponScope;
        this.weaponConditions = weaponConditions;
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
    
    /**
     * Determina si el arma pasada como parámetro puede ser usada junto a este exótico.
     * @param arma Arma a comprobar
     * @return True si esta arma exótica puede ser usada junto a esta armadura, false si no.
     */
    public boolean puedeUsarlo(ArmaExótica arma){
        if(hasGlobalWeaponScope) return true;
        
        return weaponConditions.fulfillsConditions(arma);
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

    public boolean isHasGlobalWeaponScope() {
        return hasGlobalWeaponScope;
    }

    public void setHasGlobalWeaponScope(boolean hasGlobalWeaponScope) {
        this.hasGlobalWeaponScope = hasGlobalWeaponScope;
    }

    public Condition getWeaponConditions() {
        return weaponConditions;
    }

    public void setWeaponConditions(Condition weaponConditions) {
        this.weaponConditions = weaponConditions;
    }
    
}
