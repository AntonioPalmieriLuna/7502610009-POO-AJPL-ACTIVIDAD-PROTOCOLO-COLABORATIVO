public class Persona {
    private String nombre;
    private int edad;

    public Persona(){
        this.nombre="Juancho";
        this.edad=20;
    }

    public static void mostrarPersona(){
        System.out.println("Nombre: "+this.nombre+"\n"
                +"Edad: "+this.edad);
    }

    public static void main(String[]args){
        Persona persona1=new Persona();
        persona1.mostrarPersona();
    }
}
