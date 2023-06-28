package veiculo;

import combustivel.Combustivel;

public class VeiculoCaminhao extends Veiculo {

	private int quantidadeEixos;

	public VeiculoCaminhao(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, int quantidadeEixos) {
		super();
		this.setMotor(motor);
		this.setVolante(volante);
		this.setCarga(carga);
		this.setQuantidadePassageiros(quantidadePassageiros);
		this.setQuantidadePortas(quantidadePortas);
		this.setQuantidadeRodas(quantidadeRodas);
		this.setCapacidadeCargaKG(capacidadeCargaKG);
		this.setCombustivel(combustivel);
		this.quantidadeEixos = quantidadeEixos;
	}

	@Override
	public void mover() {
		System.out.println("Caminhão em movimento...");
		System.out.println("Utiliza como combustivel: " + getCombustivel().consumir());
		DesenhoArteASCII.desenharCaminhao();;
	}

	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}

}