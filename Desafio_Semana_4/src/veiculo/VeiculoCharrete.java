package veiculo;

import combustivel.Combustivel;

public class VeiculoCharrete extends Veiculo {

	public VeiculoCharrete(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.carga = carga;
		this.quantidadePassageiros = quantidadePassageiros;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeRodas = quantidadeRodas;
		this.capacidadeCargaKG = capacidadeCargaKG;
		this.combustivel = combustivel;
	}

	@Override
	public void mover() {
		System.out.println("Charrete em movimento...");
		System.out.println("Utiliza como combustivel: " + combustivel.consumir());
		DesenhoArteASCII.desenharCharrete();;
	}

}