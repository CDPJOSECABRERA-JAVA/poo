package modelo;

public class Bicicleta {

    private int numMarchas;
    private int diametroRueda;
    private int velocidad;
    private int id;

    private static int numBicicletas = 0;

    public Bicicleta(int numMarchas, int diametroRueda, int velocidad) {
        this.numMarchas = numMarchas;
        this.diametroRueda = diametroRueda;
        this.velocidad = velocidad;

        this.id = ++numBicicletas;
    }


    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public int getDiametroRueda() {
        return diametroRueda;
    }

    public void setDiametroRueda(int diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumBicicletas() {
        return numBicicletas;
    }

    public static void setNumBicicletas(int numBicicletas) {
        Bicicleta.numBicicletas = numBicicletas;
    }
    



    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda + ", velocidad=" + velocidad
                + ", id=" + id + "]";
    }
}
