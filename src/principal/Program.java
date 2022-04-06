package principal;

import entities.Fornecedor;
import helpers.FornecedorHelper;

public class Program {

	public static void main(String[] args) {

		//criando um objeto para a classe Fornecedor
		//variável de instância
		Fornecedor fornecedor = new Fornecedor();
		
		try {
			
			fornecedor.setIdFornecedor(FornecedorHelper.lerIdFornecedor());
			fornecedor.setNome(FornecedorHelper.lerNome());
			fornecedor.setCnpj(FornecedorHelper.lerCnpj());
			
			System.out.println("\n" + fornecedor.toString());
		}
		catch(NumberFormatException e) {
			System.out.println("\nConversão de valor numérico inválido:");
			System.out.println("Valor informado: " + e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println("\nOcorreu um erro de validação no preenchimento:");
			System.out.println("Atenção: " + e.getMessage());
		}		
		catch(Exception e) {
			System.out.println("\nOcorreu um erro Fatal!");
			System.out.println("\nErro: " + e.getMessage());
		}
	}

}
