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

import java.util.ArrayList;
import net.noisivelet.destinyrandompicker.Data.Actividad;

/**
 *
 * @author Francis
 */
public class ActividadGenerada {
    private Jugador[] jugadores;
    private Actividad actividad;

    public ActividadGenerada(Jugador[] jugadores, Actividad actividad) {
        this.jugadores = jugadores;
        this.actividad = actividad;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public Actividad getActividad() {
        return actividad;
    }    
    
}
