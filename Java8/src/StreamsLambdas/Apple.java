 enum Colour {
	RED, BLUE, ORANGE, YELLOW,GREEN, DEFAULT;
}


 enum AppleType {
	TYPE1, TYPE2, TYPE3, TYPE4, DEFAULT;
}


public class Apple{
	String name;
	int weight;
	Colour colour;
	AppleType appletype;



	public Apple( String name, int weight, Colour colour, AppleType appletype){
		this.name = name;
		this.weight = weight;
		this.colour = colour;
		this.appletype = appletype;
	}
	public Apple( String name, int weight){
		this.name = name;
		this.weight = weight;
		this.colour = Colour.DEFAULT;
		this.appletype = AppleType.DEFAULT;
	}

	@Override 
	public String toString(){
		return String.format("This %s is of colour %s and weight %d and is of type %s",name, colour,weight, appletype);
	}

	public int getWeight(){
		return this.weight;
	}

	public Colour getcolour(){
		return this.colour;
	}


}