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

    public Persona(String nombre, String apellido, String dni) /*throws CampoVacioException, DniException*/{
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
  
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) /*throws DniException*/ {
/*
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
 */       


        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) /*throws CampoVacioException*/ {
/* 
        if (nombre.length() < 2) throw new CampoVacioException();

        for (int i = 0; i < nombre.length(); i++) {
            if(!Character.isLetter(nombre.charAt(i))) throw new CampoVacioException();
        }
*/
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido) /*throws CampoVacioException*/ {
        /* 
        if (apellido.length() < 2) throw new CampoVacioException();

        for (int i = 0; i < apellido.length(); i++) {
            if(!Character.isLetter(apellido.charAt(i))) throw new CampoVacioException();
        }
        */
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + edad;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + altura;
        result = prime * result + Float.floatToIntBits(peso);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (edad != other.edad)
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (altura != other.altura)
            return false;
        if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
            return false;
        return true;
    }


    

}
