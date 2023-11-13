package Clases;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class FactorMedidasDeSeguridad {

	private static int contadorID = 1000;
	private int idFactorMedidasDeSeguridad;
	private float porcentajeGuardadoGarage;
	private float porcentajeConAlarma;
	private float porcentajeConRastreo;
	private float porcentajeConTuercas;
	private Date fechaInicio;
	private Date fechaFin;
	private List<MedidasDeSeguridad> MedidasAsociadas; // 0..*
	private Poliza polizaAsociada;
	//relacion con usuario
	
	
	
	public FactorMedidasDeSeguridad(float porcentajeGuardadoGarage, float porcentajeConAlarma,
			float porcentajeConRastreo, float porcentajeConTuercas, Date fechaInicio, Date fechaFin) {
		super();
		this.idFactorMedidasDeSeguridad= this.generarIDUnico();
		this.porcentajeGuardadoGarage = porcentajeGuardadoGarage;
		this.porcentajeConAlarma = porcentajeConAlarma;
		this.porcentajeConRastreo = porcentajeConRastreo;
		this.porcentajeConTuercas = porcentajeConTuercas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.MedidasAsociadas= new ArrayList<>();
	}

	private synchronized int generarIDUnico() {
        return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
    }
	
	public int getIdFactorMedidasDeSeguridad() {
		return idFactorMedidasDeSeguridad;
	}

	public void setIdFactorMedidasDeSeguridad(int idFactorMedidasDeSeguridad) {
		this.idFactorMedidasDeSeguridad = idFactorMedidasDeSeguridad;
	}

	public void asociarPoliza(Poliza p) {
		
		this.polizaAsociada=p;
		p.setFactorMedidasSeguridadAsociado(this);
	}
	
	public void asociarMedidaDeSeguridad(MedidasDeSeguridad ms) {
		this.MedidasAsociadas.add(ms);
		ms.setFactorMedidasDeSegAsociado(this);
	}
	
	public float getPorcentajeGuardadoGarage() {
		return porcentajeGuardadoGarage;
	}

	public void setPorcentajeGuardadoGarage(float porcentajeGuardadoGarage) {
		this.porcentajeGuardadoGarage = porcentajeGuardadoGarage;
	}

	public float getPorcentajeConAlarma() {
		return porcentajeConAlarma;
	}

	public void setPorcentajeConAlarma(float porcentajeConAlarma) {
		this.porcentajeConAlarma = porcentajeConAlarma;
	}

	public float getPorcentajeConRastreo() {
		return porcentajeConRastreo;
	}

	public void setPorcentajeConRastreo(float porcentajeConRastreo) {
		this.porcentajeConRastreo = porcentajeConRastreo;
	}

	public float getPorcentajeConTuercas() {
		return porcentajeConTuercas;
	}

	public void setPorcentajeConTuercas(float porcentajeConTuercas) {
		this.porcentajeConTuercas = porcentajeConTuercas;
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

	public List<MedidasDeSeguridad> getMedidasAsociadas() {
		return MedidasAsociadas;
	}

	public void setMedidasAsociadas(List<MedidasDeSeguridad> medidasAsociadas) {
		MedidasAsociadas = medidasAsociadas;
	}

	public Poliza getPolizaAsociada() {
		return polizaAsociada;
	}

	public void setPolizaAsociada(Poliza polizaAsociada) {
		this.polizaAsociada = polizaAsociada;
	}
	
	
}
