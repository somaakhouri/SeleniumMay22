package demo3;

public class G {
	String name;
	
	public G(String printName) {
		name = printName;
	}
	
	public void printName() {
		System.out.println("Name of the person = " + name );
	}
	
	public static void commonFeatureInAllHumans (){
		System.out.println("Humans don't have tails");
		
	}
	
	public static void main(String[] args) {
	    G g = new G("Soma");
	    G g2 = new G("Akhouri");
	    
	    g.printName();
	    g2.printName();
	    
	    commonFeatureInAllHumans();
	}

}
