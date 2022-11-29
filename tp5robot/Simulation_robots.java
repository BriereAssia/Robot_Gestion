package tp5robot;

public class Simulation_robots {

	public static void main(String[] args) {
	Casier casier = new Casier(3);
	Objet obj = new Objet("Assia");
	casier.Sesir(obj, 3);
	Drone D = new Drone (casier);
	System.out.print("etat initiale  : ");
	System.out.println(casier.toString());
	D.setNmcase(2);
	D.setObjet(obj);
	System.out.println(D.toString());
	
	
	}

}
