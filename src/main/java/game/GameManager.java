package game;

import lotr.Character;
import lotr.CharacterFactory;


public class GameManager {

    public static void fight(Character character1, Character character2){
        int counter = 1;
        while(character1.getHp() > 0 && character2.getHp() > 0){
            String characterName1 = character1.getClass().getSimpleName();
            String characterName2 = character2.getClass().getSimpleName();

            if(characterName1.equals("Hobbit") && characterName2.equals("Hobbit")){
                System.out.println("Hobbits don't fight each other🕊️");
                break;
            }
            System.out.println("\n»»————- ★　————-««");
            System.out.println("Round "+ counter++);
            System.out.println("»»————- ★　————-««" + "\n");
            System.out.println(characterName1+ " is kicking "+ characterName2);
            character1.kick(character2);
            System.out.println(characterName2+ " is kicking "+ characterName1);
            character2.kick(character1);

            if (character1.getHp() == 0) {
                System.out.println("\nVICTORY OF "+characterName2+"!🏆");
                System.out.println(characterName1+" has lost...");}
            else if (character2.getHp() == 0){
                System.out.println("\nVICTORY OF "+characterName1+"!");
                System.out.println(characterName2+" has lost...");}
        }
    }
}
    
