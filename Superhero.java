public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  
  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  public Superhero(String name, String costume, String weapon, boolean life, int weaponStrength){
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = life;
    this.weaponStrength = weaponStrength;
  }

   public Superhero(String name, String costume, String weapon){
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true;
    this.weaponStrength = 0;
  }

  // TODO #2: Add missing methods.
  public void loseLife(){
    this.life = false;
  }
  
  // TODO #3: Including a toString() method (see 2.7) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "Superhero details" + "\n" +
                              "    name: " + name + "\n" +
                              "    costume: " + costume + "\n" +
                              "    weapon: " + weapon + "\n" + 
                              "    life: " + life + "\n" +
                              "    weapon strength: " + weaponStrength + "\n" +
                              " " + "\n";
    return superHeroDetails;
  }
}
