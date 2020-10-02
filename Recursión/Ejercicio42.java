import java.util.*; 

public class Ejercicio42{
    //n representa la enésima posición a la cual se quiere llegar.
    //inicio siempre comienza en 0, porque es la primera posición y cambia hasta ser igual que n para parar la recursión
    //l, j y k son la variables de acarreo que se suman entre sí para obtener todos los números de la susesión hasta llegar a n
    public static void run(int inicio, int l, int j, int k, int n){
        if (inicio < n){
            if (inicio == 0){
                System.out.print("0");
                inicio++;
                run(inicio, j, l, k, n);
            }
            else if(inicio == 1){
                System.out.print(", " + k);
                inicio++; 
                run(inicio, j, l, k+j, n ); 
            }
            else{
                System.out.print(", " + k);
                inicio++; 
                l = j; 
                j = k; 
                run(inicio, l,  j, k+l, n);
            }
        }
    }
    static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args){
        // n es igual a enésima posición
        int n = 0; 
        System.out.println("SUCESIÓN DE FIBONACCI ---"); 
        System.out.println("Ingrese la enésima posición hasta la que quiere imprimir: "); 
        n =  teclado.nextInt();
        System.out.println("");

        run(0, 0, 1, 1, n);
    }
}
