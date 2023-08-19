import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Creación de una lista para almacenar objetos de tipo "Person"
        List<Person> persons = new ArrayList<>();

        // Variable que controla la salida del bucle principal
        var exit = false;

        // Bucle principal del programa
        while (!exit) {
            showMenu(); // Llama al método para mostrar el menú
            try {
                exit = executeOperation(console, persons); // Ejecuta la operación elegida por el usuario
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    // Método para mostrar el menú
    private static void showMenu() {
        System.out.print("""
                **** Listado de Personas ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.println("Ingresa la opción deseada: ");
    }

    // Método para ejecutar la operación elegida por el usuario
    private static boolean executeOperation(Scanner console, List<Person> persons) {
        var option = Integer.parseInt(console.nextLine());
        var exit = false;
        switch (option) {
            case 1 -> { // Agregar persona a la lista
                System.out.print("Digite el Nombre: ");
                var name = console.nextLine();
                System.out.print("Digite el Teléfono: ");
                var phone = console.nextLine();
                System.out.print("Digite el email: ");
                var email = console.nextLine();

                // Crea un objeto "Person" con los datos proporcionados
                var person = new Person(name, phone, email);

                // Agrega el objeto "Person" a la lista
                persons.add(person);
                System.out.println("La lista tiene: " + persons.size() + " elementos");
            }
            case 2 -> { // Listar personas
                System.out.println("Listado de Personas: ");
                // Utiliza una lambda y un método de referencia para imprimir cada persona en la lista
                persons.forEach(System.out::println);
            }
            case 3 -> { // Salida del ciclo
                System.out.println("Hasta pronto...");
                exit = true;
            }
            default -> System.out.println("Opción errónea: " + option);
        }
        return exit; // Indica si el bucle debe continuar o no
    }
}
