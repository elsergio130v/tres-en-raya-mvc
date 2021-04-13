package utiles;

import modelo.Tipo;

public class RespuestaTresEnRaya {
	private boolean tresEnRaya;
	private String mensaje;
	private Tipo tipo;

	public RespuestaTresEnRaya(boolean tresEnRaya, String mensaje, Tipo tipo) {
		super();
		this.tresEnRaya = tresEnRaya;
		this.mensaje = mensaje;
		this.tipo = tipo;
	}

	public RespuestaTresEnRaya() {
		super();
	}

	public boolean isTresEnRaya() {
		return this.tresEnRaya;
	}

	public void setTresEnRaya(boolean tresEnRaya) {
		this.tresEnRaya = tresEnRaya;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public RespuestaTresEnRaya(boolean tresEnRaya, String mensaje) {
		super();
		this.tresEnRaya = tresEnRaya;
		this.mensaje = mensaje;
	}

}
