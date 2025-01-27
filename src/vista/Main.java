package vista;

import ejercicios.Fraccion;
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
        //EjercicioTarjetaRegalo();
        EjercicioFracciones();
        //clasePersona();
        //claseRectangulos();
        // PasoValorReferencia();
        // Modificadores();

        //metodosEstaticos();

        //herencia();
        //polimorfismo();

        //interfaces();

        //EstudioEquals eq = new EstudioEquals();


    }

    private static void EjercicioFracciones(){
        
        
        Fraccion f8 = new Fraccion(8, 4);
        System.out.println(f8.toString());
        
        f8.invierte();
        System.out.println(f8.toString());
        
        f8.simplifica();
        System.out.println(f8.toString());


        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(7,5);

        Fraccion f3 = f1.divide(f2);
        System.out.println(f3.toString());
        f3.simplifica();
        System.out.println(f3.toString());

        Fraccion ff1 = new Fraccion(3,6);
        Fraccion ff2 = new Fraccion(7,1);
        Fraccion ff3 = ff1.multiplica(ff2);
        System.out.println(ff3.toString());


    }

    private static void EjercicioTarjetaRegalo(){

        boolean bucle = false;

        TarjetaRegalo t1;
        TarjetaRegalo t2; 

        do {
            try {
                t1 = new TarjetaRegalo(500);
                t2 = new TarjetaRegalo(5.2);

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
    }

    private static void clasePersona(){
       // try {
            Persona persona = new Persona("hola", "sgd", "");
            Persona persona1 = new Persona();
        //} catch (CampoVacioException | DniException e) {
        //    System.out.println(e.getMessage());
        //} catch (Exception e){
        //    System.out.println(e.getMessage());
        }

    private static void claseRectangulos(){
        Punto punto1 = new Punto(2,3);
        Punto punto2 = new Punto(5,1);
        Punto punto3 = new Punto(6,2);
        Punto punto4 = new Punto(9,7);

        Punto[] puntos = {punto1, punto2, punto3, punto4};

        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        Rectangulo rectangulo2 = new Rectangulo(puntos);

        System.out.println(rectangulo2);

        rectangulo = null;
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
    private static void imprimirNombreYPaga(Trabajador t){
        System.out.printf("El trabajador %s tiene  una paga de %.2f€ %n", t.getNombre(), t.calcularPaga());
    }

    private static void interfaces(){
        Rana rana = new Rana();

        Leon leon = new Leon();

        rana.acechar();
        leon.acechar();
    }

}
