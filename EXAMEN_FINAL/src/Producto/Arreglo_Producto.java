package Producto;
import java.util.ArrayList;


public class Arreglo_Producto 
{
	private ArrayList<Productos>ListProducto = new ArrayList<>();
	
	public void AgregarProducto(Productos pro) 
	{
		ListProducto.add(pro);
	}
	
	
	public boolean EliminarProducto(String IDPro) {
		return ListProducto.removeIf(pro -> pro.getIdProducto().equals(IDPro));
	}
	
	public Productos BuscarProducto(String IDPro ) {
		for(Productos pro : ListProducto) {
			if(pro.getIdProducto().equals(IDPro))return pro;	
		}
		return null;
	}
	public Productos BuscarProductoPorNombre(String nombre) {
	    for (Productos pro : ListProducto) {
	        if (pro.getNombreP().equalsIgnoreCase(nombre)) {
	            return pro;
	        }
	    }
	    return null;
	}
	
	public boolean ModificarProducto(String IDPro, Productos NuevoProducto) {
		for (int i = 0; i < Tamaño(); i++) {
			if (Obtener(i).getIdProducto().equals(IDPro)) {
				ListProducto.set(i, NuevoProducto);
				return true;
			}
		}
		return false;
	}
	
	public Productos Obtener(int x) {
		return ListProducto.get(x);
	}
	public int Tamaño() {
		return ListProducto.size();
	}

}
