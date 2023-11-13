package Clases;

public class MedidasDeSeguridad {

	private static int contadorID = 1000;
	private int idMedidasDeSeguridad;
	private boolean seGuardaEnGarage;
	private boolean tieneAlarma;
	private boolean rastreoVehicular;
	private boolean tuercasAntiRobo;
	private FactorMedidasDeSeguridad factorMedidasDeSegAsociado;
	private Vehiculo vehiculoAsociado;
	
	public MedidasDeSeguridad(boolean seGuardaEnGarage, boolean tieneAlarma,
			boolean rastreoVehicular, boolean tuercasAntiRobo) {
		super();
		this.idMedidasDeSeguridad = this.generarIDUnico();
		this.seGuardaEnGarage = seGuardaEnGarage;
		this.tieneAlarma = tieneAlarma;
		this.rastreoVehicular = rastreoVehicular;
		this.tuercasAntiRobo = tuercasAntiRobo;
	}

	public void asociarVehiculo(Vehiculo v) {
		this.vehiculoAsociado=v;
		v.setMedidasSeg(this);
	}
	
	public Vehiculo getVehiculoAsociado() {
		return vehiculoAsociado;
	}

	public void setVehiculoAsociado(Vehiculo vehiculoAsociado) {
		this.vehiculoAsociado = vehiculoAsociado;
	}

	public int getIdMedidasDeSeguridad() {
		return idMedidasDeSeguridad;
	}


	public void setIdMedidasDeSeguridad(int idMedidasDeSeguridad) {
		this.idMedidasDeSeguridad = idMedidasDeSeguridad;
	}


	private synchronized int generarIDUnico() {
        return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
    }
	
	public FactorMedidasDeSeguridad getFactorMedidasDeSegAsociado() {
		return factorMedidasDeSegAsociado;
	}

	public void setFactorMedidasDeSegAsociado(FactorMedidasDeSeguridad factorMedidasDeSegAsociado) {
		this.factorMedidasDeSegAsociado = factorMedidasDeSegAsociado;
	}

	public boolean isSeGuardaEnGarage() {
		return seGuardaEnGarage;
	}
	public void setSeGuardaEnGarage(boolean seGuardaEnGarage) {
		this.seGuardaEnGarage = seGuardaEnGarage;
	}
	public boolean isTieneAlarma() {
		return tieneAlarma;
	}
	public void setTieneAlarma(boolean tieneAlarma) {
		this.tieneAlarma = tieneAlarma;
	}
	public boolean isRastreoVehicular() {
		return rastreoVehicular;
	}
	public void setRastreoVehicular(boolean rastreoVehicular) {
		this.rastreoVehicular = rastreoVehicular;
	}
	public boolean isTuercasAntiRobo() {
		return tuercasAntiRobo;
	}
	public void setTuercasAntiRobo(boolean tuercasAntiRobo) {
		this.tuercasAntiRobo = tuercasAntiRobo;
	}
	
	
	
	
}
