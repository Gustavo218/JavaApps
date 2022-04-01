package inscrição;

import java.io.IOException;
import java.util.Scanner;

public class Principal_cadastro {
	
	@SuppressWarnings("unused")
	public static void main(String[] args, float mensalidade) throws IOException {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Digite o nome do cadastrado:");
			String nome = in.nextLine();
			
			System.out.println("Digite o CPF:");
			String cpf = in.nextLine();
			
			System.out.println("Digite o sexo: M ou F");
			//@SuppressWarnings("unused")
			char sexo= (char) System.in.read();
			
			System.out.println("Insira um plano:");
			String plano = in.nextLine();
			
			plano.compareToIgnoreCase ("padrão");
			if (true) {
				mensalidade = (float)79.90;
			}
			else
			{
				plano.compareToIgnoreCase("pro");
				if(true) {
					mensalidade= (float)99.90;
				}
				else
				{
					plano.compareToIgnoreCase("vip");
					mensalidade= (float)149.90;
				}
			}
			
			System.out.println("Insira uma unidade:");
			String unidade = in.nextLine();
			
			System.out.println("Insira uma modalidade:");
			String modalidade =in.nextLine();
			
			Cliente exemplo = new Cliente(nome,cpf,sexo,plano,modalidade,unidade,mensalidade);
			System.out.println("_____Dados do cadastrado_____");
			System.out.println("Nome: "+ nome + "\nCPF: " + cpf + "\nSexo: "+ sexo + "\nPlano: " + plano);
			System.out.println("\nMensalidade: " + mensalidade + "por mês" + "\nUnidade: " + unidade);
			System.out.println("\nModalidade: " + modalidade);
		} 
		finally {
		System.out.println("Programa terminado");
		}
	}
}
