package Ventas;

public class NuevaVenta {
	private String dniCliente;
    private String nombreCliente;
    private String idVenta;
    private String idProductoS;
    private int cantidad;
    	
    public NuevaVenta(String dniCliente, String nombreCliente, String idVenta, String idProductoS, int cantidad) {

		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.idVenta = idVenta;
		this.idProductoS = idProductoS;
		this.cantidad = cantidad;
	}
    


	public String getDniCliente() {
		return dniCliente;
	}



	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public String getIdVenta() {
		return idVenta;
	}



	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}



	public String getIdProductoS() {
		return idProductoS;
	}



	public void setIdProductoS(String idProductoS) {
		this.idProductoS = idProductoS;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public double calcularTotal(double precioUnitario) {
        return cantidad * precioUnitario;
    }
	    
}
