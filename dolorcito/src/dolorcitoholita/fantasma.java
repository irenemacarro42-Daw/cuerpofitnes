package dolorcitoholita;

import java.util.Scanner;

public class fantasma {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	
	int num1;
	int num2;
	
	System.out.println("Escribe el primer numero");
	num1=sc.nextInt();
	
	System.out.println("Escribe el segundo numero");
	num2=sc.nextInt();
	
	int resultado=num1+num2;
	
	System.out.println(resultado);
	sc.close();}
}


