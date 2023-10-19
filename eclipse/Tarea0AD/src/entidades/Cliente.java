package entidades;

public class Cliente {
	
	public Cliente(String string) {
		this.nombre=string;
	}
	private String nombre;
	private String direccion;
	private String telefono;
	private boolean suscripcion=false;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isSuscripcion() {
		return suscripcion;
	}
	public void setSuscripcion(boolean suscripcion) {
		this.suscripcion = suscripcion;
	}
	
	
}
