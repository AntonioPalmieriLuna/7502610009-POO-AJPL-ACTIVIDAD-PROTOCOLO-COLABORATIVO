public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches;

    public Coche(){
        contadorCoches++;
    }

    public static void mostarCoches(){
        System.out.println("Hay: "+contadorCoches+" coches");
    }

    public static void main(String[]args){
        Coche coche1=new Coche();
        Coche coche2=new Coche();
        Coche coche3=new Coche();
        Coche coche4=new Coche();
        Coche.mostarCoches();
    }
}
