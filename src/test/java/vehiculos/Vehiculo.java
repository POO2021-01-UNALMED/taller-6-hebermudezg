package vehiculos;
import java.util.Collections;
import java.util.LinkedList;

public class Vehiculo {
	public static LinkedList<Pais> paises = new LinkedList<Pais>();
	public static LinkedList<Fabricante> fabricantes = new LinkedList<Fabricante>();

	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	double precio;
	float peso;
	String traccion;
	Fabricante fabricante;
	
	// para contar la cantidad de vehiculos
	public static int cantidaddeVehiculos = 0;

	public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, double precio, float peso,
			String traccion, Fabricante fabricante) {
	
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		fabricantes.add(fabricante);
		paises.add(fabricante.pais); // GUARDANDO LOS PAISES
		cantidaddeVehiculos = cantidaddeVehiculos + 1;
	}

	public Pais paisMasVendedor() { // pais1 [colombia], pais2[venezuela], ... = 5
		int mayor = 0;
		int item = 0;
		for(int i =0; i < paises.size(); i++) {
			int contador = 0;
			for(int j = i +1 ; j < paises.size(); i++) {
				if(paises.get(i).nombre.equals(paises.get(j).nombre)) {
					contador +=1;					
				}
			}
			
			if(contador > mayor ) {
				mayor  = contador;
				item = i;
			}
		}
		return paises.get(item);
	}

	public Fabricante abricaMayorVentas() { // pais1 [colombia], pais2[venezuela], ... = 5
		int mayor = 0;
		int item = 0;
		for(int i =0; i < fabricantes.size(); i++) {
			int contador = 0;
			for(int j = i +1 ; j < fabricantes.size(); i++) {
				if(fabricantes.get(i).nombre.equals(fabricantes.get(j).nombre)) {
					contador +=1;					
				}
			}
			
			if(contador > mayor ) {
				mayor  = contador;
				item = i;
			}
		}
		return fabricantes.get(item);

	}

	// método para obtener la cantidad de vihiculos
	public static int getCantidadVehiculos() {
		// return getCantidaddeAtomoviles() + getCantidaddeCamionetas +
		// getCantidaddeCamiones;
		return cantidaddeVehiculos;
	}
	
	
	public static void setCantidaddeVehiculos(int cantidaddeVehiculos) {
		Vehiculo.cantidaddeVehiculos = cantidaddeVehiculos;
	}

	// cantidad de viculos por tipo
	public String vehiculosPorTipo() {
		return 
				"Automoviles: " + Automovil.cantidaddeAtomoviles
				+ "Camionetas: " + Camioneta.cantidaddeCamionetas
				+ "Camiones: " + Camion.cantidaddeCamiones;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
