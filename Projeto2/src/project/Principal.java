
package project;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import project.Ordem.massa;



public class Principal {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		{
			@SuppressWarnings("resource")
			
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("Insira seu nome:");
			String nome = in.nextLine();
			
			
			
			System.out.println("Digite o telefone: ");
			String tel = in.nextLine();
			
			System.out.println("Digite o nome da rua");
			String rua= in.nextLine();
			
			System.out.println("Digite o número da casa");
			int num =in.nextInt();
			
			System.out.println("Escolha duas massas: ");
			for (massa opções:massa.values()) {
			      System.out.println(opções);
			}
			
			@SuppressWarnings("resource")
			Scanner inn = new Scanner(System.in);
			String massa = inn.nextLine();
			System.out.println(massa + " escolhida, escolha outra");
			String massa2 = inn.nextLine();
			
			
			System.out.println("Escolha uma opção de carne: ");
			@SuppressWarnings("resource")
			Scanner im = new Scanner (System.in);
			Ordem carne = new Ordem();
			
			String meat = im.nextLine();
			
			
			
			System.out.println("Escolha três opções de acompanhamento:\n");
			
			PedidoAcompanhamento acompanhamento = new PedidoAcompanhamento();
			@SuppressWarnings("resource")
			Scanner innn = new Scanner(System.in);
			String acomp1 = innn.nextLine();
			System.out.println(acomp1 + " escolhido");
			String acomp2 = innn.nextLine();
			System.out.println(acomp2 + " escolhido");
			String acomp3 = innn.nextLine();
			
			System.out.println("Escolha uma bebida\n");
			@SuppressWarnings("resource")
			Scanner imm = new Scanner (System.in);
			Bebidas drink = new Bebidas();
			String bebida = imm.nextLine();
			
			System.out.println("O cliente deseja canudo? sim/não");
			String can = imm.nextLine();
			
		
			

				
			
			
			System.out.println("-------Dados do pedido-------\n");
			Ordem mensagem = new Ordem(nome,tel,rua,num,massa,massa2,meat,acomp1,acomp2,acomp3,bebida);
			System.out.println(mensagem);
			if (can.equalsIgnoreCase("s")|| can.equalsIgnoreCase("sim")){
				Ordem.canudo = "O usuário escolheu canudo";
				
			}
			else if (can.equalsIgnoreCase("n") || can.equalsIgnoreCase("nao") || can.equalsIgnoreCase("não") ){
				Ordem.canudo = "O cliente optou por não ter canudo";
				
			}
			else {
				throw new InputMismatchException();
			}
			System.out.println(Ordem.canudo);
		} 
		try {
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			
			int i=0;
			
			while (i==0) {
				System.out.println("Confirmar Pedido? S/N");
				String pedido = in.nextLine();

				if (pedido.equalsIgnoreCase("s")|| pedido.equalsIgnoreCase("sim")){
					System.out.println("Pedido confirmado!");
					i++;
				}
				else if (pedido.equalsIgnoreCase("n")|| pedido.equalsIgnoreCase("não")) {
					System.out.println("Pedido cancelado.");
					i++;
				}
				else {
					throw new InputMismatchException();
				}
			}
			
		}
		catch (Exception e) {
			System.out.println("Tecla não identificada");
		}
		finally {
			System.out.println("\n----Fim do programa----");
		}
	}

}
