package Inventario;

import java.util.ArrayList;

public class Controlador{
private ArrayList<Producto>ListProducto = new ArrayList<>();
public void AgregarProducto(Producto pro) {
	ListProducto.add(pro);
}
public boolean EliminarProducto(int IDPro) {
	return ListProducto.removeIf(pro -> pro.getIDproducto()==IDPro);
}
public Producto BuscarProducto(int IDPro) {
	for(Producto pro : ListProducto) {
		if(pro.getIDproducto()==IDPro) {
			return pro;
		}
	}
	return null;
}
public boolean ModificarProducto(int IDPro, Producto NuevoProducto) {
	for (int i = 0; i < ListProducto.size(); i++) {
		if (ListProducto.get(i).getIDproducto()==IDPro) {
			ListProducto.set(i, NuevoProducto);
			return true;
		}
	}
	return false;
}
public Producto Obtener(int x) {
	return ListProducto.get(x);
}
public int Tamaño() {
	return ListProducto.size();
}
public ArrayList<Producto> MostrarProductos() {
	return ListProducto;
}
}
