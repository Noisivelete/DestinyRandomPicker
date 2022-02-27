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

import net.noisivelet.destinyrandompicker.Data.ArmaExótica.Slot;
import net.noisivelet.destinyrandompicker.Data.ArmaExótica.Tipo;
import net.noisivelet.destinyrandompicker.Data.ArmaExótica.TipoMunicion;
import net.noisivelet.destinyrandompicker.Data.Exótico.Elemento;

/**
 *
 * @author Francis
 */
public final class Condition {
    private boolean weapon;
    private Elemento elemento;
    private Slot slot;
    private TipoMunicion munición;
    private Tipo tipo;
    public boolean subclassMatch;

    public Condition(){
        
    }
    
    public Condition(boolean isWeapon, Elemento elemento, Slot slot, TipoMunicion munición, Tipo tipo) {
        this.weapon = isWeapon;
        this.elemento = elemento;
        this.slot = slot;
        this.munición = munición;
        this.tipo = tipo;
    }

    public boolean isWeapon() {
        return weapon;
    }

    public void setWeapon(boolean isWeapon) {
        this.weapon = isWeapon;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public TipoMunicion getMunición() {
        return munición;
    }

    public void setMunición(TipoMunicion munición) {
        this.munición = munición;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    public boolean fulfillsConditions(Exótico e){
        if(e instanceof ArmaExótica arma){
            if(!weapon) return false;
            if(elemento != null)
                if(!elemento.esIgual(arma.getElemento())) return false;
            if(slot != null)
                if(!slot.equals(arma.getSlot())) return false;
            if(munición != null)
                if(!munición.equals(arma.getMunicion())) return false;
            if(tipo != null)
                if(!tipo.equals(arma.getTipo())) return false;
            
            
            return true;
        } else {
            //ArmaduraExótica armadura=(ArmaduraExótica)e;
            return !weapon;
        }
    }

    public boolean isSubclassMatch() {
        return subclassMatch;
    }

    public void setSubclassMatch(boolean subclassMatch) {
        this.subclassMatch = subclassMatch;
    }
    
    
}
