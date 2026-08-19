public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(){
        this("Antonio",18);
    }

    public Estudiante(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void mostrarEstudiante(){
        System.out.println("nombre del estudiante: "+nombre+"\n");
        System.out.println("edad del estudiante: "+edad);
    }


    public static void main(String[]args){
        Estudiante estudiante1=new Estudiante();
        estudiante1.mostrarEstudiante();

        System.out.println(" -------------------------------- \n");

        Estudiante Estudiante2=new Estudiante("Pepe",15);
        Estudiante2.mostrarEstudiante();
    }

}
