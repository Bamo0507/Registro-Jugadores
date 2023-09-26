//Bryan Alberto Martínez Orellana
//Carnét 23542
//Ingeniería en Ciencias de la Computación
//Programación Orientada a Objetos
//Creación: 22/09/2023
//Última modificación: 25/09/2023

public class Extremo extends Jugador {
    //Declaramos las variables a utilizar
    private int pasesEfectivos;
    private int asistenciasEfectivas;
    private int Efectividad;
    private String jugadorInfo;

    //Constructor para definir el valor de nuestras variables y de la Efectividad dependiendo de los valores que se den
    public Extremo(String nombre, String pais, int faltas, int goles, int lanzamientos, int pasesEfectivos, int asistenciasEfectivas){
        super(nombre, pais, faltas, goles, lanzamientos);
        this.pasesEfectivos = pasesEfectivos;
        this.asistenciasEfectivas = asistenciasEfectivas;

        //Si alguno de los denominadores se hace 0 establecemos la efectividad en 0
        if((pasesEfectivos + faltas + asistenciasEfectivas) == 0 || lanzamientos == 0){
            this.Efectividad = 0;
        }
        else{
            this.Efectividad = ((pasesEfectivos + asistenciasEfectivas - faltas)*100/(pasesEfectivos + asistenciasEfectivas + faltas))+ goles*100/lanzamientos;
        }
    }

    //Nos retorna la Efectividad obtenida
    public float getEfectividad(){
        return this.Efectividad;
    }

    //toString para los Extremos
    public String toString(){
        jugadorInfo = super.toString();
        return jugadorInfo + "\nEfectividad: " + Efectividad + "%\n" +
        "---------";
    } 
}
