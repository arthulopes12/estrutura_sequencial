package expressoes_aritimeticas;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.3568;
		int s = 20;
		int k = 35;
		String nome = "Arthur";
		var idade = 22;
		double salario = 4000;

		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + s + " METROS");
		System.out.printf("RESULTADO2 = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);
		
//EXERCICIO_SAIDA_DADOS_JAVA
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n");
		System.out.printf("%s, which price is $ %.2f \n", product1, price1);
		System.out.printf("%s, which price is $ %.2f \n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c \n", age, code, gender);
		System.out.println();
		System.out.printf("Measeu with eight decimal place: %f \n", measure);
		System.out.printf("Rouded (three decimal places): %.3f \n", measure) ;
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f \n ", measure );
		

	
	}

}
