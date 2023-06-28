package veiculo;

import combustivel.Combustivel;

public class VeiculoCharrete extends Veiculo {

	public VeiculoCharrete(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel) {
		super();
		this.setMotor(motor);
		this.setVolante(volante);
		this.setCarga(carga);
		this.setQuantidadePassageiros(quantidadePassageiros);
		this.setQuantidadePortas(quantidadePortas);
		this.setQuantidadeRodas(quantidadeRodas);
		this.setCapacidadeCargaKG(capacidadeCargaKG);
		this.setCombustivel(combustivel);
	}

	@Override
	public void mover() {
		System.out.println("Charrete em movimento...");
		System.out.println("Utiliza como combustivel: " + getCombustivel().consumir());
		DesenhoArteASCII.desenharCharrete();;
	}

}