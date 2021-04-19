package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	//int puertas;
	//float velocidadMaxima;
	//String traccion;
	public static int cantidaddeAtomoviles = 0;

	public Automovil(String placa, String nombre, double precio, float peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidaddeAtomoviles = cantidaddeAtomoviles + 1;
		
	}
	
	
	public static int getCantidaddeAtomoviles() {
		return cantidaddeAtomoviles;
	}



	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	@Override
	public String toString() {
		return "Automovil [puestos=" + puestos + ", placa=" + placa + ", puertas=" + puertas + ", velocidadMaxima="
				+ velocidadMaxima + ", nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + ", traccion="
				+ traccion + ", fabricante=" + fabricante + ", getPuestos()=" + getPuestos() + ", getPlaca()="
				+ getPlaca() + ", getPuertas()=" + getPuertas() + ", getVelocidadMaxima()=" + getVelocidadMaxima()
				+ ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getPeso()=" + getPeso()
				+ ", getTraccion()=" + getTraccion() + ", getFabricante()=" + getFabricante() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
