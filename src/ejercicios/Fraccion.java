package ejercicios;

public class Fraccion {
    
    double numerador, denominador;

    // CONSTRUCTORES

    public Fraccion(){}

    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // METODOS

    public void invierte(){
        double den = this.getDenominador();

        this.setDenominador(numerador);
        this.setNumerador(den);
    }

    public double divide(){
        return numerador/denominador;
    }

    public double multiplica(){
        return numerador*denominador;
    }

    // GETTERS & SETTERS

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
    }

}
