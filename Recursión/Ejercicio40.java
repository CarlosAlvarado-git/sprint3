import java.util.Scanner;
public class Ejercicio40 {

    public static Scanner s = new Scanner(System.in);

    public static int Pow(int base, int exponente)
    {
        if(exponente == 0)
        {
            return 1; 
        }
        else if(exponente == 1)
        {
            return base;
        }
        else{
            
            return base * (Pow(base, exponente-1));
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Bienvenido al programa que realiza la función pow de manera recursiva");
        System.out.print("Ingrese la base: ");
        int base = s.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = s.nextInt();
        s.close();
        System.out.println(Pow(base, exponente));
        
    }
}