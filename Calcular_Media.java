import java.util.Scanner;

//Leia duas notas de aluno, calcule a média e informe se o aluno está Aprovado ou Não.
public class Main{
	public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	     
	   System.out.print("Nota A: ");
       float notaA = ler.nextFloat();
       System.out.print("Nota B: ");
       float notaB = ler.nextFloat();
       
       MediaFinal(notaA, notaB);
       ler.close();
	}
	public static void MediaFinal(float nota1, float nota2){
	   float media = (nota1 + nota2)/2;
       System.out.printf("Média Final: %2f\n", media);
       
       if(media >= 7) System.out.print("Aprovado");
       else System.out.print("Reprovado");
	}
}

