package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHeathExpenditures() {
		return healthExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.healthExpenditures = heathExpenditures;
	}

	@Override
	public Double tax() {
		if (anualIncome < 20000) {
			return (anualIncome * 0.15) - (healthExpenditures / 2);
		}else {
			return (anualIncome * 0.25) - (healthExpenditures / 2);
		}
	}
}
