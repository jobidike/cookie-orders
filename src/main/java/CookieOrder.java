//Create a model of a cookie order  //model for object
public class CookieOrder {
	
	//instance data
	private String variety;
	private int numBoxes;
	
	//constructor
	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;   //this instance
		this.numBoxes = numBoxes;
	}
//source. generate getters                //accessor means finding getters and setters
	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}
	//toString has a default behavior, giving you @(symbol) and hashcode(override)
	//return something that is more descriptive
	@Override
	public String toString() { 
		return "Variety: " + this.variety + "\tBoxes: " + this.numBoxes;
	}
	
	
	
	

}
