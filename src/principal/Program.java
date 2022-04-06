package principal;

import entities.Fornecedor;
import helpers.FornecedorHelper;

public class Program {

	public static void main(String[] args) {

		//criando um objeto para a classe Fornecedor
		//vari�vel de inst�ncia
		Fornecedor fornecedor = new Fornecedor();
		
		try {
			
			fornecedor.setIdFornecedor(FornecedorHelper.lerIdFornecedor());
			fornecedor.setNome(FornecedorHelper.lerNome());
			fornecedor.setCnpj(FornecedorHelper.lerCnpj());
			
			System.out.println("\n" + fornecedor.toString());
		}
		catch(NumberFormatException e) {
			System.out.println("\nConvers�o de valor num�rico inv�lido:");
			System.out.println("Valor informado: " + e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println("\nOcorreu um erro de valida��o no preenchimento:");
			System.out.println("Aten��o: " + e.getMessage());
		}		
		catch(Exception e) {
			System.out.println("\nOcorreu um erro Fatal!");
			System.out.println("\nErro: " + e.getMessage());
		}
	}

}
