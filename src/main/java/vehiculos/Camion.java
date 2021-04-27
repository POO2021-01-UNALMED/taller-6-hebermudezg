package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;
	//int puertas; 2
	//float velocidadMaxima; 80
	//String traccion; "4x2"
	public static int cantidaddeCamiones=0;
	
	public Camion(String placa, String nombre, double precio, float peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		// TODO Auto-generated constructor stub		
		this.ejes = ejes;
		cantidaddeCamiones = cantidaddeCamiones + 1;
	}
	
	
	public static int getCantidadCamiones() {
		return cantidaddeCamiones;
	}
	
	
	public static void setCantidadCamiones(int cantidaddeCamiones) {
		Camion.cantidaddeCamiones = cantidaddeCamiones;
	}


	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}


	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + "]";
	}
	
	
	
	

}
