package Clases;
import Enumerados.EstadoPoliza;
import Enumerados.FormaDePago;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Poliza {

	private float sumaAsegurada;
	private int numeroSiniestro;
	private int kilometrosRealizadosPorAnio;
	private Date fechaInicio; 
	private EstadoPoliza estado; 
	private int numeroPoliza;
	private boolean emitida;
	private boolean propuestaRenovacion;
	private FormaDePago formaDePago;
	private FactorMedidasDeSeguridad factorMedidasSeguridadAsociado;
	private Vehiculo vehiculoAsociado;
	private FactorSiniestros factorSiniestroAsociado;
	private List<Cuota> cuotasAsociadas;
	
	public Poliza(float sumaAsegurada, int numeroSiniestro, int kilometrosRealizadosPorAnio, Date fechaInicio,
			EstadoPoliza estado, int numeroPoliza, boolean emitida, boolean propuestaRenovacion,
			FormaDePago formaDePago)
	{
		super();
		this.cuotasAsociadas= new ArrayList<>();
		this.sumaAsegurada = sumaAsegurada;
		this.numeroSiniestro = numeroSiniestro;
		this.kilometrosRealizadosPorAnio = kilometrosRealizadosPorAnio;
		this.fechaInicio = fechaInicio;
		this.estado = estado;
		this.numeroPoliza = numeroPoliza;
		this.emitida = emitida;
		this.propuestaRenovacion = propuestaRenovacion;
		this.formaDePago = formaDePago;
	}

	public void asociarCuota(Cuota c) {
		this.cuotasAsociadas.add(c);
		c.setPolizaAsociada(this);
	}
	
	public List<Cuota> getCuotasAsociadas() {
		return cuotasAsociadas;
	}

	public void setCuotasAsociadas(List<Cuota> cuotasAsociadas) {
		this.cuotasAsociadas = cuotasAsociadas;
	}

	public void asociarFactorSiniestros(FactorSiniestros fs) {
		this.factorSiniestroAsociado= fs;
		fs.setPolizaAsociada(this);
	}
	
	
	public void asociarVehiculo(Vehiculo v) {
		
		this.vehiculoAsociado=v;
		v.setPolizaAsociada(this);
		
	}
	
	public FactorSiniestros getFactorSiniestroAsociado() {
		return factorSiniestroAsociado;
	}



	public void setFactorSiniestroAsociado(FactorSiniestros factorSiniestroAsociado) {
		this.factorSiniestroAsociado = factorSiniestroAsociado;
	}



	public Vehiculo getVehiculoAsociado() {
		return vehiculoAsociado;
	}

	public void setVehiculoAsociado(Vehiculo vehiculoAsociado) {
		this.vehiculoAsociado = vehiculoAsociado;
	}

	public void asociarFactorMedidasDeSeguridad(FactorMedidasDeSeguridad fms) {
		
		this.factorMedidasSeguridadAsociado=fms;
		fms.setPolizaAsociada(this);
	}
	
	
	public FactorMedidasDeSeguridad getFactorMedidasSeguridadAsociado() {
		return factorMedidasSeguridadAsociado;
	}



	public void setFactorMedidasSeguridadAsociado(FactorMedidasDeSeguridad factorMedidasSeguridadAsociado) {
		factorMedidasSeguridadAsociado = factorMedidasSeguridadAsociado;
	}


	public float getSumaAsegurada() {
		return sumaAsegurada;
	}


	public void setSumaAsegurada(float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}


	public int getNumeroSiniestro() {
		return numeroSiniestro;
	}


	public void setNumeroSiniestro(int numeroSiniestro) {
		this.numeroSiniestro = numeroSiniestro;
	}


	public int getKilometrosRealizadosPorAnio() {
		return kilometrosRealizadosPorAnio;
	}


	public void setKilometrosRealizadosPorAnio(int kilometrosRealizadosPorAnio) {
		this.kilometrosRealizadosPorAnio = kilometrosRealizadosPorAnio;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public EstadoPoliza getEstado() {
		return estado;
	}


	public void setEstado(EstadoPoliza estado) {
		this.estado = estado;
	}


	public int getNumeroPoliza() {
		return numeroPoliza;
	}


	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}


	public boolean isEmitida() {
		return emitida;
	}


	public void setEmitida(boolean emitida) {
		this.emitida = emitida;
	}


	public boolean isPropuestaRenovacion() {
		return propuestaRenovacion;
	}


	public void setPropuestaRenovacion(boolean propuestaRenovacion) {
		this.propuestaRenovacion = propuestaRenovacion;
	}


	public FormaDePago getFormaDePago() {
		return formaDePago;
	}


	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	
	
	
}
