package aula1_ExceptionsTryCatch;

public class Excecao1 {

	public static void main(String[] args) {

		try {
		int[] vetor = new int [4];
		System.out.println("Antes da Exception");
		
		vetor[4] = 1;
		
		System.out.println("Esse texto n�o ser� impresso");
		
	}catch(ArrayIndexOutOfBoundsException exception) {
		
		System.out.println ("Exce��o ao acessar um �ndice do vetor que n�o existe");
	}
		System.out.println("Esse texto ser� impresso ap�s a exception");

	}

}
