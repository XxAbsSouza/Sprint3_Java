import java.util.Scanner;

public class Sprint3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdEquipe, qtdCombate, notaDesign, pontosCombate = 0;
		String resultadoCombate;
		int[] listaClassificacao;
		
		System.out.print("Informe a quantidade de equipes: ");
		qtdEquipe = teclado.nextInt();
		
		for(int equipes = 1; equipes <= qtdEquipe; equipes++) {
			System.out.print("\nEquipe #" + equipes);
			System.out.println();
			System.out.print("Quantos combates essa esquipe realizou? ");
			qtdCombate = teclado.nextInt();
			System.out.print("Qual foi a nota do design do robô da equipe " + equipes + "? ");
			notaDesign = teclado.nextInt();
			for(int combate = 1; combate <= qtdCombate; combate++) {
				System.out.print("Combate " + combate + " obteve: (digite APENAS V para vitória ou D para derrota ou E para empate) ");
				resultadoCombate = teclado.next();
				if(resultadoCombate.equals("V")) {
					pontosCombate += 5;
				}else if(resultadoCombate.equals("D")) {
					pontosCombate += 3;
				}else if(resultadoCombate.equals("E")) {
					pontosCombate += notaDesign;
				}
			}
			System.out.println("pontos: " + pontosCombate);
			
		}
		
	}

}
