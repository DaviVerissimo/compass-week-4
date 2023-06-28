package veiculo;

import combustivel.Combustivel;

public class VeiculoBicicleta extends Veiculo {

	private boolean eletrica;
	private boolean temBagageiro;

	public VeiculoBicicleta(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, boolean eletrica, boolean temBagageiro) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.carga = carga;
		this.quantidadePassageiros = quantidadePassageiros;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeRodas = quantidadeRodas;
		this.capacidadeCargaKG = capacidadeCargaKG;
		this.combustivel = combustivel;
		this.eletrica = eletrica;
		this.temBagageiro = temBagageiro;
	}

	@Override
	public void mover() {
		System.out.println("Bicicleta em movimento...");
		System.out.println("Utiliza como combustivel: " + combustivel.consumir());
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