package ejercicios;

public class Fraccion {
    
    double numerador, denominador;

    // CONSTRUCTORES

    public Fraccion(){}

    public Fraccion(double numerador, double denominador) {
        setDenominador(denominador);
        setNumerador(numerador);
    }

    // METODOS

    public void invierte(){
        double den = this.getDenominador();

        this.setDenominador(numerador);
        this.setNumerador(den);
    }

    public Fraccion multiplica(Fraccion f2){
        Fraccion f3 = new Fraccion();

        f3.setNumerador(this.getNumerador() * f2.getNumerador());
        f3.setDenominador(this.getDenominador() * f2.getDenominador());

        f3.simplifica();

        return f3;
    }

    public Fraccion divide(Fraccion f2){
        return new Fraccion(this.getNumerador()*f2.getDenominador(), this.getDenominador() * f2.getNumerador());

    }

    public void simplifica(){
        double num = (this.getNumerador() > this.getDenominador()) ? getDenominador() : getNumerador();

        for (double i = num; i > 0; i--) {
            if (getNumerador()%i == 0 && getDenominador()%i == 0) {
                setNumerador(getNumerador()/i);
                setDenominador(getDenominador()/i);
            }
        }
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
