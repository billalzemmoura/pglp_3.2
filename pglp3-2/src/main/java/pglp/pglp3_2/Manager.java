package pglp.pglp3_2;

public class Manager extends AllEmployes{
	private final int base=1500;
	private int NombresEmployes;
	public  Manager(int NombresEmployes) {
	this.NombresEmployes=NombresEmployes;
	}
		
	@Override
	public double salaire() {
		
		return base+(NombresEmployes*100);
	}

}
