import java.util.Scanner;

//Leia dez números do teclado e conte quantos são pares.

public class Main{
	public static void main(String[] args) {
       ContarPares();
	}
	public static void ContarPares(){
	   Scanner ler = new Scanner(System.in);
	   int cont = 0;
	   System.out.print("Digite 10 números: ");
	   
	   for(int i = 0; i <= 9; i++){
	       int numero = ler.nextInt();
	       if(numero % 2 == 0) cont++;
	   }
	   System.out.printf("%d números são pares!", cont);
	   
	   ler.close();
	}
}
