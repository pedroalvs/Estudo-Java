package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
				s = s.concat("!!!");
				s = s.replace("X", "Senhora");
				s = s.toUpperCase();
				
		System.out.println(s);
		
	//Mesmo com operadores pode dividir a String em várias linhas  
		String x = "Bom dia X"
				.replace("X", "Felipe")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(x);
		
	//Tipos primitivos não tem o operador "."
		int a = 3;	
			// a. <-- Não existe!
		
		System.out.print(a);
				
	}

}
