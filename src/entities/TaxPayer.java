package entities;

public abstract class  TaxPayer {
	
	protected String name;
	protected Double anualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallIncome() {
		return anualIncome;
	}

	public void setAnuallIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name +": $ ");
		sb.append(String.format("%.2f",tax()));
		
		return sb.toString();
	}
}
