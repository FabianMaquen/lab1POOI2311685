package E1;
public class Ejercicio_6 {
    public static void main(String[] args){
        int a1 = 100; int a2 = 200;

        if(a1 > 100 && a2 <= 200)
            System.out.println(a1 + " " + a2 + " " + (a1 + a2));
        else
            System.out.println(a1 + " " + a2 + " " + (2 * a1 - a2));
    }
}

/***
 * Respuesta:   100 200 0
*/