public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    spiderman1.loseLife();
    batman1.loseLife();
    System.out.println(batman1);
    Superhero.superHeroFight(spiderman1, batman1);
    Superhero batman = new Superhero("Batman", "Batsuit", "Batarang");
    Superhero spiderman = new Superhero("Spiderman", "Red suit", "Super Web");
    Superhero supHero = new Superhero();
    System.out.println("Spiderman has a bad day");
    System.out.println("The Green Goblin shows up...");
    System.out.println("Spiderman is killed");
    System.out.println(spiderman);
    System.out.println(Superhero.placeholderFight(batman.getWeaponStrength(),supHero.getWeaponStrength(),batman.specialAttack(4),supHero.specialAttack(9000),batman,supHero));
  }

}
