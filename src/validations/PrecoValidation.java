package validations;

import interfaces.IValidation;

public class PrecoValidation implements IValidation {

	@Override
	public boolean isValid(Object value) {

		if (value != null && value instanceof Double) {

			Double preco = (Double) value;

			return preco > 0 && preco <= 999999;
		}

		return false;
	}

}
