import java.util.Scanner;
import java.util.*;

class smallestElement {

	int findSmallest(int array[], int min, int x)
	{
		if(x == array.length)
				return min;
		if(min > array[x])
			min = array[x];


		return findSmallest(array,min, x+1);

	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int array[],size=0,y=0;

		System.out.println("ingresar tamaño de array: ");
		size = sc.nextInt();
		array = new int[size];

		System.out.println("ingrese elementos del arreglo");

		for(int x=0;x<size;x++)
			array[x] = sc.nextInt();

		smallestElement obj = new smallestElement();
		y = obj.findSmallest(array, array[0],1);

		System.out.println(Arrays.toString(array));
		
		System.out.println("el elemento mas pequeño es: "+y);

	}
}



