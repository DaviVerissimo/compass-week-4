package viewer;

import combustivel.Combustivel;
import combustivel.CombustivelAlcool;
import combustivel.CombustivelAnimal;
import combustivel.CombustivelDiesel;
import combustivel.CombustivelEletricidade;
import combustivel.CombustivelGasolina;
import combustivel.CombustivelHumano;
import veiculo.Veiculo;
import veiculo.VeiculoBicicleta;
import veiculo.VeiculoCaminhao;
import veiculo.VeiculoCarro;
import veiculo.VeiculoCharrete;
import veiculo.VeiculoMoto;

public class Application {

	public static void main(String[] args) {

		Combustivel combustivelAlcool = new CombustivelAlcool();
		Combustivel combustivelDiesel = new CombustivelDiesel();
		Combustivel combustivelEletricidade = new CombustivelEletricidade();
		Combustivel combustivelGasolina = new CombustivelGasolina();
		Combustivel combustivelHumano = new CombustivelHumano();
		Combustivel combustivelAnimal = new CombustivelAnimal();

		Veiculo veiculoBicicleta = new VeiculoBicicleta(false, true, false, 3, 6, 9, 12, combustivelHumano, true, false);
		Veiculo veiculoCaminhao = new VeiculoCaminhao(true, false, true, 6, 3, 12, 9, combustivelDiesel, 320);
		Veiculo veiculoCarro = new VeiculoCarro(true, false, false, 12, 9, 6, 8, combustivelEletricidade, false, true);
		Veiculo veiculoCarro2 = new VeiculoCarro(true, false, false, 12, 9, 6, 8, combustivelGasolina, false, true);
		Veiculo veiculoMoto = new VeiculoMoto(false, false, false, 9, 5, 4, 2, combustivelAlcool, false);
		Veiculo veiculoCharrete = new VeiculoCharrete(false, true, false, 13, 12, 11, 10, combustivelAnimal);
		
		veiculoBicicleta.mover();
		veiculoCaminhao.mover();
		veiculoCarro.mover();
		veiculoCarro2.mover();
		veiculoMoto.mover();
		veiculoCharrete.mover();
	}

}
