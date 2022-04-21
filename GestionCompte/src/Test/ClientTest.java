package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.xyz.comptesManagement.Client;

class ClientTest {

	@Test
	void test() {
		Client client =new  Client(11,"Soukaina","Jini");
		System.out.println("Client: "+client.getNom()+ "  "+client.getPrenom());
		Client client1 =new  Client(12,"yassine","Razi");
		System.out.println("Client: "+client1.getNom()+ "  "+client1.getPrenom());
		 
	}

}
 