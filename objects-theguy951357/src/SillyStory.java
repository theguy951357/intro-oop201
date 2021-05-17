
public class SillyStory {

	public static void main(String[] args) {
		// makes a silly story from object calls

		Location asheville = new Location();
		Location newHaven = new Location();

		Llama jeff = new Llama(asheville);
		PrairieDog joe = new PrairieDog(newHaven);

		jeff.pontificate();
		jeff.moveTo(newHaven);
		jeff.isHungry = true;
		jeff.eat();
		joe.cookAMeal();
		jeff.hasTalkedWithThePrarieDogHere = true;
		jeff.eat();
		joe.hasFiledTaxes = true;
		jeff.talkWithThePrarieDog();
		joe.hasTrickedTheLlamaHere = false;
		jeff.runAround();
		joe.deceive();
		joe.hasFiledTaxes = true;
		joe.fileTaxes();
		joe.makeDramaticStare();
		jeff.talkWithThePrarieDog();

	}

}
