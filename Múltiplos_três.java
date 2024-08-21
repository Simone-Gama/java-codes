import java.util.Scanner;

//Um programa que leia 10 números inteiros, 
//armazene-os em um vetor e imprima os múltiplos de 3.
public class Main
{
	public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	     
	   System.out.print("Informe o tamanho do vetor: ");
       int tamanho = ler.nextInt();
       
       int[] vetor = new int[tamanho];
       
       for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }
        
         System.out.println("Os valores no vetor múltiplos de 3:");
        for (int i = 0; i < tamanho; i++) {
            if(vetor[i] % 3 == 0)
            System.out.println("Posição " + i + ": " + vetor[i]);
        }


        ler.close();
	}
}
