package Inventario;

import java.util.ArrayList;

public class ControladorI{
private ArrayList<Producto>ListProducto = new ArrayList<>();
public void AgregarProducto(Producto pro) {
	Producto proEX = BuscarProducto(pro.getIDproducto());
	if(proEX!=null) {
		proEX.setStock(proEX.getStock()+ pro.getStock());
		proEX.setPrecio(proEX.getPrecio());
	} else ListProducto.add(pro);
}
public boolean EliminarProducto(int IDPro) {
	return ListProducto.removeIf(pro -> pro.getIDproducto()==IDPro);
}
public Producto BuscarProducto(int IDPro) {
	for(Producto pro : ListProducto) {
		if(pro.getIDproducto()==IDPro)return pro;	
	}
	return null;
}
public boolean ModificarProducto(int IDPro, Producto NuevoProducto) {
	for (int i = 0; i < Tamaño(); i++) {
		if (Obtener(i).getIDproducto()==IDPro) {
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
}
