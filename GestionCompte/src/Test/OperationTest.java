package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.xyz.comptesManagement.Compte;
import com.xyz.comptesManagement.Operation;

class OperationTest {

	@Test
	void test() {
		Compte compte = null;
		Operation op1=new Operation(new Date(2020,3,5), "VERS", 4444,compte);
	
	}

}
 