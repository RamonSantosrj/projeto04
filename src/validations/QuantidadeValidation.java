package validations;

import interfaces.IValidation;

public class QuantidadeValidation implements IValidation {

	@Override
	public boolean isValid(Object value) {

		if (value != null && value instanceof Integer) {

			Integer quantidade = (Integer) value;

			return quantidade >= 0 && quantidade <= 99999;
		}

		return false;
	}

}
