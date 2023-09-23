import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato {
    private static int cantJugadores;
    private static int seleccion;
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Portero> porteros = new ArrayList<>();
    private static ArrayList<Extremo> extremos = new ArrayList<>();
    private static String nombreDado;
    private static String paisDado;
    private static int faltasDadas;
    private static int golesDados;
    private static int lanzamientosDados;
    private static int paradasEfectivasDadas;
    private static int golesRecibidosDados;
    private static int asistenciasEfectivasDadas;
    private static int pasesEfectivosDados;
    private static int tipoJugador;
    private static int cantEfectivos;
    private static boolean go = true;
    
    public static void main(String[] args){
        System.out.println(
            "+-------------------------------------------+\n" +
            "|   ___    ___      _     _      _   _   _  |\n" +
            "|  / __|  / _ \\    /_\\   | |    | | | | | | |\n" +
            "| | (_ | | (_) |  / _ \\  | |__  |_| |_| |_| |\n" +
            "|  \\___|  \\___/  /_/ \\_\\ |____| (_) (_) (_) |\n" +
            "+-------------------------------------------+\n");
        System.out.println("MUY BUEN DIA QUERIDO USUARIO!!!\n" + "Estás preparado? Cuentanos, ¿cuántos jugadores han participado en el torneo?\n");
        cantJugadores = obtenerEnteroValido(teclado);
        System.out.println("Muy bien, ahora danos toda su información :D");

        for(int i=0; i<cantJugadores; i++){
            System.out.println("Jugador numero " + (i+1));
            tipoJugador = 0;
            while(tipoJugador != 1 && tipoJugador != 2){
                System.out.println("Primero, ¿qué tipo de jugador es?\n" + "1. Portero\n" + "2. Extremo\n" + "NOTA: Asegurate de colocar 1 o 2 por favor");
                tipoJugador = obtenerEnteroValido(teclado);
            }
            System.out.println("------------------------");
            System.out.println("Por favor, ahora indique el nombre del jugador.");
            nombreDado = teclado.nextLine();
            System.out.println("------------------------");
            System.out.println("Por favor, ahora indique la nacionalidad del jugador.");
            paisDado = teclado.nextLine();
            System.out.println("------------------------");
            System.out.println("¿Cuántas faltas ha hecho el jugador en el torneo?");
            faltasDadas = obtenerEnteroValido(teclado);
            System.out.println("------------------------");
            System.out.println("¿Cuántos goles directos ha hecho?");
            golesDados = obtenerEnteroValido(teclado);
            System.out.println("------------------------");
            System.out.println("¿Cuántos tiros a puerta ha hecho?");
            lanzamientosDados = obtenerEnteroValido(teclado);
            System.out.println("------------------------");
            switch(tipoJugador){
                case 1:
                    System.out.println("¿Cuántas paradas ha hecho en el torneo el portero?");
                    paradasEfectivasDadas = obtenerEnteroValido(teclado);
                    System.out.println("------------------------");
                    System.out.println("¿Cuántos goles le han marcado?");
                    golesRecibidosDados = obtenerEnteroValido(teclado);
                    System.out.println("------------------------");
                    Portero portero = new Portero(nombreDado, paisDado, faltasDadas, golesDados, lanzamientosDados, paradasEfectivasDadas, golesRecibidosDados);
                    porteros.add(portero);
                    break;
                case 2:
                    System.out.println("¿Cuántos pases efectivos ha realizado?");
                    pasesEfectivosDados = obtenerEnteroValido(teclado);
                    System.out.println("------------------------");
                    System.out.println("¿Cuántas asistencias ha hecho?");
                    asistenciasEfectivasDadas = obtenerEnteroValido(teclado);
                    System.out.println("------------------------");
                    Extremo extremo = new Extremo(nombreDado, paisDado, faltasDadas, golesDados, lanzamientosDados, pasesEfectivosDados, asistenciasEfectivasDadas);
                    extremos.add(extremo);
                    break;
            }
        } 
        if(cantJugadores != 0){
            Collections.sort(extremos, new Comparator<Extremo>() {
                @Override
                public int compare(Extremo extremo1, Extremo extremo2) {
                    // Compara la efectividad de los extremos
                    float efectividad1 = extremo1.getEfectividad();
                    float efectividad2 = extremo2.getEfectividad();
                    
                    // Devuelve -1 si efectividad1 es menor, 1 si efectividad2 es menor, 0 si son iguales
                    return Float.compare(efectividad1, efectividad2);
                }
            });
            Collections.sort(porteros, new Comparator<Portero>() {
                @Override
                public int compare(Portero portero1, Portero portero2) {
                    // Compara la efectividad de los porteros
                    float efectividad1 = portero1.getEfectividad();
                    float efectividad2 = portero2.getEfectividad();
                    
                    // Devuelve -1 si efectividad1 es menor, 1 si efectividad2 es menor, 0 si son iguales
                    return Float.compare(efectividad1, efectividad2);
                }
            });
        }
        else {
            System.out.println("No se tiene ningún jugador, regrese cuando la situación cambie.");
            go = false;
        }  
        while(go){
            System.out.println("");
           System.out.println("Gracias por dar toda la información :)\n"+"Ahora qué desea hacer?\n" + "1. Mostrar todos los jugadores registrados.\n" + "2. TOP 3 PORTEROS\n" + "3. Cantidad de extremos con más de 85% de Efectividad\n" + "4. Salir\n");
            seleccion = obtenerEnteroValido(teclado);
            switch(seleccion){
                case 1:
                    System.out.println("------------------------");
                    System.out.println("Porteros en el campeonato: ");
                    for(Portero portero: porteros){
                        System.out.println(portero.toString());
                    }
                    System.out.println("------------------------");
                    System.out.println("Extremos en el torneo: ");
                    for(Extremo extremo: extremos){
                        System.out.println(extremo.toString());
                    }
                    System.out.println("------------------------");
                    break;
                
                case 2:
                    for(int i =(porteros.size()-3); i < porteros.size(); i++) {
                        System.out.println(porteros.get(i).toString());
                    }
                    break;
                case 3:
                    cantEfectivos = 0;
                    for(Extremo extremo: extremos){
                        if(extremo.getEfectividad() >= 0.85){
                            cantEfectivos++;
                        }
                    }
                    System.out.println("Hay " + cantEfectivos + " jugadores EXTREMOS con más del 85% de efectividad");
                    break;
                case 4:
                    go = false;
                    System.out.println("Qué tenga un buen día!!");

            } 
        }     
    }

    //Método para asegurarse que se ingrese un entero en los campos necesarios
    public static int obtenerEnteroValido(Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;
        System.out.println("------------------------");
        do {
            try {
                System.out.print("Por favor, ingresa un número entero: ");
                String entrada = scanner.nextLine();
                numero = Integer.parseInt(entrada);
                entradaValida = true;
                System.out.println("");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número entero.\n");
            }
        } while (!entradaValida);
        return numero;
    }
}
