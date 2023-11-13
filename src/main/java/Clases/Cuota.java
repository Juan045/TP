package Clases;
public class Cuota {

	private int numeroCuota;
	private boolean pagada;
	private float monto;
	private float recargo;
	private float bonificacion;
	private int mes;
	private int anio;
	private Poliza polizaAsociada;
	private Pago pagoAsociado;

	public Cuota(int numeroCuota, boolean pagada, float monto, float recargo, float bonificacion, int mes, int anio) {
		super();
		this.numeroCuota = numeroCuota;
		this.pagada = pagada;
		this.monto = monto;
		this.recargo = recargo;
		this.bonificacion = bonificacion;
		this.mes = mes;
		this.anio = anio;
	}

	public void asociarPago(Pago p) {
		p.asociatCuota(this);
	}
	public Pago getPagoAsociado() {
		return pagoAsociado;
	}


	public void setPagoAsociado(Pago pagoAsociado) {
		this.pagoAsociado = pagoAsociado;
	}


	public void asociarPoliza(Poliza p) {
		p.asociarCuota(this);
	}

	public int getNumeroCuota() {
		return numeroCuota;
	}

	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getRecargo() {
		return recargo;
	}

	public void setRecargo(float recargo) {
		this.recargo = recargo;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Poliza getPolizaAsociada() {
		return polizaAsociada;
	}

	public void setPolizaAsociada(Poliza polizaAsociada) {
		this.polizaAsociada = polizaAsociada;
	}

}
