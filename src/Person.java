public class Person {
    private int id;              // Identificador único para cada persona
    private String name;        // Nombre de la persona
    private String phone;       // Número de teléfono de la persona
    private String email;       // Dirección de correo electrónico de la persona
    private static int numberOfPersons = 0;  // Contador estático para rastrear el número total de personas

    // Constructor vacío
    public Person(){
        this.id = ++Person.numberOfPersons;  // Incrementa el contador y asigna el ID
    }

    // Constructor con argumentos
    public Person(String name, String phone, String email){
        this();         // Llama al constructor vacío para asignar un ID único
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Métodos de acceso y modificación para los atributos de la clase
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Representación en cadena de la información de la persona
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Person person1 = new Person("Hola Mundo", "3333333", "mail@mail.com");
        System.out.println(person1);  // Imprime la representación en cadena de la persona
    }
}
