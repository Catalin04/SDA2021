package Tema2A;
import java.util.Scanner;

public class Temperatura {
	public static Scanner a;
	public static void main (String[]args)
	{
		a = new Scanner(System.in);
		System.out.print("Numarul de pacienti: ");;
		int x = a.nextInt();
		int i;
		
		double []v = new double[x];
			
			for(i=0; i<x; i++) {
				System.out.print("V["+i+"]=");
				v[i]= a.nextDouble();
			}
			
			System.out.print("Temperaturi normale: ");
			for(i=0; i<x; i++) {
				if(v[i]<37)
					System.out.println("("+v[i]+ "," +i+ ")" );
			}
			
			System.out.print("Temperaturi anormale: ");
			for(i=0; i<x; i++){
				if(v[i]>=37)
					System.out.println("("+v[i]+ "," +i+ ")" );
				
			}
	}
}
