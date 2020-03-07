package pglp.pglp3_2;

public class Vendeur  extends AllEmployes{
	final private int  base=2000;
	private int commision;
	public Vendeur(int commision) {
	this.commision=commision;
	}
	
	@Override
	public double salaire(){
	return base+commision;
}
}