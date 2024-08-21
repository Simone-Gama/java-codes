import java.util.Scanner;

//Um programa que leia o preço de um produto e a porcentagem de desconto 
//e calcule o preço final descontado. Usar função.

public class Main{
	public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	     
	   System.out.print("Informe o Preço......: ");
       float preco = ler.nextFloat();
       
       System.out.print("Informe a Porcentagem: ");
       float porcent = ler.nextFloat();
       
       Porcentagem(preco, porcent);
       ler.close();
	}
	public static void Porcentagem(float preco, float porcent){
	   float preco_final = preco - (preco * (porcent / 100));
       System.out.printf("Preço descontado.....: %2f", preco_final);
	    
	}
}

