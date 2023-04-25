package noAr;
import tempo.Tempo;
import tempo.Tempo2;

import java.util.Scanner;

public class AeroportoMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a pista que deseja utilizar: 1 ou 2?");
		
		int opt = entrada.nextInt();
		
		System.out.println("Informe o numero de periodos que deseja simular: ");
		
		int var = entrada.nextInt(); 
		
		System.out.println("Informe o numero de aviões que deseja simular: ");
		
		int num = entrada.nextInt();
		
		Tempo x = new Tempo(var, num);
		Tempo2 y = new Tempo2(var, num);
		
		System.out.println("//////////////////////////////////////////////////////////////////");
		
		if (opt == 1) {
		x.PassaTempo();
		}
		else if (opt == 2) {
			y.PassaTempo();
		} else
			System.out.println("Valor invalido");
				
		entrada.close();
	}

}
