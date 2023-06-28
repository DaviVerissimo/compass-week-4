package veiculo;

import combustivel.Combustivel;

public class VeiculoCarro extends Veiculo {

	private Object possuiArCondicionado;
	private boolean possuiRadio;

	public VeiculoCarro(boolean motor, boolean volante, boolean carga, int quantidadePassageiros, int quantidadePortas,
			int quantidadeRodas, int capacidadeCargaKG, Combustivel combustivel, boolean possuiArCondicionado,
			boolean possuiRadio) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.carga = carga;
		this.quantidadePassageiros = quantidadePassageiros;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeRodas = quantidadeRodas;
		this.capacidadeCargaKG = capacidadeCargaKG;
		this.combustivel = combustivel;
		this.possuiArCondicionado = possuiArCondicionado;
		this.possuiRadio = possuiRadio;
	}

	@Override
	public void mover() {
		System.out.println("Carro em movimento...");
		System.out.println("Utiliza como combustivel: " + combustivel.consumir());
		DesenhoArteASCII.desenharCarro();;
	}

	public Object getPossuiArCondicionado() {
		return possuiArCondicionado;
	}

	public void setPossuiArCondicionado(Object possuiArCondicionado) {
		this.possuiArCondicionado = possuiArCondicionado;
	}

	public boolean isPossuiRadio() {
		return possuiRadio;
	}

	public void setPossuiRadio(boolean possuiRadio) {
		this.possuiRadio = possuiRadio;
	}

}