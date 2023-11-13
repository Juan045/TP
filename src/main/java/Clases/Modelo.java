package Clases;
import java.util.Date;
import java.util.*;
public class Modelo {

	private static int contadorID = 1000;
	private int idModelo;
	private String nombre;
	private Date anioFabricacion;
	private float peso;
	private int potencia;
	private Marca marca;
	private FactorModeloMarca factorActual;
	private List <FactorModeloMarca> historialFactoresModeloMarca;
	private List<Vehiculo> vehiculos;
	

	
	public Modelo(String nombre, Date anioFabricacion, float peso, int potencia,Marca marca) {
		super();
		this.idModelo= this.generarIDUnico();
		this.nombre = nombre;
		this.anioFabricacion = anioFabricacion;
		this.peso = peso;
		this.potencia = potencia;
		this.marca = marca;
		this.historialFactoresModeloMarca= new ArrayList<>();
		this.vehiculos= new ArrayList<>();
	}
	
	 public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	private synchronized int generarIDUnico() {
	        return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
	    }
	 
	public void asociarVehiculo(Vehiculo vehiculo){
		
		this.vehiculos.add(vehiculo);
		vehiculo.setModelo(this);
	}
	
	public void asociarFactorModeloMarca(FactorModeloMarca factor) {
	
		this.factorActual= factor;
		factor.setModeloTiene(this);
		
	}
	
	public FactorModeloMarca getFactorActual() {
		return factorActual;
	}

	public void setFactorActual(FactorModeloMarca factorActual) {
		this.factorActual = factorActual;
	}

	public List<FactorModeloMarca> getHistorialFactoresModeloMarca() {
		return historialFactoresModeloMarca;
	}

	public void setHistorialFactoresModeloMarca(List<FactorModeloMarca> historialFactoresModeloMarca) {
		this.historialFactoresModeloMarca = historialFactoresModeloMarca;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void cargarFactorAlHistorial(FactorModeloMarca factor) {
		
		this.historialFactoresModeloMarca.add(factor);
		factor.setModeloTuvo(this);
	}
	
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(Date anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
	
	
}
