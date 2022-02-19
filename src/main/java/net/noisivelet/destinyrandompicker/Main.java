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

import java.util.Random;
import java.util.Scanner;
import net.noisivelet.destinyrandompicker.Data.ArmaExótica;
import net.noisivelet.destinyrandompicker.Data.Datos;

/**
 *
 * @author Francis
 */
public class Main {
    
    public static final int HECHICERO=0;
    public static final int CAZADOR=1;
    public static final int TITAN=2;
    
    public static final String[] raids=
        {"Cripta de la Piedra Profunda", "Último Deseo", "Jardín de la Salvación", "Cámara de Cristal"};
    public static final String[] clases=
        {"Hechicero", "Cazador", "Titán"};
    public static final String[] prefijos_subclases=
        {"Armonización", "Senda", "Código"};
    public static final String[][] subclases=
        {
            {"del Cielo", "de la Gracia", "de las Llamas", "del Caos", "de Fisión", "del Hambre", "de la Conducción", "de Control", "de Elementos", "Dominasombras"},
            {"del Forajido", "de los Mil Tajos", "del Tirador Certero", "del Trampero", "del Aparecido", "del Pionero", "del Guerrero", "de la Corriente", "del Viento", "Fénix"},
            {"del Forjado con Fuego", "del Devastador", "del Rompedor de Asedios", "del Protector", "del Comandante", "del Agresor", "del Terremoto", "del Misil", "de la Mole", "Gigante"}
        };
    public static final String[][] exoticos_clases=
    {
        {"Cráneo del Funesto Ahamkara", "Corona de las Tempestades", "Ojo de Otro Mundo", "Pecado de Nezarec", "EL VENADO", "Ceño de la Verdad", "Velo de apoteosis", "Verso de Astrocyte", "Yelmo de Felwinter", "Coro del Alba", "Brazaletes Solares", "Brazaletes de Karnstein", "Astucia Invernal", "Alma de los Eones", "Aspecto de ofidio", "Garras de Ahamkara", "Sujeciones Contraverso", "Artista del Escape", "Empuñadura Necrótica", "Grilletes de nada", "Protocolo Estrella Ígnea", "Alas del Alba Sagrada", "Víspera de Radio", "Alquimia sanguínea", "Fuego Cromático", "Protocolo Fénix", "Coderas del Danzatormentas", "Manto de batalla Armonía", "Pasos Transversales", "Botas de Lunafacción", "Estabilizadores geomagnéticos", "Espolon de Prometio", "Botas del ensamblador"},
        {"Radar de Zopenco", "Halcón Celestial", "Rastreador de enemigos", "Graviton rescindido", "Corona vaina de gusano", "Almete de asesino", "Máscara de Bakris", "Espina de joven Ahamkara", "Mangas trucadas de mecanista", "Eones ágiles", "Juramento de Shinobu", "Agarres sellados de Ahamkara", "Fragmentos de Galanor", "Guardajuramentos", "Saludo del mentiroso", "La picadura de Khepri", "Abrazo de Athrys", "Flujo Raiden", "Frambuesa de la Suerte", "La sombra del dragón", "Espádice de ofidio", "El sexto coyote", "Chaleco Gwishin", "Arnés de Raiju", "Omnioculus", "Pantalones de la Suerte", "Equipo de Orfeo", "Zapateador-3S", "Bufón géminis", "Hi3lo-EE5", "Bombarderos", "Escamas de devoraestrellas", "Máquinas de Baile radiantes"},
        {"Corazacráneos Infranqueable", "Máscara del Silente", "Cuerno de Khepri", "Yelmo de San-14", "Guerrero Eterno", "Máscara de un ojo", "Cicatrices Valiosas", "Barrera de Retroalimentación DCA/0", "Hombreras Colmillo de la Perdición", "Síntoceps", "Seguridad de Eón", "Sendero de cenizas", "Caricia del dios gusano", "Ursa Furiosa", "Baluarte", "Rampas de Citan", "Manto Cascada de Hielo", "No hay planes auxiliares", "Blasón Alfa Lupi", "Equipo Bélico Actium", "Corazón del Fuego Sagrado", "El armamentario", "Corazón de la Luz más íntima", "Recinto de ruptura", "Coraza de la Estrella Fugaz", "León Rampante", "Pacificadores", "Caminantes de las Dunas", "Esquiva-Mk.44", "Protecciones Anteo", "Grebas de peregrino", "Cuna del Fénix", "Senda de los pasos ardientes"}
    };
    
    public static final String[] exoticos=
    {
        "Buen Negocio", "Sturm", "Ala Vigilante", "Multiherramienta MIDA", "Escarlata", "Conejo de Jade", "Huckleberry", "Régimen SUROS", "Cerbero+1", "Terminadeseos", "Fechoría", "As de picas", "La Carabina", "Carga de Izanagi", "Última Palabra", "Arbalesta", "Espino", "Brote Perfecionado", "Mal Yuyu", "Lumina", "Montecarlo", "Bastión", "Marchitador", "Elegidos del Viajero", "Sin Tiempo para Explicaciones", "Halcón de Luna", "Historia del Hombre Muerto", "Criostesia 77k", "Cetro de Ager", "Predecesor",
        "Corazón Gélido", "León Guerrero", "Disparo Solar", "Lanza Gravitatoria", "Palabra de Quemador Celeste", "Temerario", "Luz Directa", "Despiadado", "Borealis", "Lente de Prometeo", "Telesto", "Lanza Polaris", "Trinidad Macabra", "Parteondas", "Señor de los Lobos", "Jötunn", "Le Monarque", "Tarrabah", "Promesa de Eriana", "Divinidad", "Simetría", "Ruina del Diablo", "Golpe de las Nubes", "Cerillero de Tommy", "El Cuarto Jinete", "Efigie Funesta", "Dualidad", "Adivinación de Ticuu", "Mitoclasta Vex", "Propulsor Lorentz",
        "Prospector", "Cañón a Tracción", "Leyenda de Acrius", "D.A.R.I.C", "Bobina de Wardcliff", "La Colonia", "Línea Mundial Cero", "Símil del Sueño", "Susurro del gusano", "Mil Voces", "Zorro de dos colas", "Garra Oscura", "El derrocador de reinas", "Señor del Trueno", "Anarquía", "Verdad", "Portamuerte", "Xenófago", "Aliento del Leviatán", "Heredero Natural", "Ojos del Mañana", "Garra de la Salvación", "Lamento", "Gjallarhorn"
    };
    public static void main(String... args){
        Random r=new Random();
        int raid=r.nextInt(raids.length);
        
        Jugador[] jugadores=new Jugador[6];
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<6;i++){
            int clase;
            do{
                System.out.println("Clase del Jugador #"+(i+1)+" (0: Hechicero, 1: Cazador, 2: Titán, 3: Al azar): ");
                clase=keyboard.nextInt();
            }while(clase < 0 || clase>3);
            if(clase==3)
                clase=r.nextInt(clases.length);
            int subclase=r.nextInt(subclases[clase].length);
            int exotico=r.nextInt(exoticos.length);
            int armadura=r.nextInt(exoticos_clases[clase].length);
            
            Jugador j=new Jugador(i+1, clase, subclase, armadura, exotico);
            jugadores[i]=j;
        }
        
        System.out.println("========= Raid aleatoria generada: ==========\n");
        System.out.println("Raid: "+raids[raid]);
        for(int i=0;i<6;i++){
            System.out.println(jugadores[i]);
        }
    }
}
