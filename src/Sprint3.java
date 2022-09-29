import java.util.Scanner;

public class Sprint3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdEquipe, qtdCombate, notaDesign ;
		String resultadoCombate;
	
		
		System.out.print("Informe a quantidade de equipes: ");
		qtdEquipe = teclado.nextInt();

		int [] numEquipe=new int[qtdEquipe];
		int [] pontosCombate=new int[qtdEquipe];

		for (int i=0 ; i<qtdEquipe;i++) {
			System.out.print("Qual o número da equipe "+(i+1)+": ");
			numEquipe[i]= teclado.nextInt();
			
			System.out.print("\nEquipe #" + (numEquipe[i]));
			System.out.println();

			System.out.print("Quantos combates essa esquipe realizou? ");
			qtdCombate = teclado.nextInt();
			System.out.print("Qual foi a nota do design do robô da equipe " + (i+1)+ "? ");
			notaDesign = teclado.nextInt();
			System.out.println(" ");
			
			for(int combate = 1; combate <= qtdCombate; combate++) {
				System.out.print("Combate " + combate + " obteve: (digite APENAS V para vitória ou D para derrota ou E para empate) ");
				resultadoCombate = teclado.next();
				System.out.println(" ");

				notaDesign=0;

				if(resultadoCombate.equalsIgnoreCase("V")) {
					pontosCombate[i] += 5;

				}else if(resultadoCombate.equalsIgnoreCase("D")) {
					pontosCombate[i] += 3;

				}else if(resultadoCombate.equalsIgnoreCase("E")) {
					pontosCombate[i] += notaDesign;
				}
			}System.out.println(" ");
			
		}
		



		// System.out.println("Ranking: (Em caso de empate, a nota de design do robô será quesito de desempate) ");
		// 	int maiorPonto=0;
		// 	for (int i=0; i<qtdEquipe;i++) {
		// 		if (pontosCombate[i]>maiorPonto) {
		// 			maiorPonto=pontosCombate[i];
		// 		}
		// 	}System.out.println();
		
		
	}

}
