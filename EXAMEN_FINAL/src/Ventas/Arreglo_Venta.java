package Ventas;
import java.util.ArrayList;
import java.util.List;

public class Arreglo_Venta {
    private List<NuevaVenta> listaVentas = new ArrayList<>();

    public void agregarVenta(NuevaVenta venta) 
    {
            listaVentas.add(venta);
    }

    public boolean modificarVenta(String idVenta, NuevaVenta nuevaVenta) {
        for (int i = 0; i < listaVentas.size(); i++) {
            if (listaVentas.get(i).getIdVenta().equals(idVenta)) {
                listaVentas.set(i, nuevaVenta);
                return true;
            }
        }
        return false;
    }

    public int tamaño() {
        return listaVentas.size();
    }

    public NuevaVenta obtenerVenta(int index) {
        if (index >= 0 && index < listaVentas.size()) {
            return listaVentas.get(index);
        }
        return null;
    }
}
