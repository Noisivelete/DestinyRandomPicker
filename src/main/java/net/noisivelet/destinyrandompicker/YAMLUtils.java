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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import net.noisivelet.destinyrandompicker.Data.Datos;

/**
 *
 * @author Francis
 */
public class YAMLUtils {
    public static Datos getYaml(String input){
        ObjectMapper mapper=new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try {
            return mapper.readValue(new File(input), Datos.class);
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void guardarYaml(Datos datos, String output){
        ObjectMapper mapper=new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try {
            mapper.writeValue(new File(output), datos);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
