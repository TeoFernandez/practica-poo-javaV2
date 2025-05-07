public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Bestia", 200);
        Gato gato1 = new Gato("Garfield", 15);
        Perro perro1 = new Perro("Tomasa", 21);

        System.out.println(animal1.getNombre() + " tiene " + animal1.getEdad() + " años y hace: " + animal1.hacerSonido());
        System.out.println(gato1.getNombre() + " tiene " + gato1.getEdad() + " años y hace: " + gato1.hacerSonido());
        System.out.println(perro1.getNombre() + " tiene " + perro1.getEdad() + " años y hace: " + perro1.hacerSonido());

    }
}