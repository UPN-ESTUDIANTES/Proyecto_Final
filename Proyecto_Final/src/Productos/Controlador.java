package Productos;

import java.util.ArrayList;

public class Controlador {
	
	private ArrayList <producto> listaProducto = new ArrayList <>();
	
	public void agregarproducto (producto p)
	{
		listaProducto.add(p);
	}
	
	public boolean eliminarProducto(String cod)
	{
		return listaProducto.removeIf(p -> p.getCod()==cod);
	}
	
	public producto buscarProducto(String cod)
	{
		 for (producto p : listaProducto)
		 {
	            if (p.getCod() == cod) 
	            {
	                return p;
	            }
		 }
		 return null;
	}
	
	public boolean modificarProducto(String cod, producto nuevoProducto) {
        for (int i = 0; i < listaProducto.size(); i++)
        {
            if (listaProducto.get(i).getCod() == cod) 
            {
                listaProducto.set(i, nuevoProducto);
                return true;
            }
        }
        return false;
	    }
	
	public ArrayList<producto> listarProductos() {
	    return listaProducto;
	}

}
