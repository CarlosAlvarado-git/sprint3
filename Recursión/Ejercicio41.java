import java.util.Scanner;

class Ejercicio41{
    static Scanner teclado = new Scanner(System.in);
    public static int respuesta = -1;
    public static void verificar(int dos, int n){
        if(n == 0){
            respuesta = n;
        }
        else if(n == 1){
            respuesta = n;
        }
        else{
            verificar(dos, n-2);
        }
    }
    public static void main(String [] arg){
        System.out.println("¡Bienvenido a la verificación de un número par o impar por medio de recursion!");
        //System.out.println("Ingrese el numero a verificar: ");
        //teclado.nextInt();
        int r = 0;
        int r2 = 0;
        while(r != 1){
            System.out.println("Ingrese el numero a verificar: ");
            if(teclado.hasNextInt() == true){
                int numero = teclado.nextInt();
                teclado.nextLine();
                if(numero < 0){
                    numero = numero*-1;
                }
                verificar(2, numero);
                if(respuesta != 0){
                    System.out.println("El numero " + numero + " es impar");
                    while(r2 != 1){
                        System.out.print("Deseea continuar: (y/n) ");
                        String respue = teclado.nextLine();
                        if(respue.equals("y")){
                            r2 = 1;
                        }
                        else{
                            r = 1;
                            r2 = 1;
                        } 
                    }
                }
                else{
                    System.out.println("El numero " + numero + " es par");
                    while(r2 != 1){
                        System.out.print("Deseea continuar: (y/n) ");
                        String respue = teclado.nextLine();
                        if(respue.equals("y")){
                            r2 = 1;
                        }
                        else{
                            r = 1;
                            r2 = 1;
                        } 
                    }
                }
            }
            else{
                System.out.println("Ingrese sólo número enteros, no decimales ni letras");
                teclado.nextLine();
            }
        }
    }
}