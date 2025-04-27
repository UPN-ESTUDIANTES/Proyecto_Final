package Productos;

public class producto {
	
	private int stock;
	private String tipo_pan,cod;
	private double precio;
	public producto(int stock, String tipo_pan, String cod, double precio) {
		super();
		this.stock = stock;
		this.tipo_pan = tipo_pan;
		this.cod = cod;
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getTipo_pan() {
		return tipo_pan;
	}
	public void setTipo_pan(String tipo_pan) {
		this.tipo_pan = tipo_pan;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
