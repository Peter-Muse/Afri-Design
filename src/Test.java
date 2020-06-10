
public class Test {

	public static void main(String[] args) {
		AirConditioner Hier = new AirConditioner("black"); 
		
		AirConditioner lifeGood = new AirConditioner("red");
		
		System.out.println(Hier.getColor());
		
		System.out.println(lifeGood.getColor());

	}

}
