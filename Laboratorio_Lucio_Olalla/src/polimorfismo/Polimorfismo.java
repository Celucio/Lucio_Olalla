package polimorfismo;

import polimorfismo.Vehi_Camioneta;
import polimorfismo.Vehi_Deportivo;
import polimorfismo.Vehiculo;

public class Polimorfismo {
    
	public static void main(String[] args) {

		Vehiculo tVehiculo[] = new Vehiculo[3];
		
		tVehiculo[0] = new Vehiculo("PSQ12", "KIA", "A34");
		tVehiculo[1] = new Vehi_Camioneta("AS45", "Hyndai", "J67", 4);
		tVehiculo[2] = new Vehi_Deportivo("GBH12", "Lamborguini", "E43", 2000);
		
		for(Vehiculo vehiculo : tVehiculo) {
			System.out.println(vehiculo.toString());
			
		}
	}

}
