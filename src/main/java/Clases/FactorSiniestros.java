package Clases;

import java.util.Date;

public class FactorSiniestros {
	
	private static int contadorID = 1000;
	private int idFactorSiniestros;
	private float porcentajeSinSiniestros;
	private float porcentajeUnSiniestro;
	private float porcentajeDosSiniestros;
	private float porcentajeMasDeDosSiniestros;
	private Date fechaInicio;
	private Date fechaFin;
	private Poliza polizaAsociada;
	
	
	public FactorSiniestros(float porcentajeSinSiniestros, float porcentajeUnSiniestro, float porcentajeDosSiniestros,
			float porcentajeMasDeDosSiniestros, Date fechaInicio, Date fechaFin) {
		super();
		this.idFactorSiniestros= this.generarIDUnico();
		this.porcentajeSinSiniestros = porcentajeSinSiniestros;
		this.porcentajeUnSiniestro = porcentajeUnSiniestro;
		this.porcentajeDosSiniestros = porcentajeDosSiniestros;
		this.porcentajeMasDeDosSiniestros = porcentajeMasDeDosSiniestros;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}


	public void asociarPoliza(Poliza p) {
		this.polizaAsociada= p;
		p.setFactorSiniestroAsociado(this);
	}
	
	public Poliza getPolizaAsociada() {
		return polizaAsociada;
	}


	public void setPolizaAsociada(Poliza polizaAsociada) {
		this.polizaAsociada = polizaAsociada;
	}


	private synchronized int generarIDUnico() {
		return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
	}
	
	public int getIdFactorSiniestros() {
		return idFactorSiniestros;
	}



	public void setIdFactorSiniestros(int idFactorSiniestros) {
		this.idFactorSiniestros = idFactorSiniestros;
	}



	public float getPorcentajeSinSiniestros() {
		return porcentajeSinSiniestros;
	}



	public void setPorcentajeSinSiniestros(float porcentajeSinSiniestros) {
		this.porcentajeSinSiniestros = porcentajeSinSiniestros;
	}



	public float getPorcentajeUnSiniestro() {
		return porcentajeUnSiniestro;
	}



	public void setPorcentajeUnSiniestro(float porcentajeUnSiniestro) {
		this.porcentajeUnSiniestro = porcentajeUnSiniestro;
	}



	public float getPorcentajeDosSiniestros() {
		return porcentajeDosSiniestros;
	}



	public void setPorcentajeDosSiniestros(float porcentajeDosSiniestros) {
		this.porcentajeDosSiniestros = porcentajeDosSiniestros;
	}



	public float getPorcentajeMasDeDosSiniestros() {
		return porcentajeMasDeDosSiniestros;
	}



	public void setPorcentajeMasDeDosSiniestros(float porcentajeMasDeDosSiniestros) {
		this.porcentajeMasDeDosSiniestros = porcentajeMasDeDosSiniestros;
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
	
	
	
	
}
