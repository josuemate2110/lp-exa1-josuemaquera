package pe.edu.upeu.lpexa1josuemaquera.entity;

public class Pedidos {
private int idpedidos;
private String fecha;
private String direccion_entrega;
private int idusuario;
private String alias;
public Pedidos() {
	super();
}
public Pedidos(int idpedidos, String fecha, String direccion_entrega, int idusuario, String alias) {
	super();
	this.idpedidos = idpedidos;
	this.fecha = fecha;
	this.direccion_entrega = direccion_entrega;
	this.idusuario = idusuario;
	this.alias = alias;
}
public int getIdpedidos() {
	return idpedidos;
}
public void setIdpedidos(int idpedidos) {
	this.idpedidos = idpedidos;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getDireccion_entrega() {
	return direccion_entrega;
}
public void setDireccion_entrega(String direccion_entrega) {
	this.direccion_entrega = direccion_entrega;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}
public String getAlias() {
	return alias;
}
public void setAlias(String alias) {
	this.alias = alias;
}
}
