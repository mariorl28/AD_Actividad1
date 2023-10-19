package entidades;

import java.time.LocalDate;

public class NEmail extends Notificacion {
	
	private String email;

	public NEmail() {
		// TODO Auto-generated constructor stub
	}

	public NEmail(long id, LocalDate fecha, String mensaje, String email) {
		super(id, fecha, mensaje);
		this.email=email;
		// TODO Auto-generated constructor stub
	}
	
	
	public String getEmail() {
		return email;
	}
	

	

	@Override
	public String toString() {
		return "NEmail [email=" + email + ", toString()=" + super.toString() + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public NEmail(Notificacion n,String email) {
		this.id=n.id;
		this.fecha=n.fecha;
		this.mensaje=n.mensaje;
		this.email=email;
		
	}

}
