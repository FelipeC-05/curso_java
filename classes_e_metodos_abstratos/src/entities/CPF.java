package entities;

public class CPF extends Contribuinte {

	private Double saude;
	
	public CPF(String name, Double rendaAnual, Double saude) {
		super(name, rendaAnual);
		this.saude = saude;
	}


	public Double getSaude() {
		return saude;
	}
	public void setSaude(Double saude) {
		this.saude = saude;
	}


	@Override
	public Double tax() {
		if(getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - saude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - saude * 0.50;
		}
	}
}
