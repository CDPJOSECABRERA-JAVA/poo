package ejercicios;

public class Fraccion {
    
    int numerador, denominador;
    int signo;

    // CONSTRUCTORES

    public Fraccion(){}

    public Fraccion(String numerador){
        setNumerador(Integer.parseInt(numerador));
        setDenominador(1);

        this.signo = (this.numerador < 0) ? -1 : 1;
        setNumerador(Math.abs(this.numerador));
    }

    public Fraccion(String numerador, String denominador) {
        setNumerador(Integer.parseInt(numerador));
        setDenominador(Integer.parseInt(denominador));

       this.signo = (this.numerador*this.denominador < 0) ? -1 : 1;

       setDenominador(Math.abs(this.denominador));
       setNumerador(Math.abs(this.numerador));
    }

    // METODOS

    public void invierte(){
        int den = this.getDenominador();

        this.setDenominador(numerador);
        this.setNumerador(den);
    }

    public Fraccion multiplica(Fraccion f2){
        Fraccion f3 = new Fraccion();

        f3.setNumerador(this.getNumerador() * f2.getNumerador() * signo);
        f3.setDenominador(this.getDenominador() * f2.getDenominador());

        f3.simplifica();

        return f3;
    }

    public Fraccion divide(Fraccion f2){
        String numeradorStr = Integer.toString(this.getNumerador()*f2.getDenominador()*signo);
        String denominadorStr = Integer.toString(this.getDenominador() * f2.getNumerador());
        return new Fraccion(numeradorStr,denominadorStr);
    }

    public void simplifica(){
        int num = (this.getNumerador() > this.getDenominador()) ? getDenominador() : getNumerador();

        for (int i = num; i > 0; i--) {
            if (getNumerador()%i == 0 && getDenominador()%i == 0) {
                setNumerador(getNumerador()/i);
                setDenominador(getDenominador()/i);
            }
        }
    }
    
    // GETTERS Y SETTERS
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    // TO STRING
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
