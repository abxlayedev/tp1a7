
/**
 * @author AbLaye
 *
 */
public class Commercial extends Salarie {

	private double chiffreDaffaires;
	private double poucentageCommission;
	
	
	// les constructeurs
	public Commercial(int matricule, int categorie, int service, String nom, double salaire) {
		super(matricule, categorie, service, nom, salaire);
	}
	
	public Commercial(int matricule, int categorie, int service, String nom, double salaire, double chiffreDaffaires, double poucentageCommission) {
		super(matricule, categorie, service, nom, salaire);
		this.chiffreDaffaires = chiffreDaffaires;
		this.poucentageCommission = poucentageCommission;
	}
	
	
	
	
	@Override // redefinir
	public void calculSalaire () {
		double commission = chiffreDaffaires * poucentageCommission;
		double salaire = super.getSalaire() + commission;
		System.out.println("Le salaire de "+super.getNom()+" est de "+salaire);
	}

	// surcharger
	public void calculSalaire (double pourcentage, double chiffreDaffaires) {
		double commission = chiffreDaffaires * pourcentage;
		double salaire = super.getSalaire() + commission;
		System.out.println("Le salaire de "+super.getNom()+" est de "+salaire);
	}
	
	@Override // redefininr 
	public void equals(Salarie b) {
		super.equals(b);
	}
	
	// surcharger
	public void equals (Commercial b) {
		if ( super.getMatricule() == b.getMatricule() && super.getNom().equals(b.getNom()) ) {
			System.out.println("Les salariés sont égaux");
		} else {
			System.out.println("Les salariés ne sont pas égaux");
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	

	public void setChiffreDaffaires (double chiffreDaffaires) {
		this.chiffreDaffaires = chiffreDaffaires;
	}
	
	public double getChiffreDaffaires () {
		return chiffreDaffaires;
	}
	
	
	public void setPoucentagesCommission (float poucentageCommission) {
		this.poucentageCommission = poucentageCommission;
	}
	
	public double getPoucentageCommission () {
		return poucentageCommission;
	}
	
	
}
