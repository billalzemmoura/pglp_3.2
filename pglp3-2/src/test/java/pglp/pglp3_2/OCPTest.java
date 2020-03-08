package pglp.pglp3_2;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;



/**
 * test pour pglp3.2
 */
public class OCPTest 
    
{
    /**
     * cas de test de calcul de Salaire des employes
     *
     * 
     */

	@Test
	public void test() {


ArrayList<AllEmployes> listEmp=new ArrayList<AllEmployes>();
listEmp.add(new Employe(2015));
listEmp.add(new Vendeur(20));
listEmp.add(new Manager(20));
double salaireTotal=0;
for (int i = 0; i < listEmp.size(); i++) {
	salaireTotal+=listEmp.get(i).salaire();
}
System.out.print(salaireTotal);
assertTrue(salaireTotal==7120.0);


	}

}
