
public class GITGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//luodaan oliot eli pelihahamot
		game character = new game();
		character.characterInfo();
		
		character.jump();
		character.characterInfo();
		
	}

}//Luokka GITGroup päättyy tähän

//Luokka game alkaa tästä
class game {
	
	public String character;
	public int energy = 10;
	public String answer ="";
	
	//metodi hyppäämiseen, hyppy vie energiaa 1
	public void jump() {
		
		energy--;
		System.out.println("Character jumps");
		
			}
	
	//metodi joka näyttää tiedot characterista
	public void characterInfo() {
		
		System.out.println("***Character***");
		System.out.println("Energy level: " +energy);
	}

	public void eat(){

		System.out.println("Choose meal: Banana, Apple, Kiwi")
		answer.innextLine();
		if (answer="Banana")
		{energy+5	
		}
			
	
	
	
	
	
}//Luokka game päättyy tähän

