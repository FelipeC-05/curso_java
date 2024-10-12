package entities;

public class CNPJ extends Contribuinte {

	private int quantFuncionarios;
	
	public CNPJ(){
	}
	
	
	public CNPJ(String name, Double rendaAnual, int quantFuncionarios) {
		super(name, rendaAnual);
		this.quantFuncionarios = quantFuncionarios;
	}
	
	public int getQuantFuncionarios() {
		return quantFuncionarios;
	}

	public void setQuantFuncionarios(int quantFuncionarios) {
		this.quantFuncionarios = quantFuncionarios;
	}


	@Override
	public Double tax() {
		if (getQuantFuncionarios() > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}
	
}
