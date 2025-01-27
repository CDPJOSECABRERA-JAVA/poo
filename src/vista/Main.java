package vista;

import ejercicios.SaldoInsuficienteException;
import ejercicios.TarjetaRegalo;
import equals.EstudioEquals;
import excepciones.CampoVacioException;
import excepciones.DniException;
import herencia.Consultor;
import herencia.Empleado;
import herencia.Trabajador;
import interfacess.Leon;
import interfacess.Rana;
import modelo.Bicicleta;
import modelo.Circulo;
import modelo.Persona;
import modelo.Punto;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args){

        // EJERCICIO TARJETAS CORTE ISLANDES

        boolean bucle = false;

        TarjetaRegalo t1;
        TarjetaRegalo t2; 

        do {
            try {
                t1 = new TarjetaRegalo(500);
                t2 = new TarjetaRegalo(5);

                System.out.println(t1.toString());

                t1.gasta(100);
                System.out.println(t1.toString());

                TarjetaRegalo t3 = t1.fusionaCon(t2);

                System.out.println("t1: " + t1.toString());
                System.out.println("t2: " + t2.toString());
                System.out.println("t3: " + t3.toString());

                bucle = false;
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Error. Intentalo de nuevo");
                bucle = true;
            }
     
        } while (bucle);

        //sobre clase persona agregar atributo: dni
        // nombre, apellido, dni -> todos obligatorios.
        // 2 Excepciones -> DniException, campoVacioException.

    /*
        try {
            Persona persona = new Persona("hola", "sgd", "");
            Persona persona1 = new Persona();
        } catch (CampoVacioException | DniException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        Punto punto1 = new Punto(2,3);
        Punto punto2 = new Punto(5,1);
        Punto punto3 = new Punto(6,2);
        Punto punto4 = new Punto(9,7);

        Punto[] puntos = {punto1, punto2, punto3, punto4};

        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        Rectangulo rectangulo2 = new Rectangulo(puntos);

        System.out.println(rectangulo2);

        rectangulo = null;
    */

   // PasoValorReferencia();
   // Modificadores();

    //metodosEstaticos();

    //herencia();
    //polimorfismo();

    //interfaces();

    //EstudioEquals eq = new EstudioEquals();
    }

    private static void PasoValorReferencia(){
        //clase circulo - atr -> int x,y,radio
        //2 constr.  1. recibe x,y.  2. recibe todo.

        Circulo circulo = new Circulo(2,3);
        System.out.println(circulo);
        mueveCirculo(circulo, 20,30);
        System.out.println(circulo);
    }
    public static void mueveCirculo(Circulo circulo, int x, int y){
        
        circulo.setX(x);
        circulo.setY(y);

        circulo = new Circulo(5, 5);
    }

    private static void Modificadores(){
        
    }

    private static void metodosEstaticos(){
        Bicicleta bicleta1 = new Bicicleta(43, 478, 7834783);
        Bicicleta bicleta2 = new Bicicleta(4354, 54646, 3453);
        Bicicleta bicleta3 = new Bicicleta(232, 1, 0);

        System.out.println(bicleta1);
        System.out.println(bicleta2);
        System.out.println(bicleta3);

        System.out.println(Bicicleta.getNumBicicletas());
    }

    private static void herencia(){
        Trabajador trabajador = new Trabajador("Wuan", "JEFASO", "Calle bicicleta nº Pedal", "666111666", "5432253");
        Empleado empleado = new Empleado("Edmundo", "Cocinero", "Calle Atras n2", "653234567", "344634",24.50,5433);
        System.out.println(empleado);
    }

    private static void polimorfismo(){
        Trabajador empleado;
        Trabajador trabajador;
        Trabajador consultor;
        
        trabajador = new Trabajador("Donaldo Trump", "Presindente", "Calle alli", "654346623", "345346363");
        empleado = new Empleado("Donaldo Empleado", "empleado", "Calle alli", "654346623", "345346363", 34564, 6);
        consultor = new Consultor("Donaldo Consultor", "consultor", "Calle alli", "654346623", "345346363",2,7000);
        
        imprimirNombreYPaga(trabajador);
        imprimirNombreYPaga(empleado);
        imprimirNombreYPaga(consultor);

    }
    public static void imprimirNombreYPaga(Trabajador t){
        System.out.printf("El trabajador %s tiene  una paga de %.2f€ %n", t.getNombre(), t.calcularPaga());
    }

    public static void interfaces(){
        Rana rana = new Rana();

        Leon leon = new Leon();

        rana.acechar();
        leon.acechar();
    }
}
