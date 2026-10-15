public class Main {
    public static void main(String[] args) {
        
        GameCharacter gameCharacter1 = new GameCharacter("Shadow", 100, 5);
        
        System.out.println("===== CHARACTER INFO =====");
        System.out.println("Name: " + gameCharacter1.getName());
        System.out.println("Health: " + gameCharacter1.getHealth());
        System.out.println("Level: " + gameCharacter1.getLevel());
        
        System.out.println();
        gameCharacter1.setHealth(65);
        
        System.out.println("After taking damage: ");
        System.out.println(gameCharacter1.getHealth());
        
        System.out.println();
        System.out.println("Attempting invalid health update:");
        gameCharacter1.setHealth(150);
        
        System.out.println(gameCharacter1.getHealth());
        
    }
}