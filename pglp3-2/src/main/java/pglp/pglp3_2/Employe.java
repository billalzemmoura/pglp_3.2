package pglp.pglp3_2;

public class Employe extends AllEmployes {

	final private int salaire =1500;
	private int startYear;
	Employe (int startYear) {
		this.startYear=startYear;
		
		
	}
	@Override
	public double salaire() {
		return salaire+(2020-this.startYear)*20;
	}

}
