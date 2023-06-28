package veiculo;

import combustivel.Combustivel;

public class VeiculoCaminhao extends Veiculo {

	private int quantidadeEixos;

	public VeiculoCaminhao(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, int quantidadeEixos) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.carga = carga;
		this.quantidadePassageiros = quantidadePassageiros;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeRodas = quantidadeRodas;
		this.capacidadeCargaKG = capacidadeCargaKG;
		this.combustivel = combustivel;
		this.quantidadeEixos = quantidadeEixos;
	}

	@Override
	public void mover() {
		System.out.println("Caminhão em movimento...");
		System.out.println("Utiliza como combustivel: " + combustivel.consumir());
		DesenhoArteASCII.desenharCaminhao();;
	}

	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}

}