package polimorfismo;

public class Vehiculo {
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	//Constructor 
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;                    
		this.marca = marca;                            
		this.modelo = modelo;                          
	}
	
	//Métodos Getters y Setter
	
	public String getMatricula() {         
		return matricula;            
	}
	public void setMatricula(String matricula) {     
		this.matricula = matricula;          
	}
	public String getMarca() {           //Grupo6
		return marca;              //Grupo6
	}
	public void setMarca(String marca) {             //Grupo6
		this.marca = marca;          //Grupo6
	}
	public String getModelo() {                //Grupo6
		return modelo;                          //Grupo6
	}
	public void setModelo(String modelo) {              //Grupo6
		this.modelo = modelo;                //Grupo6
	}
	
	//Metodo toString
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]"; //Grupo6
	}

}
