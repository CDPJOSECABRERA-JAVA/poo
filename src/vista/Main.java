package vista;

import excepciones.CampoVacioException;
import excepciones.DniException;
import modelo.Persona;
import modelo.Punto;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args){
        //sobre clase persona agregar atributo: dni
        // nombre, apellido, dni -> todos obligatorios.
        // 2 Excepciones -> DniException, campoVacioException.
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
    }
}
