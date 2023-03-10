package fundamentos.desafios;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		//parte 1 
		int a = (int) Math.pow(6 * (3+2), 2);
			a = a / (3 * 2);
		
			//System.out.println(a);
			
		//parte 2
		int b = (1 - 5) * (2 - 7);
			b = (int) Math.pow(b / 2 , 2);
		
			//System.out.println(b);
			
			
		int sup = (int) Math.pow(a - b, 3);
		int inf = (int) Math.pow(10, 3);
		
		
		int resultado = sup / inf;
		
		System.out.println(resultado);
	}
	
}
