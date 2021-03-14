package tema_I;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Tema_I {
		public static void main (String[]args) throws NumberFormatException, IOException	{
			int a,b ;
			BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Prima valoare: ");
			a = Integer.parseInt(x.readLine());
			System.out.print("A doua valoare: ");
			b = Integer.parseInt(x.readLine());
			
			int sum;
			sum = a + b;
			System.out.println("Suma este egala cu: " +sum);
			int diff;
			diff = a - b;
			System.out.println("Diferenta este egala cu: " +diff);
			int prod;
			prod = a * b;
			System.out.println("Produsul este egal cu: " +prod );
			double avg;
			avg = (double)(a + b)/2;
			System.out.println("Valoarea medie este: " +avg );
			
			int dist;
			int min;
			int max;
			
			if ( a > b ) {
				dist = a-b;
				min = b;
				max = a;
			}
			
			else {
				dist = b-a;
				min = a;	
				max = b;
			}
			
			System.out.println("Distanta dintre valori este: " +dist );
			System.out.println("Valoarea minima este: " +min );
			System.out.println("Valoarea maxima este: " +max );
			
		}
}
