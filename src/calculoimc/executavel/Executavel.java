package calculoimc.executavel;

import calculoimc.classes.Cliente;
import java.util.List;
import java.util.ArrayList;
import calculoimc.classes.ProfissionalEducacaoFisica;
import java.util.Date;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String args[]) {
		ProfissionalEducacaoFisica profissionaleducacaofisica = new ProfissionalEducacaoFisica();
		String login = JOptionPane.showInputDialog("Digite o login");
		String senha = JOptionPane.showInputDialog("Digite o senha");
		profissionaleducacaofisica.setLogin(login);
		profissionaleducacaofisica.setSenha(senha);
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		if(profissionaleducacaofisica.autenticar()) {
		int inserirCliente = JOptionPane.showConfirmDialog(null, "Deseja inserir um novo cliente?");

		if (inserirCliente == 0) {
			String qtde = JOptionPane.showInputDialog("Quantos clientes voce deseja inserir?");
			int qtde2 = (Integer.valueOf(qtde));
			for (int prox = 1; prox <= qtde2; prox++) {
				Cliente cliente = new Cliente();
				String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
				String idade = JOptionPane.showInputDialog("Digite a idade do cliente");
				String cpf = JOptionPane.showInputDialog("Digite a cpf do cliente");
				String registroGeral = JOptionPane.showInputDialog("Digite a registro geral do cliente");

				cliente.setNome(nome);
				cliente.setIdade(Integer.valueOf(idade));
				cliente.setCpf(cpf);
				cliente.setRegistroGeral(registroGeral);
				String altura = JOptionPane.showInputDialog("Digite a altura do cliente " + nome);
				String peso = JOptionPane.showInputDialog("Digite o peso do cliente " + nome);
				cliente.setAltura(Float.valueOf(altura));
				cliente.setPeso(Float.valueOf(peso));
				clientes.add(cliente);
			}
			String opcaoExercicio = JOptionPane.showInputDialog("Os clientes realizaram os exames médicos necessários? "
					+ "\n 1 - Para Sim \n 2 - Para Não \n 3 - Para Inserir Uma Justificativa");
			
			switch(opcaoExercicio){
			case "1":
				for (Cliente percorreClienteExercicio : clientes) {
					if(percorreClienteExercicio.tabelaImc().equals("Obsidade classe II")) {
						JOptionPane.showMessageDialog(null, "Exercícios de baixo impacto, como natação ou ciclismo em piscina.");
								}else if(percorreClienteExercicio.tabelaImc().equals("Obsidade classe I")) {
									JOptionPane.showMessageDialog(null, percorreClienteExercicio.getNome()+"\n Exercícios de baixo impacto, como natação ou ciclismo em piscina.");
								}else if(percorreClienteExercicio.tabelaImc().equals("Excesso de peso")) {
									JOptionPane.showMessageDialog(null, percorreClienteExercicio.getNome()+"\n Treinamento cardiovascular combinado com treinamento de força. ");
								}else if(percorreClienteExercicio.tabelaImc().equals("Peso normal")){
									JOptionPane.showMessageDialog(null, percorreClienteExercicio.getNome()+"\n Corrida ou treinamento intervalado de alta intensidade (HIIT).");
								}else if(percorreClienteExercicio.tabelaImc().equals("Abaixo do peso normal")) {
									JOptionPane.showMessageDialog(null, percorreClienteExercicio.getNome()+"\n Corrida ou treinamento intervalado de alta intensidade (HIIT). ");						}
					}
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "Pesa para o cliente realizar os exames necessários e retornar um outro dia com exames em mãos");
				String opcaoExercicio2 = JOptionPane.showInputDialog("Os clientes realizaram os exames médicos necessários? "
						+ "\n 1 - Para Sim \n 2 - Para Justificar");
				switch(opcaoExercicio2){
				case "1":
					for (Cliente percorreClienteExercicio2 : clientes) {
						if(percorreClienteExercicio2.tabelaImc().equals("Obsidade classe II")) {
							JOptionPane.showMessageDialog(null, "Exercícios de baixo impacto, como natação ou ciclismo em piscina.");
									}else if(percorreClienteExercicio2.tabelaImc().equals("Obsidade classe I")) {
										JOptionPane.showMessageDialog(null, percorreClienteExercicio2.getNome()+"\n Exercícios de baixo impacto, como natação ou ciclismo em piscina.");
									}else if(percorreClienteExercicio2.tabelaImc().equals("Excesso de peso")) {
										JOptionPane.showMessageDialog(null, percorreClienteExercicio2.getNome()+"\n Treinamento cardiovascular combinado com treinamento de força. ");
									}else if(percorreClienteExercicio2.tabelaImc().equals("Peso normal")){
										JOptionPane.showMessageDialog(null, percorreClienteExercicio2.getNome()+"\n Corrida ou treinamento intervalado de alta intensidade (HIIT).");
									}else if(percorreClienteExercicio2.tabelaImc().equals("Abaixo do peso normal")) {
										JOptionPane.showMessageDialog(null, percorreClienteExercicio2.getNome()+"\n Corrida ou treinamento intervalado de alta intensidade (HIIT). ");						}
						}
					break;
				case"2":
					JOptionPane.showMessageDialog(null, "Encaminhe para recepcionista realizar a justificativa");
					break;
				}
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Encaminhe para recepcionista realizar a justificativa");
				break;
			default:
				
				JOptionPane.showMessageDialog(null, "Opção inválida!!!");
			}
			
			for (Cliente percorreCliente : clientes) {
				System.out.println(percorreCliente + " " + " imc " + percorreCliente.calculoImc()
						+ " o cliente está com: " + percorreCliente.tabelaImc());
				}

			}

		}else {
			JOptionPane.showMessageDialog(null, "Login ou Senha incorretos" );
		}
	}
	
}
