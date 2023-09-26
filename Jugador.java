//Bryan Alberto Martínez Orellana
//Carnét 23542
//Ingeniería en Ciencias de la Computación
//Programación Orientada a Objetos
//Creación: 22/09/2023
//Última modificación: 25/09/2023

public class Jugador {

    //Declaración de variables
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamiento;
    
    //Constructor para definir variables
    public Jugador(String nombre, String pais, int faltas, int goles, int lanzamientos){
        this.nombre = nombre;
        this.pais = pais;
        this.golesDirectos = goles;
        this.faltas = faltas;
        this.totalLanzamiento = lanzamientos;
    }
    
    //toString para la superclase
    public String toString(){
        return "-------------------------------\n"
        + "--------------"
         + "\nNombre de jugador: " + this.nombre + "\n" +
         "Nacionalidad: " + this.pais + ".";
    }
}

