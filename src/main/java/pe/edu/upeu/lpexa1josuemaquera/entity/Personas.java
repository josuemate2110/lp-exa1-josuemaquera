package pe.edu.upeu.lpexa1josuemaquera.entity;

public class Personas {
private int idpersonas;
private String nombres;
private String correo;
private String telefono;
public Personas(int idpersonas, String nombres, String correo, String telefono) {
	this.idpersonas = idpersonas;
	this.nombres = nombres;
	this.correo = correo;
	this.telefono = telefono;
}
public Personas() {
}
public int getIdpersonas() {
	return idpersonas;
}
public void setIdpersonas(int idpersonas) {
	this.idpersonas = idpersonas;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
}
