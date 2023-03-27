package be.iccbxl.poo;

/**
 * Représente une liste électorale
 * 
 * @author Cedric.Ruth
 * @version 1.0
 */
public class ListeElectorale implements Comparable<ListeElectorale> {
	/**
	 * Identité de la liste
	 */
	private int id;
	
	/**
	 * Le nom de la liste
	 */
	private String nom;
	
	/**
	 * Le nombre de voix obtenus
	 */
	private int voix;
	
	/**
	 * Le nombre de sièges obtenus
	 */
	private int sieges;
	
	/**
	 * Si la liste électorale est éliminée ou pas
	 */
	private boolean elimine;

	public ListeElectorale() { }

	/**
	 * Crée une liste électorale.
	 * 
	 * @param id Identifiant de la liste électorale
	 * @param nom Le nom de la liste électorale
	 * @param voix le nombre de voix obtenus
	 */
	public ListeElectorale(int id, String nom, int voix) {
		super();
		this.id = id;
		this.nom = nom;
		this.voix = voix;
		this.sieges = 0;
		this.elimine = false;
	}

	public int getId() {
		return id;
	}

	/**
	 * Modifie l'id de la liste électorale
	 * 
	 * @param id Nouvel id de la liste électorale
	 */
	public void setId(int id) {
		if(id<0) {
			throw new ElectionsException("L'id ne peut pas être négatif!");
		}
		
		this.id = id;
	}

	/**
	 * Renvoie le nom de la liste électorale
	 * 
	 * @return le nom de la liste électorale
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if(nom.trim().length()==0) {
			throw new ElectionsException("Le nom ne peut pas être vide!");
		}
		
		this.nom = nom;
	}

	public int getVoix() {
		return voix;
	}

	/**
	 * Modifie le nombre de voix de la liste électorale
	 * 
	 * @param voix Le nouveau nombre de voix
	 * @throws ElectionsException si voix est négatif
	 */
	public void setVoix(int voix) {
		if(voix<0) {
			throw new ElectionsException("Le nombre de voix ne peut pas être négatif!");
		}
		
		this.voix = voix;
	}

	public int getSieges() {
		return sieges;
	}

	public void setSieges(int sieges) {
		if(sieges<0) {
			throw new ElectionsException("Le nombre de sièges ne peut pas être négatif!");
		}
		
		this.sieges = sieges;
	}

	public boolean isElimine() {
		return elimine;
	}

	public void setElimine(boolean elimine) {
		this.elimine = elimine;
	}

	/**
	 * Renvoie une représentation littérale de la liste électorale.
	 */
	@Override
	public String toString() {
		return "ListeElectorale [id=" + id + ", nom=" + nom + ", voix=" + voix + ", sieges=" + sieges + ", elimine="
				+ elimine + "]";
	}

	@Override
	public int compareTo(ListeElectorale le) {
		return this.nom.compareTo(le.nom);
	}
		
}
