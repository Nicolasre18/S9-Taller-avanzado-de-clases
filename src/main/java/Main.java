/*
Actividad S9 Taller de arreglos , colecciones y diseño avanzado de clases
ISWZ1103-3412-PROGRAMACIÓN
Nombre: Nicolás Recalde 
FECHA: 31 de mayo, 2024
Profesor: Santiago Cordova
*/

/**
 *
 * @author nico
 */
public class Main {

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        System.out.println("Puestos libres: " + parqueadero.calcularPuestosLibres());
        
        parqueadero.entrarCarro("PPP-0001");
        parqueadero.entrarCarro("PAA-0002");
        parqueadero.entrarCarro("PBB-0003");
        
        //Aqui probamos si los metodos estan bien
        System.out.println("Puestos libres: " + parqueadero.calcularPuestosLibres());
        //Tiempo promedio
        System.out.println("Promedio horas: " + parqueadero.darTiempoPromedio());
        //Carro con mas horas
        System.out.println("Carro con mas horas: " + parqueadero.DevuelveCarroMayortiempo().darPlaca());
        //Auto con mas de ocho horas
        System.out.println("Existe auto mas de hocho horas: " + parqueadero.hayCarroMasDeOchoHoras());
        //Lista de autos con mas de 3 horas  
        System.out.println("Carros mas de 3 horas parqueados: " + parqueadero.darCarrosMasDeTresHorasParqueados());
        System.out.println("La lista contiene " + parqueadero.darCarrosMasDeTresHorasParqueados().size() + " elementos");
        
        //Carros con la placa igual 
        System.out.println("Hay autos con la placa duplicada: " + parqueadero.hayCarrosPlacaIgual());
        parqueadero.entrarCarro("PPP-0001");
        System.out.println("Hay autos con la placa duplicada: " + parqueadero.hayCarrosPlacaIgual());
        
        //Autos con placa que comienza con PB
        System.out.println("Cuantos autos tienen placa que comienza con 'PB': " + parqueadero.contarCarrosQueComienzanConPlacaPB());
        parqueadero.entrarCarro("PBP-0004");
        System.out.println("Cuantos autos tienen placa que comienza con 'PB': " + parqueadero.contarCarrosQueComienzanConPlacaPB());
        
        //Auto con mas de 24 horas parqueado y metodo 1 
        System.out.println("Hay algun auto que lleva mas de 24 horas parqueado: " + parqueadero.hayCarroCon24Horas());
        System.out.println("Metodo 1 =   " + parqueadero.metodo1());
        
        //Ver si funciona el metodo 2 con desocupar parqueadero 
        System.out.println("Puestos libres: " + parqueadero.calcularPuestosLibres());
        System.out.println("Metodo 2 = " + parqueadero.metodo2());
        System.out.println("Puestos libres: " + parqueadero.calcularPuestosLibres());
       
    }
}
