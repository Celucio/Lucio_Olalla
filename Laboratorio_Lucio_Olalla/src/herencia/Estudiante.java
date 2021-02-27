package herencia;
	
//CLASE ESTUDIANTE 

public class Estudiante extends Persona {
	
	
	private int codigoEstudiante;
	private float notaFinal;
	
	//COSNTRUCTOR
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		super(nombre, apellido, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
		
		
	}
	public void mostrarDatos() {
		System.out.println("NOMBRE:	"+	getNombre()	+	"\nAPELLIDO:"+getApellido()	+	"\nEDAD	"+getEdad()
		
				
				+"\nCODIDO DEL ESTUDIANTE:"	+ codigoEstudiante	+ "\nNOTA FINAL:"	+notaFinal);
		}
	

}
