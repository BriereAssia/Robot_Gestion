package tp5robot;
public class Objet {
	
public  String nom;
public Objet (String n ) {
	nom= n ;
}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
@Override
public String toString() {
	return "" + nom + "";
}

}

