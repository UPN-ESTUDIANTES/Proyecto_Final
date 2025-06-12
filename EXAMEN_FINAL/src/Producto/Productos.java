package Producto;

public class Productos {
	    private String IdProducto;
	    private String NombreP;
	    private int stock;
	    private double precio;
		public Productos(String idProducto, String nombreP, int stock, double precio) {
			IdProducto = idProducto;
			NombreP = nombreP;
			this.stock = stock;
			this.precio = precio;
		}
		public String getIdProducto() {
			return IdProducto;
		}
		public String setIdProducto(String idProducto) {
			return IdProducto = idProducto;
		}
		public String getNombreP() {
			return NombreP;
		}
		public void setNombreP(String nombreP) {
			NombreP = nombreP;
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
		
	    
		
}
