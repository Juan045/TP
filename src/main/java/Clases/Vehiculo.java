package Clases;

public class Vehiculo {

	// este es un comentario
	 private static int contadorID = 1000;
	private int IdVehiculo;
	private String patente;
	private String motor;
	private String chasis;
	private int kilometraje;
	private Modelo modelo;
	private MedidasDeSeguridad medidasSeg;
	private Poliza polizaAsociada;
	


	public Vehiculo(String patente, String motor, String chasis, int kilometraje, Modelo modelo) {
		super();
		this.IdVehiculo= this.generarIDUnico();
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.kilometraje = kilometraje;
		this.modelo = modelo;
	
	}

	public void asociarMedSeg(MedidasDeSeguridad ms) {
		this.medidasSeg=ms;
		ms.setVehiculoAsociado(this);
	}
	
	private synchronized int generarIDUnico() {
        return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
    }
	
	public void asociarPoliza(Poliza p) {
		
		this.polizaAsociada= p;
		p.setVehiculoAsociado(this);
	}
	
	
	public int getKilometraje() {
		return kilometraje;
	}



	public int getIdVehiculo() {
		return IdVehiculo;
	}


	public void setIdVehiculo(int idVehiculo) {
		IdVehiculo = idVehiculo;
	}


	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}



	public Poliza getPolizaAsociada() {
		return polizaAsociada;
	}



	public void setPolizaAsociada(Poliza polizaAsociada) {
		this.polizaAsociada = polizaAsociada;
	}



	public Modelo getModelo() {
		return modelo;
	}



	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}



	public MedidasDeSeguridad getMedidasSeg() {
		return medidasSeg;
	}



	public void setMedidasSeg(MedidasDeSeguridad medidasSeg) {
		this.medidasSeg = medidasSeg;
	}



	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

}
