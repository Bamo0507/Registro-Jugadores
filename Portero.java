public class Portero extends Jugador{
    private int paradasEfectivas;
    private int golesRecibidos;
    private float Efectividad;
    private String jugadorInfo;

    public Portero(String nombre, String pais, int faltas, int goles, int lanzamientos, int paradasEfectivas, int golesRecibidos){
        super(nombre, pais, faltas, goles, lanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;

        if((paradasEfectivas + golesRecibidos) == 0 || lanzamientos == 0){
            this.Efectividad = 0;
        }
        else{
            this.Efectividad = ((paradasEfectivas - golesRecibidos)*100/(paradasEfectivas + golesRecibidos))+ goles*100/lanzamientos;
        }
    }

    public float getEfectividad(){
        return this.Efectividad;
    }

    public String toString(){
        jugadorInfo = super.toString();
        return jugadorInfo + "\nEfectividad: " + Efectividad + "%\n" +
        "---------";
    } 
}
