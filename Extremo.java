public class Extremo extends Jugador {
    private int pasesEfectivos;
    private int asistenciasEfectivas;
    private int Efectividad;
    private String jugadorInfo;

    public Extremo(String nombre, String pais, int faltas, int goles, int lanzamientos, int pasesEfectivos, int asistenciasEfectivas){
        super(nombre, pais, faltas, goles, lanzamientos);
        this.pasesEfectivos = pasesEfectivos;
        this.asistenciasEfectivas = asistenciasEfectivas;

        if((pasesEfectivos + faltas + asistenciasEfectivas) == 0 || lanzamientos == 0){
            this.Efectividad = 0;
        }
        else{
            this.Efectividad = ((pasesEfectivos + asistenciasEfectivas - faltas)*100/(pasesEfectivos + asistenciasEfectivas + faltas)+ goles*100/lanzamientos);
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
