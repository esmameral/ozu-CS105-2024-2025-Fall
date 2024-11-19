/*
 * Created on Mar 2, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package exercises.week7;

public abstract class Vehicle  implements Taxable{

	public abstract void doMaintenance();
	
//	public void sayHello() {
//		System.out.println("Hello from Vehicle class");
//	}
	
	public Vehicle() {
		super();
		System.out.println("Vehicle constructor executed");
	}

	public String getColor() {
		return "Black ";
	}

	public String toString() {
		//return getColor() + " Vehicle ";
		return " Vehicle ";
	}


}
