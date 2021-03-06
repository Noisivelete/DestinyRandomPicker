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
public class ArmaExótica extends Exótico{
    public enum Slot{
        CINETICA("Cinética"), ENERGETICA("Energética"), PESADA("Pesada");
        public final String nombre;
        Slot(String str){
            nombre=str;
        }
    }
    
    public enum TipoMunicion{
        PRIMARIA, ESPECIAL, PESADA;
    }
    
    public enum Tipo{
        SUBFUSIL, PISTOLA, CAÑON_MANO, ARCO, FUSIL_AUTO, FUSIL_EXPLORADOR, FUSIL_PULSOS, FUSIL_RASTREO, FUSIL_FUSION, FUSIL_FUSION_LINEAL, FUSIL_FRANCOTIRADOR, ESCOPETA, ESPADA, LANZAGRANADAS, LANZACOHETES, AMETRALLADORA, GUJA
    }
    
    private Slot slot;
    private Tipo tipo;
    private TipoMunicion municion;
    private Elemento elemento;
    private boolean esEspecial; //Armas especiales pueden salir como la única opción exótica del equipo: Por ejemplo, 6 brotes perfeccionados.
    private boolean activada; //Un arma desactivada no saldrá como opción individual, pero podrá salir como única opción si el arma está configurada como esEspecial.

    public ArmaExótica(){
        super("");
    }
    
    public ArmaExótica(String nombre, Slot tipo, boolean esEspecial, boolean activada) {
        super(nombre);
        this.slot = tipo;
        this.esEspecial = esEspecial;
        this.activada = activada;
    }

    public boolean isEsEspecial() {
        return esEspecial;
    }

    public void setEsEspecial(boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public TipoMunicion getMunicion() {
        return municion;
    }

    public void setMunicion(TipoMunicion municion) {
        this.municion = municion;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
}
