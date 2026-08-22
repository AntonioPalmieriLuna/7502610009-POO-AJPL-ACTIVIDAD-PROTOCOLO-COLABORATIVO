public class Matematicas {
    public static int Suma(int a, int b){
        return a+b;
    }
    public static int Resta(int a, int b){
        return a-b;
    }

    public static int Multiplicacion(int a , int b){
        return a*b;
    }

    public static int Division(int a, int b){
        if(b!=0){
            return a/b;
        }else{
            return Integer.MAX_VALUE;
        }
    }
}
