import java.util.Hashtable;

public class Application {

	public static void main(String[] args) {
		

		System.out.println("--------------------------------------");
		System.out.println("-------------------------------------- TP1");
		Salarie testSalaire = new Salarie(1,4,5,"Abdou",-2);
		Salarie testSalaire2 = new Salarie(2,4,5,"Tuan",2000);
		Salarie testSalaire3 = new Salarie(3,4,5,"Micka",2000);
		Salarie testSalaire4 = new Salarie(4,4,5,"Skander",4000);
		Salarie testSalaire5 = new Salarie(5,4,5,"Ezzedin",4000);
		
		
		System.out.println(testSalaire4.getSalaire());
		
		try {
			testSalaire2.setSalaire(8000);
		} catch (Erreurs e) {
			e.printStackTrace();
		}
		
		System.out.println(testSalaire2.getSalaire());
		
		

		
		testSalaire2.toString();
		testSalaire2.equals(testSalaire3);
		
		System.out.println("test system.out sur un objet");
		System.out.println(testSalaire2);
		
		Commercial testcommercial1 = new Commercial(6,4,5,"Noname",2000);
		Commercial testcommercial2 = new Commercial(7,4,5,"Anonyme",2000, 29893, 3.7);
		
		
		// ------ TP6
		System.out.println("--------------------------------------");
		System.out.println("-------------------------------------- TP6");
		testcommercial1.equals(testcommercial2); // polymorphisme
		testSalaire2.calculSalaire(testcommercial2);
		
		System.out.println("Calcul salaire sur commercial ");
		testcommercial1.calculSalaire();
		System.out.println("Calcul salaire sur salarié ");
		testSalaire.calculSalaire();
		
		
		
		// ------ TP5
				System.out.println("--------------------------------------");
				System.out.println("-------------------------------------- TP5");
		Hashtable<Integer, String> hash = new Hashtable<>();
		
		hash.put(testSalaire.getMatricule(), testSalaire.getNom());
		hash.put(testSalaire2.getMatricule(), testSalaire2.getNom());
		hash.put(testSalaire3.getMatricule(), testSalaire3.getNom());
		hash.put(testSalaire4.getMatricule(), testSalaire4.getNom());
		hash.put(testSalaire5.getMatricule(), testSalaire5.getNom());
		hash.put(testcommercial1.getMatricule(), testcommercial1.getNom());
		hash.put(testcommercial2.getMatricule(), testcommercial2.getNom());
		
		
		
		hash.forEach((key, value)->System.out.println("Matricule : "+key+"| Nom : "+value));
		
		
	}

}
