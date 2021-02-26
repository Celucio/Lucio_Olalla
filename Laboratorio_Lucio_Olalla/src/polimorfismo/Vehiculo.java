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
	public String getMarca() {        
		return marca;           
	}
	public void setMarca(String marca) {             
		this.marca = marca;       
	}
	public String getModelo() {                
		return modelo;                  
	}
	public void setModelo(String modelo) {             
		this.modelo = modelo;               
	}
	
	//Metodo toString
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
