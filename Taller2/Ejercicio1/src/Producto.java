public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre,int precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public void mostrarProducto(){
        System.out.println("nombre del producto: "+nombre+"\n");
        System.out.println("precio del producto: "+precio);
    }

    public static void main(String[]args){

        Producto producto1=new Producto("Televisor",3000);
        producto1.mostrarProducto();

        System.out.println(" -------------------------------- \n");

        Producto producto2=new Producto("Abanico",2500);
        producto2.mostrarProducto();

    }
}
