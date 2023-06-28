package veiculo;

import combustivel.Combustivel;

public class VeiculoBicicleta extends Veiculo {

	private boolean eletrica;
	private boolean temBagageiro;

	public VeiculoBicicleta(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, boolean eletrica, boolean temBagageiro) {
		super();
		this.setMotor(motor);
		this.setVolante(volante);
		this.setCarga(carga);
		this.setQuantidadePassageiros(quantidadePassageiros);
		this.setQuantidadePortas(quantidadePortas);
		this.setQuantidadeRodas(quantidadeRodas);
		this.setCapacidadeCargaKG(capacidadeCargaKG);
		this.setCombustivel(combustivel);
		this.eletrica = eletrica;
		this.temBagageiro = temBagageiro;
	}

	@Override
	public void mover() {
		System.out.println("Bicicleta em movimento...");
		System.out.println("Utiliza como combustivel: " + getCombustivel().consumir());
		DesenhoArteASCII.desenharBicicleta();;
	}

	public boolean isEletrica() {
		return eletrica;
	}

	public void setEletrica(boolean eletrica) {
		this.eletrica = eletrica;
	}

	public boolean isTemBagageiro() {
		return temBagageiro;
	}

	public void setTemBagageiro(boolean temBagageiro) {
		this.temBagageiro = temBagageiro;
	}

}