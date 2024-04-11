package calculadora;

import java.util.Scanner;

public class swicthcase {
	  public static void calculator(int num) {
	  
		  Scanner sc =  new Scanner(System.in);
		  
	      switch (num) {
	          
	      	  case 1:  

	      		System.out.println("Digite o primeiro número: ");
	      		double var1 = sc.nextInt();
	      		
	      		System.out.println("Digite o segundo número: ");
	      		double var2 = sc.nextInt();
	      		
	      		double result = var1 + var2;
	      		
	      		System.out.println("Resultado: " +result);
	              
	            break;
	          case 2:
	        	  
	        	  System.out.println("Digite o primeiro número: ");
		      		double var3 = sc.nextInt();
		      		
		      		System.out.println("Digite o segundo número: ");
		      		double var4 = sc.nextInt();
		      		
		      		double result1 = var3 - var4;
		      		
		      		System.out.println("Resultado: " +result1);
		              
		            break;
	          case 3:  
	        	  System.out.println("Digite o primeiro número: ");
		      		double var5 = sc.nextInt();
		      		
		      		System.out.println("Digite o segundo número: ");
		      		double var6 = sc.nextInt();
		      		
		      		double result2 = var5 * var6;
		      		
		      		System.out.println("Resultado: " +result2);
		              
		            break;
	          case 4:  
	        	  System.out.println("Digite o primeiro número: ");
		      		double var7 = sc.nextInt();
		      		
		      		System.out.println("Digite o segundo número: ");
		      		double var8 = sc.nextInt();
		      		
		      		double result3 = var7 / var8;
		      		
		      		System.out.println("Resultado: " +result3);
		              
		            break;
	          
	          case 5:  
	        	  
	        	  System.out.println("Digite o número da base: ");
		      		double var9 = sc.nextInt();
		      		
		      		System.out.println("Digite o número do expoente: ");
		      		double var10 = sc.nextInt();
		      		
		      		double result4 = Math.pow(var9, var10);
		      		
		      		System.out.println("Resultado: " +result4);
		              
		            break;
		            
	          case 6:  
	        	  
	        	  System.out.println("Digite o número: ");
		      		double var11 = sc.nextInt();
		      		
		      		double result5 = Math.sqrt(var11);
		      		
		      		System.out.println("Resultado: " +result5);
		              
		            break;       
		            
	          default: 
	              System.out.println("!!!ERRO!!!");
	              break;
	      }
	  }
	}