
public class Salarie {

	private int matricule;
	private int categorie;
	private int service;
	private String nom;
	private double salaire;
	
	// ------ TP3
	private static int nbInstances = 0;

	
	
	public Salarie (int matricule, int categorie, int service, String nom, double salaire) {
		
		// ------ TP7
		try {
			setSalaire(salaire);
		} catch (Erreurs e) {
			e.printStackTrace();
		}
		// ------ TP7
		try {
			setCategorie(categorie);
		} catch (Erreurs e) {
			e.printStackTrace();
		}
			
		this.matricule = matricule;
		this.categorie = categorie;
		this.service = service;
		this.nom = nom;
		
		// ------ TP3
		System.out.println("Une instance de la class salaire a été créée");
		nbInstances++;
		System.out.println("C'est l'instance numéro : "+nbInstances);
		
	}
	

	// ------ TP6 (pour le polymorphisme)
	public void calculSalaire (Salarie a) {
		System.out.println("Le salaire de "+a.nom+" est de "+a.salaire);
	}
	
	// ------ TP1
	public void calculSalaire () {
		System.out.println("Le salaire de "+nom+" est de "+salaire);
	}
		
	
	
	
	// ------ TP4
	public void equals (Salarie b) {
		if (matricule == b.matricule && nom.equals(b.nom)) {
			System.out.println("Les salariés sont égaux");
		} else {
			System.out.println("Les salariés ne sont pas égaux");
		}
	}
	
	
	public String toString () {
		String text = matricule+", "+categorie+", "+service+", "+nom+", "+salaire;	
		System.out.println(text);
		return text;
	}
	
	
	// ------ TP2
	public int getMatricule () {
		return matricule;
	}
	
	public void setMatricule (int matricule) {
		this.matricule = matricule;
	}
	
	
	public int getCategorie () {
		return categorie;
	}
	
	public void setCategorie (int categorie) throws Erreurs {
		// ------ TP7
		if ( categorie == 1 || categorie == 2 || categorie == 3) {
			this.categorie = categorie;
		} else {
			throw new Erreurs("La catégorie doit être de 1(cadre), 2(technicien), ou 3(enployé) !");
		}
		
	}
	
	public int getService () {
		return service;
	}
	
	public void setService (int service) {
		this.service = service;
	}
	
	
	public String getNom () {
		return nom;
	}
	
	public void setNom (String nom) {
		this.nom = nom;
	}
	
	public double getSalaire () {
		return salaire;
	}
	
	public void setSalaire (double salaire) throws Erreurs {
		// ------ TP7
		if (salaire < 0) {
			throw new Erreurs("Le salaire doit être supérieur à 0 !");
		} else {
			this.salaire = salaire;
		}
	}
	
	
	
	
	
	
	
	
	
}
