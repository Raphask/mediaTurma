package estruturasControle;

import java.util.Scanner;



public class médiaTurma {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
			
	System.out.println("Informe a quantidade de Alunos");
	int quantidadeAlunos = entrada.nextInt();
	
	System.out.println("Informe a quantidade de notas");
	int quantidadeNotas = entrada.nextInt();
	
	double[] [] NotasTurma = new double[quantidadeAlunos] [quantidadeNotas] ;	
	

	double total = 0;
	for (int a = 0; a < quantidadeAlunos ; a++) {
		for (int n = 0; n < NotasTurma[n].length; n++) {
	    System.out.printf("Informe a nota %d do Aluno %d ", n + 1 , a + 1);
			NotasTurma[a] [n] = entrada.nextDouble();
			total += NotasTurma[a] [n];
		}
		  }
	double media = total / (quantidadeAlunos * quantidadeNotas);
	
    System.out.printf("A média é %.2f ", media);
	entrada.close();
		}
	}
	  
	
	
	




