package helpers;

import javax.swing.JOptionPane;

import validations.CampoObrigatorioValidation;
import validations.IdentificadorValidation;
import validations.MaximoDeCaracteresValidation;
import validations.MinimoDeCaracteresValidation;

/*
 * Classe auxiliar para entrada de dados de fornecedor
 */
public class FornecedorHelper {
	
	//método para ler e retornar o id do fornecedor
	public static Integer lerIdFornecedor() {
		
		Integer idFornecedor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID do fornecedor:"));
		
		IdentificadorValidation identificadorValidation = new IdentificadorValidation();
		if(!identificadorValidation.isValid(idFornecedor))
			throw new IllegalArgumentException("O ID informado é inválido!");

		return idFornecedor;
	}

	//método para ler e retornar o nome do fornecedor
	public static String lerNome() {
		
		String nome = JOptionPane.showInputDialog("Entre com o nome do fornecedor:");
		
		CampoObrigatorioValidation campoObrigatorioValidation = new CampoObrigatorioValidation();
		if(!campoObrigatorioValidation.isValid(nome))
			throw new IllegalArgumentException("Por favor, informe o nome do fornecedor!");
		
		MinimoDeCaracteresValidation minimoDeCaracteresValidation = new MinimoDeCaracteresValidation();
		if(!minimoDeCaracteresValidation.isValid(nome))
			throw new IllegalArgumentException("Por favor, informe no mínimo 6 caracteres!");
		
		MaximoDeCaracteresValidation maximoDeCaracteresValidation = new MaximoDeCaracteresValidation();
		if(!maximoDeCaracteresValidation.isValid(nome))
			throw new IllegalArgumentException("Por favor, informe no máximo 100 caracteres!");
		
		return nome;
	}
	
	//método para ler e retornar o cnpj do fornecedor
	public static String lerCnpj() {
		
		String cnpj = JOptionPane.showInputDialog("Entre com o CNPJ do fornecedor:");
		
		CampoObrigatorioValidation campoObrigatorioValidation = new CampoObrigatorioValidation();
		if(!campoObrigatorioValidation.isValid(cnpj))
			throw new IllegalArgumentException("Por favor, informe o cnpj do fornecedor!");
		
		return cnpj;
	}
}