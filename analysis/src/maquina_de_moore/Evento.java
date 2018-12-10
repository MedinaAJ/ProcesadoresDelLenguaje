package maquina_de_moore;

public class Evento {

	private Estado estado_actual;
	private String entrada;
	// private Estado estado_siguiente;
	
	public Evento(Estado estado_actual, String entrada) {
		this.estado_actual = estado_actual;
		this.entrada = entrada;
		//this.estado_siguiente = estado_siguiente;
		
	}

	public Estado getEstado_actual() {
		return estado_actual;
	}

	public void setEstado_actual(Estado estado_actual) {
		this.estado_actual = estado_actual;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	//La idea de esta clase es crear objetos con un estado y un evento (que es la entrada),
	//de tal manera que podamos crear varios eventos para el mismo estado.
}
