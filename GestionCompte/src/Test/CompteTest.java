package Test;



import java.sql.Date;

import org.junit.jupiter.api.Test;

import com.xyz.comptesManagement.Client;
import com.xyz.comptesManagement.Compte;


class CompteTest {

	@SuppressWarnings("null")
	@Test
	void test() {
		Client client = null;
		
		Compte compte = new Compte(11,"12345",0, client);
		System.out.println("Compte: "+compte.getNumero());
		
		Compte compte1 = new Compte(12,"67894",0, client);
		System.out.println("Compte: "+compte1.getNumero());
		
		
		
	}
	

}
