package Trabajadores;

public class Empleados {
	private String NomE;
	private double Sueldo;
	private int HorasE, Afiliación, IDEMPLEADO, Cargo;
	
	public Empleados(String nomE, int cargo, double sueldo, int horasE, int afiliación, int iDEMPLEADO) {
		NomE = nomE;
		Cargo = cargo;
		Sueldo = sueldo;
		HorasE = horasE;
		Afiliación = afiliación;
		IDEMPLEADO = iDEMPLEADO;
	}
	public String getNomE() {
		return NomE;
	}
	public void setNomE(String nomE) {
		NomE = nomE;
	}
	public int getCargo() {
		return Cargo;
	}
	public void setCargo(int cargo) {
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
	public int getAfiliación() {
		return Afiliación;
	}
	public void setAfiliación(int afiliación) {
		Afiliación = afiliación;
	}
	public int getIDEMPLEADO() {
		return IDEMPLEADO;
	}
	public void setIDEMPLEADO(int iDEMPLEADO) {
		IDEMPLEADO = iDEMPLEADO;
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
		if(Afiliación==0) return SueldoBruto()-DsctoESSALUD()-DsctoAFP();
		else return SueldoBruto()-DsctoESSALUD()-DsctoONP();
		
	}
}
