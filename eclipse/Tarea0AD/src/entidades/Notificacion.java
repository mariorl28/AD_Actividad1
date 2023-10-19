package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Notificacion {
	protected long id;
	protected java.time.LocalDate fecha=LocalDate.now();
	protected String mensaje;
	
	public Notificacion() {}
	public Notificacion(long id, LocalDate fecha, String mensaje) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.mensaje = mensaje;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public java.time.LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Notificacion [id=" + id + ", fecha=" + fecha.format(dtf) + ", mensaje=" + mensaje + "]";
	}
	
	
	
	
}
