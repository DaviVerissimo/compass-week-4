package veiculo;

import combustivel.Combustivel;

public class VeiculoMoto extends Veiculo {

	private boolean partidaEletrica;

	public VeiculoMoto(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, boolean partidaEletrica) {
		super();
		this.setMotor(motor);
		this.setVolante(volante);
		this.setCarga(carga);
		this.setQuantidadePassageiros(quantidadePassageiros);
		this.setQuantidadePortas(quantidadePortas);
		this.setQuantidadeRodas(quantidadeRodas);
		this.setCapacidadeCargaKG(capacidadeCargaKG);
		this.setCombustivel(combustivel);
		this.partidaEletrica = partidaEletrica;
	}

	@Override
	public void mover() {
		System.out.println("Moto em movimento...");
		System.out.println("Utiliza como combustivel: " + getCombustivel().consumir());
		DesenhoArteASCII.desenharMoto();
	}

	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}

}
