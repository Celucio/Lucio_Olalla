package encapsulamiento;

import java.util.ArrayList;

public class Frutas {

	 public static void main(String[] args)
	  {
	    Fruta fruta = new Fruta();
	    fruta.getFruits().add("Cereza");
	    System.out.print(fruta.getFruits());
	  }
	}
	class Fruta
	{
	  private ArrayList<String>frutas;
	  {
		  frutas = new ArrayList<>();
		  frutas.add("Sandia");
		  frutas.add("Manzana");
		  frutas.add("Mango");
	  }
	   
	  public ArrayList<String> getFruits()
	  {
	    //Reemplazo
	    return frutas;
	  }
}
