package veiculo;

import combustivel.Combustivel;

public class VeiculoMoto extends Veiculo {

	private boolean partidaEletrica;

	public VeiculoMoto(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, boolean partidaEletrica) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.carga = carga;
		this.quantidadePassageiros = quantidadePassageiros;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeRodas = quantidadeRodas;
		this.capacidadeCargaKG = capacidadeCargaKG;
		this.combustivel = combustivel;
		this.partidaEletrica = partidaEletrica;
	}

	@Override
	public void mover() {
		System.out.println("Moto em movimento...");
		System.out.println("Utiliza como combustivel: " + combustivel.consumir());
		DesenhoArteASCII.desenharMoto();
	}

	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}

}
