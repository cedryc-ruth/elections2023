package be.iccbxl.poo;

public class Application {

	public static void main(String[] args) {
		ListeElectorale l1 = new ListeElectorale();
		
		System.out.println(l1);

		ListeElectorale l2 = new ListeElectorale(1,"A",32000);
		
		System.out.println(l2);
		
		l2.setSieges(4);
		
		System.out.println(l2);
		
		l2.setElimine(true);
		
		System.out.println(l2);
		
		try {
			l2.setNom("    ");
		} catch(ElectionsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			l2.setId(-15);
		} catch(ElectionsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			l2.setVoix(-1200);
		} catch(ElectionsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			l2.setSieges(-2);
		} catch(ElectionsException e) {
			System.out.println(e.getMessage());
		}
	}

}
