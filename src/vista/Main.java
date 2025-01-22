package vista;

import excepciones.CampoVacioException;
import excepciones.DniException;
import modelo.Bicicleta;
import modelo.Circulo;
import modelo.Persona;
import modelo.Punto;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args){
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

    metodosEstaticos();
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
}
