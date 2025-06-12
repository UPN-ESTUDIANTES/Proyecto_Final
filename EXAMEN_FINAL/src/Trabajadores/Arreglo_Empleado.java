
package Trabajadores;

import java.util.ArrayList;

public class Arreglo_Empleado 
{
	private ArrayList<Empleados>ListEmpleados = new ArrayList<>();
	
	public Arreglo_Empleado() {
		ListEmpleados=new ArrayList<Empleados>();
		AgregarPagoEmpleados(new Empleados("0001", "Raúl", "Administrador" , 3000 , 0, 0));
	}
	
	public void AgregarPagoEmpleados(Empleados emp) {
		ListEmpleados.add(emp);}
	
	public boolean EliminarPago(String IDemp) {
		return ListEmpleados.removeIf(emp -> emp.getIdEmpleado().equals(IDemp));
	}
	
	
	public Empleados BuscarPagoEmpleados(String IDemp) {
		for(Empleados emp : ListEmpleados) {
			if(emp.getIdEmpleado().equals(IDemp)) return emp;
		}
		return null;
	}
	
	
	public Empleados ObtenerPago(int x) {
		return ListEmpleados.get(x);
	}
	
	
	public int TamañoPago() {
		return ListEmpleados.size();
	}
	
	public boolean ModificarPago(String IDemp, Empleados NuevoPago) {
		for(int i=0; i<TamañoPago(); i++) {
			if(ObtenerPago(i).getIdEmpleado().equals(IDemp)) {
				ListEmpleados.set(i, NuevoPago);
				return true;
			}
		}
		return false;
	}
	
}
