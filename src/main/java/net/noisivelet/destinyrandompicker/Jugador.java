package net.noisivelet.destinyrandompicker;

/**
 *
 * @author Francis
 */
public class Jugador {
    public final int id, clase, subclase, exotico_armadura, exotico;

    public Jugador(int id, int clase, int subclase, int exotico_armadura, int exotico) {
        this.id = id;
        this.clase = clase;
        this.subclase = subclase;
        this.exotico_armadura = exotico_armadura;
        this.exotico = exotico;
    }
    
    @Override
    public String toString(){
        String resultado="Jugador #"+id+":\n"
                + "\tClase: "+Main.clases[clase]+"\n";
        String prefijo_subclase=Main.prefijos_subclases[clase];
        if(subclase == Main.subclases[clase].length-1){//Estasis
            prefijo_subclase="Estasis:";
        }
        resultado+="\tSubclase: "+prefijo_subclase+" "+Main.subclases[clase][subclase]+"\n"
                + "\tExótico (Armadura): "+Main.exoticos_clases[clase][exotico_armadura]+" ("+exotico_armadura+")\n"
                + "\tExótico (Arma): "+Main.exoticos[exotico]+" ("+exotico+")";
        return resultado;
    }
}
