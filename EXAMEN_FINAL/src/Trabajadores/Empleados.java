package Trabajadores;

public class Empleados 
{
	
	private String IdEmpleado,NomE, Cargo;
	private double Sueldo;
	private int HorasE,Afiliacion;
	public Empleados(String idEmpleado, String nomE, String cargo, double sueldo, int horasE, int afiliacion) {
		IdEmpleado = idEmpleado;
		NomE = nomE;
		Cargo = cargo;
		Sueldo = sueldo;
		HorasE = horasE;
		Afiliacion = afiliacion;
	}
	public String getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getNomE() {
		return NomE;
	}

	public void setNomE(String nomE) {
		NomE = nomE;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}

	public int getHorasE() {
		return HorasE;
	}

	public void setHorasE(int horasE) {
		HorasE = horasE;
	}

	public int getAfiliacion() {
		return Afiliacion;
	}

	public void setAfiliacion(int afiliacion) {
		Afiliacion = afiliacion;
	}

	public double MontoHorasE() {
		return Sueldo*HorasE/240;
	}
	public double SueldoBruto() {
		return Sueldo+MontoHorasE();
	}
	public double DsctoAFP() {
		return 0.11*SueldoBruto();
	}
	public double DsctoONP() {
		return 0.13*SueldoBruto();
	}
	public double DsctoESSALUD() {
		return 0.09*SueldoBruto();
	}
	
	public double SueldoNeto() {
		if(Afiliacion==0) return SueldoBruto()-DsctoESSALUD()-DsctoAFP();
		else return SueldoBruto()-DsctoESSALUD()-DsctoONP();
		
	}
	
	public String getTipoAfiliacion() {
	    return (Afiliacion == 0) ? "AFP" : "SNP";
	}
	
}
