package excepciones;

public class CampoVacioException extends Exception {
    public CampoVacioException(){
        super("Deben rellenarse todos los datos.");
    }
    
}
