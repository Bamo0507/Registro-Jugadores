//Bryan Alberto Martínez Orellana
//Carnét 23542
//Ingeniería en Ciencias de la Computación
//Programación Orientada a Objetos
//Creación: 22/09/2023
//Última modificación: 25/09/2023

public class Portero extends Jugador{
    //Declaración de variables
    private int paradasEfectivas;
    private int golesRecibidos;
    private float Efectividad;
    private String jugadorInfo;

    //Constructor para definir el valor de la Efectividad y de las variables
    public Portero(String nombre, String pais, int faltas, int goles, int lanzamientos, int paradasEfectivas, int golesRecibidos){
        super(nombre, pais, faltas, goles, lanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
        //Si se cumple esto se setea en 0 la Efectividad, de lo contrario se tratará de dividir por 0
        if((paradasEfectivas + golesRecibidos) == 0 || lanzamientos == 0){
            this.Efectividad = 0;
        }
        //Se calcula su efectividad
        else{
            this.Efectividad = ((paradasEfectivas - golesRecibidos)*100/(paradasEfectivas + golesRecibidos))+ goles*100/lanzamientos;
        }
    }

    //Método para retornar la efectividad
    public float getEfectividad(){
        return this.Efectividad;
    }

    //Nos devuelve el toString para los Porteros
    public String toString(){
        jugadorInfo = super.toString();
        return jugadorInfo + "\nEfectividad: " + Efectividad + "%\n" +
        "---------";
    } 
}
