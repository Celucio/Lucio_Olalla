package abstraccion;

public abstract class Animal {
	
	//Atributos
	protected String nombre, raza, color, tamanio;

	public Animal(String nombre, String raza, String color, String tamanio) {
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamanio = tamanio;
	}
	public void ImprimirDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Raza: "+raza);
		System.out.println("Color: "+color);
		System.out.println("Tamaño: "+tamanio);
	}
	
	public abstract void imprimirInformacion();
	
	

}
