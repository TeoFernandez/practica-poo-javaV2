//Con esto estamos especificando que Gato hereda de Animal
public class Gato extends Animal {

    public Gato(String nombre,int edad){
        //Con la palabra 'súper' estamos asignando la información heredada
        super(nombre, edad);
    }

    //Metodos
    @Override
    public String hacerSonido(){
        return "Miau";
    }

}
