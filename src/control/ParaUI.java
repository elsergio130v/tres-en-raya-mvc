package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import utiles.RespuestaColocacion;
import utiles.RespuestaTresEnRaya;
import vista.UI;

public class ParaUI extends UI {
	private ActionListener acctionListener;
	private Controlador control;

	public ParaUI() {
		super();
		this.preparameEsaBotonera();
		control = new Controlador();
	}

	private void preparameEsaBotonera() {
		// Si dos acciones est�n vinculadas secuencialmente
		// deben estar en su propio metodo
		this.crearActionListenerParaBotones();
		this.addEventosALaBotonera();
	}

	private void finalizaJuego() {

		this.paraBotonera();
	}

	private void crearActionListenerParaBotones() {
		this.acctionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// objeto componente que dispara el evento
				JButton boton = (JButton) e.getSource();
				String[] split = boton.getName().split(":");
//				System.out.println("posicion x" + split[0]);
//				System.out.println("posicion y" + split[1]);
				// llegare aqui cuando alguien hay pulsado un boton
//				de la botonera
				RespuestaColocacion respuestaColocacion = control.realizarJugada(boton.getName());
				if (respuestaColocacion.isRespuesta()) {
					// si estoy aqui es porque ha habido un cambio
					// por lo tanto debo mostrarlo
					boton.setText(respuestaColocacion.getTipo().getNombre());
				}
				lblMensaje.setText(respuestaColocacion.getMensaje());
				RespuestaTresEnRaya respuestaTresEnRaya = control.comprobarTresEnRaya();
				if (respuestaTresEnRaya.isTresEnRaya()) {
					lblMensaje.setText(respuestaTresEnRaya.getMensaje());
					finalizaJuego();
				}

			};
		};
	}

	private void addEventosALaBotonera() {
		Component[] bartolo = this.botonera.getComponents();
		// os presento, otra vez, a la estructura foreach
		for (Component component : bartolo) {
			((JButton) component).addActionListener(this.acctionListener);
		}

	}

	private void paraBotonera() {
		Component[] bartolo = this.botonera.getComponents();
		// os presento, otra vez, a la estructura foreach
		for (Component component : bartolo) {
			((JButton) component).setEnabled(false);
		}

	}

}
