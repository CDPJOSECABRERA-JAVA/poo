package interfacess;

public class Rana extends Animal implements Cazador, Presa{

    public Rana(){}

    

    @Override
    public void huir() {
        System.out.println("salto salto salto");
    }

    @Override
    public void acechar() {
        System.out.println("Croak, lenguetazo");
    }

}
