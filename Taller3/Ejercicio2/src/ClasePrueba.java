public class ClasePrueba {
    public static void main(String[]args){
        int n1=5;
        int n2=0;

        int suma=Matematicas.Suma(n1,n2);
        System.out.println("La suma es: "+suma);

        int resta= Matematicas.Resta(n1, n2);
        System.out.println("La resta es: "+resta);

        int multiplicacion= Matematicas.Multiplicacion(n1,n2);
        System.out.print("La multiplicacion es: "+multiplicacion+"\n");

        int division= Matematicas.Division(n1,n2);

        if(division==Integer.MAX_VALUE){
            System.out.println("No es valida la división por 0 en el denominador");
        }else{
            System.out.println("La division es: "+division);

        }
    }
}
