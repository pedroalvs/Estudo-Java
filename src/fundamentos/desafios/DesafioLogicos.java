package fundamentos.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		Boolean TTerca = true;
		Boolean TQuinta = true;
		
		Boolean TV50 = TTerca && TQuinta;
		System.out.println("Conseguiu comprar a TV de 50\"? " + TV50);

		Boolean TV32 = TTerca ^ TQuinta;
		System.out.println("\nConseguiu comprar a TV de 32\"? " + TV32);

		Boolean Sorvete = TTerca || TQuinta;			
		System.out.println("\nTomou sorvete com a familia? " + Sorvete);
		System.out.println("Vai ficar mais saldável? " + !Sorvete);
	}
	
}
