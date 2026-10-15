public class GameCharacter {
    
    // ENCAPSULATION:
    // private prevents other classes from directly accessing these fields.
    // Getters allow other classes to READ their values.
    // Setters allow other classes to REQUEST changes to their values.
    // A setter can validate the new value before updating the field.
    // The class itself can still change its own private fields.
        
    private String name;
    private int health;
    private int level;
    
    GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }
    
    String getName() {
        return this.name;
    }
    
    int getHealth() {
        return this.health;
    }
    
    int getLevel() {
        return this.level;
    }
    
    // newHealth = the new value being requested.
    // this.health = the value currently stored in the object.
    // Only update this.health if newHealth is between 0 and 100.
    
    void setHealth(int newHealth) {
        if (newHealth < 0 || newHealth > 100) {
            System.out.println("Invalid health value");
        } else {
            this.health = newHealth;
        } 
    }
}