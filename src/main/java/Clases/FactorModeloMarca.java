package Clases;

import java.util.Date;

public class FactorModeloMarca {

	private static int contadorID = 1000; // Inicializamos un contador estático
	private int id_factorModeloMarca;
	private float porcentaje;
	private Date fechaInicio;
	private Date fechaFin;
	private Modelo modeloTuvo;
	private Modelo modeloTiene;

	// Constructor
	public FactorModeloMarca(float porcentaje, Date fechaInicio, Date fechaFin, Modelo modeloTiene) {
		super();
		this.id_factorModeloMarca = generarIDUnico(); // Generar ID único al instanciar la clase
		this.porcentaje = porcentaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.modeloTiene = modeloTiene;
	}

	public void asignarModeloAlHistorial(Modelo model) {
		this.modeloTuvo = model;
	}

	// Método para generar un ID único de 4 dígitos
	private synchronized int generarIDUnico() {
		return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
	}

	public int getId_factorModeloMarca() {
		return id_factorModeloMarca;
	}

	public void setId_factorModeloMarca(int id_factorModeloMarca) {
		this.id_factorModeloMarca = id_factorModeloMarca;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Modelo getModeloTuvo() {
		return modeloTuvo;
	}

	public void setModeloTuvo(Modelo modeloTuvo) {
		this.modeloTuvo = modeloTuvo;
	}

	public Modelo getModeloTiene() {
		return modeloTiene;
	}

	public void setModeloTiene(Modelo modeloTiene) {
		this.modeloTiene = modeloTiene;
	}

}
