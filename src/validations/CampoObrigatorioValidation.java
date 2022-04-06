package validations;

import interfaces.IValidation;

public class CampoObrigatorioValidation implements IValidation {

	@Override
	public boolean isValid(Object value) {

		//verificar se o valor passado n�o � null
		//verificar se o tipo do valor passado para o m�todo � uma inst�nca de String
		if(value != null && value instanceof String) {
			
			//Converter o parametro 'value' de Object para String
			//Este processo � chamado no Java de CASTING
			String texto = (String) value;

			//retornar o resultado da valida��o do m�todo
			return texto.trim().length() > 0;
		}

		return false;		
	}
}
