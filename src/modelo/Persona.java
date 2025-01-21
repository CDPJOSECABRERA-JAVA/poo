package modelo;

import excepciones.CampoVacioException;
import excepciones.DniException;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private int altura;
    private float peso;


    public Persona(){

    }

    public Persona(String nombre, String apellido, String dni) throws CampoVacioException, DniException{
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
  
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniException {

        if (dni.length() != 9) throw new DniException();

        char letraDni;
        int numDni = 0;

        try {
            numDni = Integer.parseInt(dni.substring(0,8));
            letraDni = dni.charAt(8);

        } catch (Exception e) {
            throw new DniException();
        }

        String alfabetoDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCalculada = alfabetoDni.charAt(numDni%23);

        if (letraDni != letraCalculada) throw new DniException();
        


        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CampoVacioException {

        if (nombre.length() < 2) throw new CampoVacioException();

        for (int i = 0; i < nombre.length(); i++) {
            if(!Character.isLetter(nombre.charAt(i))) throw new CampoVacioException();
        }

        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido) throws CampoVacioException {

        if (apellido.length() < 2) throw new CampoVacioException();

        for (int i = 0; i < apellido.length(); i++) {
            if(!Character.isLetter(apellido.charAt(i))) throw new CampoVacioException();
        }

        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
