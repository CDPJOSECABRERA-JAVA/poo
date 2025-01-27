package equals;

import modelo.Persona;

public class EstudioEquals {



    public EstudioEquals (){

        Persona p1 = new Persona("Wuan", "apellido", "dni");
        Persona p2 = new Persona("Wuanchu", "apellido", "dni");
        Persona p3 = new Persona("Wuanchu", "apellido", "dni");

        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        System.out.println("a".equals("a"));

        System.out.println(p3.hashCode());
        System.out.println(p2.hashCode());
    }
}
