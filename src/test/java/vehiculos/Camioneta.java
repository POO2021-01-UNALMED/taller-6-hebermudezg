package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	//float velocidadMaxima;
	//String traccion;
	public static int cantidaddeCamionetas=0;

	public Camioneta(String placa, int puertas, String nombre, double precio, float peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4x4", fabricante);
		// TODO Auto-generated constructor stub
		this.volco = volco;
		cantidaddeCamionetas = cantidaddeCamionetas + 1;
	}
	
	
	public static int getCantidaddeCamionetas() {
		return cantidaddeCamionetas;
	}
	
	



	public static void setCantidaddeCamionetas(int cantidaddeCamionetas) {
		Camioneta.cantidaddeCamionetas = cantidaddeCamionetas;
	}


	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	
	

}
