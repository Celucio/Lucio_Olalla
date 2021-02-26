package polimorfismo;

public class Vehi_Camioneta extends Vehiculo {
	
	private int nPuertas;
	 public Vehi_Camioneta(String matricula, String marca, String modelo, int nPuertas) {
			super(matricula, marca, modelo);
			this.nPuertas = nPuertas;
		}
	public int getnPuertas() {
		return nPuertas;
	}
	@Override
	public String toString() {
		return "Camionetas [nPuertas=" + nPuertas + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	}

}
