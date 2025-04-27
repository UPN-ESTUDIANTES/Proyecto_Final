package Personal;

public class Empleados {
	
	private String cod,nom,cargo;
	private double sueldo;
	private int horasextras, afiliación;
	
	public Empleados(String cod, String nom, String cargo, double sueldo, int horasextras, int afiliación) 
	{
		this.cod = cod;
		this.nom = nom;
		this.cargo = cargo;
		this.sueldo = sueldo;
		this.horasextras = horasextras;
		this.afiliación = afiliación;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorasextras() {
		return horasextras;
	}

	public void setHorasextras(int horasextras) {
		this.horasextras = horasextras;
	}

	public int getAfiliación() {
		return afiliación;
	}

	public void setAfiliación(int afiliación) {
		this.afiliación = afiliación;
	}
	
	
	
	
	public double MontoHE() 
	{
		return (sueldo*horasextras)/240;
	}
	public double SueldoBruto()
	{
		return sueldo+MontoHE();
	}
	public double dsctoAFP()
	{
		return 0.11*SueldoBruto();
	}
    public double dsctoONP()
    {
    	return 0.13*SueldoBruto();
     }
    public double dsctoESSALUD()
    {
    	return 0.09*SueldoBruto();
    }
    public double SueldoNeto()
    {
    	if(afiliación==0)
    	    return SueldoBruto()-dsctoESSALUD()-dsctoAFP();
    	else 	
    		return SueldoBruto()-dsctoESSALUD()-dsctoONP();
    }
	
	
	
	

	

}
