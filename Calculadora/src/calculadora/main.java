package calculadora;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o número de acordo com a operação desejada:");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		System.out.println("5 - POTÊNCIA");
		System.out.println("6 - RAIZ");
		
		int num = sc.nextInt();
		
		swicthcase calc = new swicthcase();
		
		calc.calculator(num);
		
	}
	
}
