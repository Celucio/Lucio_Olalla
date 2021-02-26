package abstraccion;

public class Perro extends Animal {
	
	//Atributo 
	private final String croquetas_Marca;

	
	public Perro(String nombre, String raza, String color, String tamanio, String croquetas_Marca) {
		super(nombre, raza, color, tamanio);
		this.croquetas_Marca = croquetas_Marca;
	}

	@Override
	public void imprimirInformacion() {
		System.out.println("El perro come croquetas de la marca : "+croquetas_Marca);
	}

}
