package exercises.week7;

import java.io.Serializable;

public class House implements Taxable, Serializable, Cloneable{

	@Override
	public double getTaxRate() {
		
		return 18;
	}

	@Override
	public double getTaxAmount() {
		return 5000;
	}

}
