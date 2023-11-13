package Clases;

import java.util.List;
import java.util.ArrayList;

public class Marca {

	private static int contadorID = 1000;
	private int idMarca;
	private String nombre;
	private List<Modelo> modelos;

	public Marca(String nombre) {
		super();
		this.idMarca= this.generarIDUnico();
		this.nombre = nombre;
		this.modelos = new ArrayList<>();
	}

	private synchronized int generarIDUnico() {
        return contadorID++; // Incrementamos el contador y devolvemos el nuevo valor
    }
	
	public void agregarModelo(Modelo model) {
		
		this.modelos.add(model);
		model.setMarca(this);
		
	}
	
	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
