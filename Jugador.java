public class Jugador {
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamiento;
    
    public Jugador(String nombre, String pais, int faltas, int goles, int lanzamientos){
        this.nombre = nombre;
        this.pais = pais;
        this.golesDirectos = goles;
        this.faltas = faltas;
        this.totalLanzamiento = lanzamientos;
    }
    
    public String toString(){
        return "-------------------------------\n"
        + "--------------"
         + "\nNombre de jugador: " + this.nombre + "\n" +
         "Nacionalidad: " + this.pais + ".";
    }
}

