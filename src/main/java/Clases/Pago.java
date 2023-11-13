package Clases;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Pago {

	private static int contadorID = 1000;
	private int idPago;
	private int numeroRecibo;
	private Date fecha;
	private float premio;
	private float monto;
	private List<Cuota> cuotasAsociadas;
	
	public Pago(int numeroRecibo, Date fecha, float premio, float monto) {
		super();
		this.cuotasAsociadas= new ArrayList<>();
		this.idPago= this.generarIDUnico();
		this.numeroRecibo = numeroRecibo;
		this.fecha = fecha;
		this.premio = premio;
		this.monto = monto;
	}

	public void asociatCuota(Cuota c) {
		if(!this.cuotasAsociadas.contains(c)) {
			this.cuotasAsociadas.add(c);
			c.setPagoAsociado(this);
		}
	}
	private synchronized int generarIDUnico() {
        return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
    }
	
	public int getIdPago() {
		return idPago;
	}

	public int getNumeroRecibo() {
		return numeroRecibo;
	}

	public void setNumeroRecibo(int numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getPremio() {
		return premio;
	}

	public void setPremio(float premio) {
		this.premio = premio;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	
}
