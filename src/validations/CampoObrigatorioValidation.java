package validations;

import interfaces.IValidation;

public class CampoObrigatorioValidation implements IValidation {

	@Override
	public boolean isValid(Object value) {

		//verificar se o valor passado não é null
		//verificar se o tipo do valor passado para o método é uma instânca de String
		if(value != null && value instanceof String) {
			
			//Converter o parametro 'value' de Object para String
			//Este processo é chamado no Java de CASTING
			String texto = (String) value;

			//retornar o resultado da validação do método
			return texto.trim().length() > 0;
		}

		return false;		
	}
}
