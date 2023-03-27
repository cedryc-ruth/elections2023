package be.iccbxl.poo;

import static org.junit.gen5.api.Assertions.*;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

class ListeElectoraleTest {
	private ListeElectorale l1;
	
	@BeforeEach
	void setup() {
		//Préparation
		l1 = new ListeElectorale(1,"A",32000);		
	}

	@Test
	void testListeElectoraleIntStringInt() {
		//ListeElectorale l1 = new ListeElectorale(1,"A",32000);
		
		assertNotNull(l1);
		assertEquals(1, l1.getId());
		assertEquals("A", l1.getNom());
		assertEquals(32000, l1.getVoix());
		assertEquals(0, l1.getSieges());
		assertFalse(l1.isElimine());
	}

	@Test
	void testSetId() {
		//Utilisation
		l1.setId(5);
		
		//Vérifications
		assertEquals(5, l1.getId());
	}
	
	@Test
	void testSetIdWithBadValueShouldFail() {
		//Utilisation
		//Vérifications
		assertThrows(ElectionsException.class, () -> {
			l1.setId(-5);
		});
	}

	@Test
	void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	void testSetVoix() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSieges() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
