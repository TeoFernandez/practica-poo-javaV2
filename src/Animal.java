public class Animal {
    private String nombre;
    private int edad;
    static int contador = 0;

    //Constructor
    Animal(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
        contador++;
    }

    //Metodos
    public String hacerSonido(){
        return "Grrrr";
    }

    public static int getContador(){
        return contador;
    }


    //Getters and Setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    //edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }


}
