import java.util.Scanner;
public class Ejercicio39 {

    public static Scanner s = new Scanner(System.in);

    public static String invertir(String palabra, int f)
    {
        if(f == 0)
        {
            return String.valueOf((palabra.charAt(f))); 
        }
        else{
            
            return palabra.charAt(f) + (invertir(palabra, f-1));
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Bienvenido al programa que invierte un string");
        System.out.print("Ingrese un string: ");
        String palabra = s.nextLine();
        s.close();
        System.out.println(invertir(palabra, palabra.length() - 1));
        
    }
}