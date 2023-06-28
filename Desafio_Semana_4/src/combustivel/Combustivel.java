package combustivel;

public abstract class Combustivel implements Consumivel {

	protected final String gasolina = "Gasolina";

	protected final String alcool = "Alcool";

	protected final String diesel = "Diesel";

	protected final String eletricidade = "Eletricidade";

	protected final String humano = "Humano";

	protected final String animal = "Animal";

	public String getGasolina() {
		return gasolina;
	}

	public String getAlcool() {
		return alcool;
	}

	public String getDiesel() {
		return diesel;
	}

	public String getEletricidade() {
		return eletricidade;
	}

	public String getHumano() {
		return humano;
	}

	public String getAnimal() {
		return animal;
	}

}
