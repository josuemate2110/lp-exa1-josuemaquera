package pe.edu.upeu.lpexa1josuemaquera.entity;

public class Detalle_Pedido {
private int iddetalle_pedido;
private String precio;
private int cantidad;
private int idplatos;
private int idpedidos;
public Detalle_Pedido(int iddetalle_pedido, String precio, int cantidad, int idplatos, int idpedidos) {
	this.iddetalle_pedido = iddetalle_pedido;
	this.precio = precio;
	this.cantidad = cantidad;
	this.idplatos = idplatos;
	this.idpedidos = idpedidos;
}
public Detalle_Pedido() {
}
public int getIddetalle_pedido() {
	return iddetalle_pedido;
}
public void setIddetalle_pedido(int iddetalle_pedido) {
	this.iddetalle_pedido = iddetalle_pedido;
}
public String getPrecio() {
	return precio;
}
public void setPrecio(String precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public int getIdplatos() {
	return idplatos;
}
public void setIdplatos(int idplatos) {
	this.idplatos = idplatos;
}
public int getIdpedidos() {
	return idpedidos;
}
public void setIdpedidos(int idpedidos) {
	this.idpedidos = idpedidos;
}
}
