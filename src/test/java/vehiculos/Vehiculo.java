package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	double precio;
	float peso;
	String traccion;
	Fabricante fabricante;
	
	// para contar la cantidad de vehiculos
	static int cantidaddeVehiculos = 0;
	
	public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, double precio, float peso,
			String traccion, Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		
		//cantidaddeVehiculos = cantidaddeVehiculos + 1;
	}
	
	
	// método para obtener la cantidad de vihiculos
	public static int getCantidaddeVehiculos() {
		//return getCantidaddeAtomoviles() + getCantidaddeCamionetas + getCantidaddeCamiones;
		return cantidaddeVehiculos;
	}
	
	
	// cantidad de viculos por tipo
	public String vehiculosPorTipo() {
		return	"Automovil: " + Automovil.cantidaddeAtomoviles + "\n"
				+ "Camionetas: " + Automovil.cantidaddeAtomoviles + "\n"
				+ "Camiones: " + Automovil.cantidaddeAtomoviles;
				
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
