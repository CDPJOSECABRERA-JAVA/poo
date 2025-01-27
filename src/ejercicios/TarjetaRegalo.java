package ejercicios;

public class TarjetaRegalo {

    private double saldo;
    private String identificador;
    

    // CONSTRUCTORES

    public TarjetaRegalo() {
    }

    public TarjetaRegalo(double saldo){

        setSaldo(saldo);
        setIdentificador();
    }

    // METODOS

    public void gasta(double cantidad) throws SaldoInsuficienteException{

        double resta = this.getSaldo() - cantidad;

        if (resta < 0) throw new SaldoInsuficienteException();
        else setSaldo(resta);

    }


    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo nueva = new TarjetaRegalo(this.getSaldo() + t.getSaldo());

        this.setSaldo(0);
        t.setSaldo(0);

        return nueva;
    }
    // GETTERS & SETTERS

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador() {
        this.identificador = Integer.toString((int)(Math.floor(Math.random() * (99999 - 10000) + 10000)));
    }

    // TO STRING

    @Override
    public String toString() {
        return "TarjetaRegalo [saldo=" + saldo + ", identificador=" + identificador + "]";
    }
    

    

}
