import java.util.Scanner;

public class Sprint3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int qtdEquipe, qtdCombate;
		String resultadoCombate;
		int auxP, auxN, auxE, auxT;

		System.out.print("Informe a quantidade de equipes: ");
		qtdEquipe = teclado.nextInt();

		int[] numEquipe = new int[qtdEquipe];
		int[] pontosCombate = new int[qtdEquipe];
		int[] notaDesign = new int[qtdEquipe];
		int[] pontuacaoTotal =new int[qtdEquipe];

		for (int i = 0; i < qtdEquipe; i++) {
			System.out.println(" ");
			System.out.print("Qual o número da equipe " + (i + 1) + ": ");
			numEquipe[i] = teclado.nextInt();

			System.out.print("\nEquipe #" + (numEquipe[i]));
			System.out.println();

			System.out.print("Qual foi a nota do design do robô da equipe " + (i + 1) + "? ");
			notaDesign[i] = teclado.nextInt();

			System.out.println(" ");
			System.out.print("Quantos combates essa esquipe realizou? ");
			qtdCombate = teclado.nextInt();
			System.out.println(" ");

			for (int combate = 1; combate <= qtdCombate; combate++) {
				System.out.print("Combate " + combate
						+ " obteve: (digite APENAS V para vitória ou D para derrota ou E para empate) ");
				resultadoCombate = teclado.next();
				System.out.println(" ");

				// notaDesign=0;

				if (resultadoCombate.equalsIgnoreCase("V")) {
					pontosCombate[i] += 5;

				} else if (resultadoCombate.equalsIgnoreCase("D")) {
					pontosCombate[i] += 0;

				} else if (resultadoCombate.equalsIgnoreCase("E")) {
					pontosCombate[i] += 3;
				}

			}
			pontuacaoTotal[i] = pontosCombate[i]+notaDesign[i];
		// ordenação do ranking
		}
		System.out.println(" ");
		for (int j = 1; j <= pontosCombate.length; j++) {
			for (int i = 0; i < pontosCombate.length - 1; i++) {
				if (pontosCombate[i] < pontosCombate[i + 1]||notaDesign[i]<notaDesign[i+1]&&pontosCombate[i]==pontosCombate[i + 1]) {
					auxP = pontosCombate[i];
					pontosCombate[i] = pontosCombate[i + 1];
					pontosCombate[i + 1] = auxP;

					auxN = notaDesign[i];
					notaDesign[i] = notaDesign[i + 1];
					notaDesign[i + 1] = auxN;

					auxE = numEquipe[i];
					numEquipe[i] = numEquipe[i + 1];
					numEquipe[i + 1] = auxE;

					auxT = pontuacaoTotal[i];
					pontuacaoTotal[i] = pontuacaoTotal[i + 1];
					pontuacaoTotal[i + 1] = auxT;



					
				}
			}
		}
		System.out.println("\n Ranking: (Em caso de empate, a nota de design do robô será quesito de desempate) ");
		System.out.println();
		for (int i = 0; i < pontosCombate.length; i++) {
			System.out.println("equipe #" + numEquipe[i] + " | Pontos de Combate: " + pontosCombate[i] +" | Nota de design: "+notaDesign[i]+" |Pontuação total: " + pontuacaoTotal[i]);
		}

	}

}
