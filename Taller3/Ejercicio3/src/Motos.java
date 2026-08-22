public class Motos {
    private String MarcaMoto;

    public Motos(){
        this.MarcaMoto="Yamaha";
    }

    public void ModificarMarca(){
        this.MarcaMoto="Honda";
}

    public static void main(String[]args){
        Motos moto1=new Motos();
        System.out.println(moto1.MarcaMoto);

        Motos moto2=new Motos();
        moto2.ModificarMarca();
        System.out.println(moto2.MarcaMoto);
    }
}
