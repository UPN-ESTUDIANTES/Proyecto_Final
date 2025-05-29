package Trabajadores;

import java.util.ArrayList;

public class ControladorE {
private ArrayList<Empleados>ListEmpleados = new ArrayList<>();
public void AgregarPagoEmpleados(Empleados emp) {
	ListEmpleados.add(emp);
}
public boolean EliminarPago(int IDemp) {
	return ListEmpleados.removeIf(emp -> emp.getIDEMPLEADO()==IDemp);
}
public Empleados BuscarPagoEmpleados(int IDemp) {
	for(Empleados emp : ListEmpleados) {
		if(emp.getIDEMPLEADO()==IDemp)return emp;
	}
	return null;
}
public Empleados ObtenerPago(int x) {
	return ListEmpleados.get(x);
}
public int TamañoPago() {
	return ListEmpleados.size();
}
public boolean ModificarPago(int IDemp, Empleados NuevoPago) {
	for(int i=0; i<TamañoPago(); i++) {
		if(ObtenerPago(i).getIDEMPLEADO()==IDemp) {
			ListEmpleados.set(i, NuevoPago);
			return true;
		}
	}
	return false;
}
public ArrayList<Empleados> MostrarLista(){
	return ListEmpleados;
}
}
