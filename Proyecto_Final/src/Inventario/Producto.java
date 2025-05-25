package Inventario;

public class Producto {
private int IDproducto, stock;
private double precio;
private String NombreP;

public Producto(int iDproducto, int stock, double precio, String nombreP) {
	super();
	IDproducto = iDproducto;
	this.stock = stock;
	this.precio = precio;
	NombreP = nombreP;
}
public int getIDproducto() {
	return IDproducto;
}
public void setIDproducto(int iDproducto) {
	IDproducto = iDproducto;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public String getNombreP() {
	return NombreP;
}
public void setNombreP(String nombreP) {
	NombreP = nombreP;
}

}
