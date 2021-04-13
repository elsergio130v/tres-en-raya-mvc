package control;

import modelo.Coordenada;
import modelo.GestionDatos;
import utiles.RespuestaColocacion;
import utiles.RespuestaTresEnRaya;

public class Controlador {
	private GestionDatos gestion;

	public Controlador() {
		super();
		gestion = new GestionDatos();
	}
	
	//void no es
	public RespuestaColocacion realizarJugada(String posicion){
		return this.gestion.realizarJugada(new Coordenada(posicion));
	}
	public RespuestaTresEnRaya comprobarTresEnRaya() {
	return this.gestion.comprobarTresEnRaya();
	}

	public String getTipoName() {
		return this.gestion.getTipoActualName();
	}

	public String getTipoAnteriorName() {
		return this.gestion.getTipoAnteriorName();
	}
	
	public RespuestaTresEnRaya comprobarTresEnRaya(String name) {
		// TODO Auto-generated method stub
		return null;
	}

//	public String getErrorName() {
//		return this.gestion.getErrorActualName();
//	}

}
