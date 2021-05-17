
public class Llama {

	public boolean isHungry;
	public boolean hasTalkedWithThePrarieDogHere;
	
	private Location myLocation;
	
	public Llama(Location startingLocation) {
		myLocation = startingLocation;
		myLocation.theLlamaHere = this;
		
		isHungry = false;
		hasTalkedWithThePrarieDogHere = false;
	}
	
	public void eat() {
		
		if (isHungry) {
			if (myLocation.foodIsHere) {
				System.out.println("Nom nom nom nom.  mmmmmm much better! I wonder who left all this delicious food lying around?");
	
				isHungry = false;
				myLocation.foodIsHere = false;
			} else {
				System.out.println("I'm so hungry, but there's just no food here to be found :(");
			}
		} else {
			
			System.out.println("Oh, I'm not feeling hungry right now.");
		}
		
	}
	
	public void runAround() {
		
		if (isHungry) {
			System.out.println("I'm sooooo hungry, I wish I could find some food ...");
		} else {
			System.out.println("TRA-LA LA I'M A DANCING LLAMA LOOK AT ME!");
			isHungry = true;
		}
		
	}
	
	public void talkWithThePrarieDog() {
		
		if (isHungry) {
			System.out.println("I'm sooooo hungry, I wish I could find some food ...");
		} else {

			if (myLocation.thePrairieDogHere != null ) {
				if (hasTalkedWithThePrarieDogHere) {
					System.out.println("I wish I could talk to someone, but there's no way I'm speaking with this prarie dog again ...");
				} else {
					
					System.out.println("Good morning, how are you Prairie Dog?");
					System.out.println();
					System.out.println("I'm doing just well thanks.");
					System.out.println();
					System.out.println("Listen, I'm in need of your help.  There's a poacher on the loose, trying to steal my precious wool.  I'd like to hire you as my body guard.");
					System.out.println();
					System.out.println("A poacher you say? Where might they be");
					System.out.println();
					System.out.println("Over there, by the purple-ish trees.");
					System.out.println();
					System.out.println("Oh I see him now ...  HEY POACHER THE LLAMA IS THIS-A WAY");
					System.out.println();
					System.out.println("NO! WHY WOULD YOU DO THAT?!!?");
					System.out.println();
					System.out.println("I am a Prairie Dog, it's what we do.");
					System.out.println();
					
					hasTalkedWithThePrarieDogHere = true;
					isHungry = true;			
				}
			} else {
				System.out.println("I wish there was someone here I could talk to.");
			}
		}
	}
	
	public void moveTo(Location l) {
		
		System.out.println("Time to move on ...");
		
		myLocation.theLlamaHere = null;
		myLocation = l;
		myLocation.theLlamaHere = this;
		
		hasTalkedWithThePrarieDogHere = false;
	}
	
	public void pontificate() {
		
		if (isHungry) {
			System.out.println("Thousands of years ago, before the dawn of Llamas as we now know them, there lived a simple animal known as the lama.");
			System.out.println("One day, this lama decided to do some neck exercises.  He moved his head up, down, up, down, up, down up, down");
			System.out.println("left, right, left, right, left right....");
			
			System.out.println();
			System.out.println("(This continues on for roughly an hour)");
			System.out.println();
			
			System.out.println("And that is where babies come from.  For Llamas.");
			
		} else {
			
			System.out.println("The state of the world is UNACCEPTABLE.");
			System.out.println("Take my home nation of Peru for instance.");
			System.out.println("Equality! Equality? Equality.");
			System.out.println("BUT NO.");
			System.out.println("Take for instance feed stocks between the Boojums.  A fully grown Boojum makes about half as much hay as its younger sibling.");
			System.out.println("And I ask you, is this acceptable? I SAY NO");

			System.out.println();
			System.out.println("(This continues on for roughly an hour)");
			System.out.println();
			
			System.out.println("And that's all I have to say about that.");
			
			
		}
		
	}
	
	
}
