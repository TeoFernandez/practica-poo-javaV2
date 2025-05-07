public class Animal {
    private String nombre;
    private int edad;

    //Constructor
    Animal(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos
    public String hacerSonido(){
        return "Grrrr";
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
