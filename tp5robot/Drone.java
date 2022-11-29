package tp5robot;

public class Drone extends Robots {
public Drone (Casier casier )
{
	super(casier);
	this.setCM(new Manitisme());
	this.setCD(new Vole());
}
public String toString ()
{
	String s = super.toString();
	return "je suis un Drone et  " + s ; 
}
}

