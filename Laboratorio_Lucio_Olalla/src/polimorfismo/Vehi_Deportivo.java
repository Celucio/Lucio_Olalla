package polimorfismo;

public class Vehi_Deportivo extends Vehiculo {
	private int cilindrada;

	public Vehi_Deportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return "Deportivo [cilindrada=" + cilindrada + ", matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}

}
