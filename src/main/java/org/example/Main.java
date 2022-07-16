package org.example;

public class Main {
    public static void main(String[] args) {    // Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre
        // y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente = new Cliente();

        cliente.credito = false;

    }
}

//Crea una clase Persona con las siguientes variables:
// edad, nombre, teléfono
class Persona {
    int edad;
    String nombre;
    int telefono;

    public Persona(){
        System.out.println("28");
        System.out.println("Juan Jose");
        System.out.println("9873654321");
    }
}

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.

class Cliente extends Persona {
    boolean credito;

    public Cliente() {
        System.out.println(credito);
    }

}

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.

class Trabajador extends Persona {
    int salario;
}