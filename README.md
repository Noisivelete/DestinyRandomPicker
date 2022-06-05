# DestinyRandomPicker
## ¿Qué es?
Este proyecto es una aplicación hecha en Java que permite a los jugadores de Destiny 2 crear builds y actividades aleatorias.

La aplicación generará, una vez ejecutada y con las opciones introducidas, una actividad para jugar. Asignará, además, para todos los miembros de la misma, lo siguiente:
- Su subclase
- Su arma exótica
- Su armadura exótica

### Limitaciones
- No es posible activar o desactivar exóticos dentro del programa. Se asume que la persona tiene todos los exóticos disponibles.

## Descarga
https://github.com/Noisivelete/DestinyRandomPicker/releases/latest

Si simplemente vas a utilizar el programa como un usuario deberás descargar el archivo `DestinyRandomPicker.yaml` y el archivo JAR que acaba con `jar-with-dependencies`. Para utilizar el proyecto como una librería para otro proyecto te recomiendo que descargues el jar sin dependencias a la hora de reducir el tamaño de tu ejecutable final.

Una vez descargado el programa, se puede ejecutar haciendo doble click sobre el fichero JAR. Recuerda que el archivo YAML debe estar en la misma carpeta que el ejecutable.

## Ejecución del programa
El programa se inicia con una interfaz, que contiene una pantalla de opciones a configurar:
- **Modo caos**: Por defecto, la aplicación generará exóticos *viables* (que tengan algún tipo de compenetración con tu subclase y entre ellos. Activar esta opción ignorará este requisito: Podrá salir incluso un exótico que no ofrezca beneficio para la subclase (Estabilizadores Geomagnéticos para un hechicero con Alborada, por ejemplo).
- **Modo permisivo**: Por defecto, la aplicación generará armas exóticas que se compenetren con la armadura exótica que se haya elegido. Activar esta opción ignorará esto, y permitirá que un exótico que afecta a pistolas pueda salir con un francotirador, por ejemplo. Activar el Modo Caos activará esta opción también.
- **Actividad**: Se puede elegir una actividad aleatoria o dejar que la aplicación la elija aleatoriamente. Si se selecciona una mazmorra, el número de personas que editar disminuirá a 3.
- **Clases de los jugadores**: Puedes editar el nombre que aparecerá para cada jugador, además de su subclase. De ser aleatoria, se elegirá al azar entre las 3.

Una vez introducidas las opciones se puede pulsar el botón para generar la actividad. Generará un texto con los exóticos elegidos y la actividad.

## Cambiando exóticos y actividades
Por defecto el programa se actualiza con cada temporada. En caso de que la actualización tarde mucho, se puede editar el archivo DestinyRandomPicker.yaml que el programa lee para tener los datos de los exóticos y las actividades. La estructura es:

- **Clases**: Lista de clases. Cada clase tiene un id (cualquier número), un nombre, prefijo para las subclases que aún sean 2.0 y una lista de subclases y armaduras.
    - **Subclases**: Lista de subclases. Tienen un id, su nombre, un prefijo (sobre todo útil para subclases 2.0) y el elemento que usan: SOLAR, VACIO, ARCO o ESTASIS. (tienen que ser exactamente así, en mayúsculas y sin tildes)
    - **Armaduras**: Una lista de armadura exótica que es propia de esa subclase. Un ID y el nombre son básicos y necesarios en todos los exóticos. Además:
        - hasGlobalScope: `true` o `false`. Si es `true`, la armadura *no* puede ser usada en todas las subclases.
        - subclassScope: Lista de ids de subclases que pueden utilizar esa armadura. `null`, u omitirlo, si la variable `hasGlobalScope` es `false`.
        - hasGlobalWeaponScope: `true` o `false`. Si es `true`, la armadura *no* puede ser usada con cualquier arma.
        - weaponConditions: Condiciones que debe cumplir un arma exótica para poder usarse con la armadura:
            - `weapon`: No usado. En el código para futuras implementaciones de condiciones para otros elementos.
            - `elemento`: El elemento que tendrá que tener el arma para poder usarse, o `null` si no importa.
            - `slot`: CINETICA, ENERGETICA, PESADA. Cuál de los tres slots para arma deberá tener el arma para poder usarse, o `null` si no importa.
            - `municion`: PRIMARIA, ESPECIAL, PESADA. Qué munición debe usar el arma para poder salir con esa armadura, o `null` si no importa.
            - `tipo`: El tipo de arma (SUBFUSIL, FUSIL_FRANCOTIRADOR...). Disponible la lista en la clase [ArmaExótica](https://github.com/Noisivelete/DestinyRandomPicker/blob/master/src/main/java/net/noisivelet/destinyrandompicker/Data/ArmaEx%C3%B3tica.java#L37). `null` si no importa.
            - `subclassMatch`: true o false: Si es true, el arma deberá tener el mismo elemento que la subclase que haya escogida.
 
 - **Armas**: Lista de armas. Cada arma tiene un id, su nombre y:
    - slot: Cuál de los tres slots tiene el arma. CINETICA, ENERGETICA, PESADA.
    - tipo: El [tipo de arma](https://github.com/Noisivelete/DestinyRandomPicker/blob/master/src/main/java/net/noisivelet/destinyrandompicker/Data/ArmaEx%C3%B3tica.java#L37).
    - municion: PRIMARIA, ESPECIAL, PESADA.
    - elemento: El elemento del arma: SOLAR, ARCO, VACIO, ESTASIS o `null` si el arma es cinética y no de estasis.
    - esEspecial: Un arma es especial si, cuando le toca a un miembro de la escuadra, todos los demás miembros pasan a tener la misma arma exótica. Por ejemplo, para tener una actividad con 6 Rey de las Ratas o Brote Perfeccionado.
    - activada: Si el arma puede salir en la selección aleatoria. Por defecto todas pueden, excepto el Rey de las Ratas que solo puede salir en grupos.
- **Actividades**: Una lista de actividades. Tienen su ID, su nombre, su número de jugadores y:
    - posibilidad: No está activado aún, pero determinará la posibilidad de que una actividad salga con respecto a otras. Por ejemplo, si una actividad tiene 0.5 de posibilidad, tendrá solo la mitad de posibilidades de salir con respecto a una con 1.0.
