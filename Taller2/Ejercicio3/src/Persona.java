public class Persona {
    private String nombre;
    private int edad;

    public Persona(){
        this.nombre="Juancho";
        this.edad=20;
    }

    public static void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.nombre+"\n"
                +"Edad: "+p.edad);
    }

    public static void main(String[]args){
        Persona persona1=new Persona();
        Persona.mostrarPersona(persona1);
    }
}
