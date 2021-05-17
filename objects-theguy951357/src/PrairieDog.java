
public class PrairieDog {

	public boolean hasFiledTaxes;
	public boolean hasTrickedTheLlamaHere;
	
	private Location myLocation;
	
	public PrairieDog(Location startingLocation) {
		
		myLocation = startingLocation;
		myLocation.thePrairieDogHere = this;
		
		hasFiledTaxes = false;
		hasTrickedTheLlamaHere = false;
	}
	
	
	public void deceive() {
		if (hasTrickedTheLlamaHere) {
			System.out.println("I don't think this Llama will fall for my Prarie Dog tricks anymore :(");
		} else {
		
			if (myLocation.theLlamaHere != null) {
				System.out.println("Hello Llama.  How you feeling today?");
				
				if (myLocation.theLlamaHere.isHungry == false) {
			
					System.out.println("Just great, I just ate a delicous meal of mutton. Though now I can't seem to stop spitting");
					System.out.println();
					
					System.out.println("Oh, I imagine that's because of ALL THAT CHEWING TOBACCO I SNUCK INTO THE MEAT!! MUH HA HA HA");
					System.out.println();
					
					System.out.println("WHY WOULD :SPITS: WHY WOULD YOU DO THAT :SPITS:");
					System.out.println();
					
					System.out.println("I'm a prairie dog, it's what we do.");
					
				} else {
					
					System.out.println("Not well, I'm so hungry.");
					System.out.println();
					
					System.out.println("Oh? Well I saw some food over in another location.");
					System.out.println();
					
					System.out.println("Really? Thanks so much! I'll head there now.");
					System.out.println();
					
					System.out.println("MUH HHA HA. ANOTHER TRICKERY WIN FOR PRAIRIE DOG KIND");
					System.out.println();
					
					
				}

				hasTrickedTheLlamaHere = true;
			} else {
				System.out.println("I'm bored.  I wish there was someone here to play a trick on.");
			}
			
			
		}
		
	}
	
	public void moveTo(Location l) {
		
		System.out.println("That's all the trouble I can cause here, time to move on.");

		myLocation.thePrairieDogHere = null;
		myLocation = l;
		myLocation.thePrairieDogHere = this;
		hasTrickedTheLlamaHere = false;
		
	}
	
	public void fileTaxes() {
	
		if (hasFiledTaxes) {
			System.out.println("I've already filed my taxes!");
		} else {
		
			System.out.println("Oh no, I've forgotten to file my taxes!");
			System.out.println("Luckily farmers get a nice tax credit ...");
			System.out.println("");
			System.out.println("I just have to use my deceivery on the IRS.  I'm sure it will go fine.");
			System.out.println("");
			System.out.println("There all done, taxes e-filed on the Animal-net.");
			
		
			hasFiledTaxes = true;
		}
	}
	
	public void makeDramaticStare() {
	
		System.out.println("https://www.youtube.com/watch?v=jHjFxJVeCQs");
	}
	
	public void cookAMeal() {
		if (myLocation.foodIsHere) {
			
			System.out.println("There's already plenty of food here already, no need to cook anything.");
		} else {
			
			System.out.println("It's time to prairie dog up some food");
			System.out.println("First I'll take some leaves, mix together with some grubs ... yes very nice");
			System.out.println("Bake it in a clay furnace powered by the tears of a unicorn ...");
			System.out.println("Ah and there it is, a Michelin 5-star mutton dinner!");
			System.out.println("");
			System.out.println("Hmm, well I'm not hungry, I guess I'll just leave this here.");
			
			
			myLocation.foodIsHere = true;
		}
	}
	
}
