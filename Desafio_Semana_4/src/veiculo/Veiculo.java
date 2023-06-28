package veiculo;

import combustivel.Combustivel;

public abstract class Veiculo  implements Movimento {

	private boolean motor;

	private boolean volante;

	private boolean carga;

	private int quantidadePassageiros;

	private int quantidadePortas;

	private int quantidadeRodas;

	private int capacidadeCargaKG;

	private Combustivel combustivel;

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public boolean isVolante() {
		return volante;
	}

	public void setVolante(boolean volante) {
		this.volante = volante;
	}

	public boolean isCarga() {
		return carga;
	}

	public void setCarga(boolean carga) {
		this.carga = carga;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}

	public int getCapacidadeCargaKG() {
		return capacidadeCargaKG;
	}

	public void setCapacidadeCargaKG(int capacidadeCargaKG) {
		this.capacidadeCargaKG = capacidadeCargaKG;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

}
