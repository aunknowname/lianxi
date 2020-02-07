package zoo;

public class Test_feeder {
	
	public static void main(String[] args) {
		
		Feeder feeder = new Feeder();
		Food food;
		Animal animal;
		food = new Meat("≥‘»‚");
		animal = new Dinosaur();
		feeder.Feeder(animal, food);
		
		
		
		food = new Bomboo("≥‘÷Ò◊”");
		animal = new Panpa();
		feeder.Feeder(animal, food);
		};
		
	}
	


