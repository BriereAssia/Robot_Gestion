package tp5robot;

public class Robots {

	private Casier casier;
	private Objet objet;
	private int nmcase;
	private Deplacement CD;
	private Manipulation CM; 
	public Robots(Casier casier)
	{
	this.casier=casier ;
	}
	
	public Casier getCasier() {
		return casier;
	}
	public void setCasier(Casier casier) {
		this.casier = casier;
	}
	public Objet getObjet() {
		return objet;
	}
	public void setObjet(Objet objet) {
		this.objet = objet;
	}
	public int getNmcase() {
		return nmcase;
	}
	public void setNmcase(int nmcase) {
		this.nmcase = nmcase;
	}

	public Deplacement getCD() {
		return CD;
	}

	public void setCD(Deplacement cD) {
		CD = cD;
	}

	public Manipulation getCM() {
		return CM;
	}

	public void setCM(Manipulation cM) {
		CM = cM;
	}

	@Override
	public String toString() {
		return "je suis a la case " + nmcase + " j'ai tiens =" +objet.getNom() +"";
	}
	

}