package entities;

import java.util.Date;

public class Comentario {
	
	private String texto;
	private Date momentoComent;

	
	public Comentario(String texto, Date momentoComent) {
		super();
		this.texto = texto;
		this.momentoComent = momentoComent;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Date getMomentoComent() {
		return momentoComent;
	}


	public void setMomentoComent(Date momentoComent) {
		this.momentoComent = momentoComent;
	}
	
}
