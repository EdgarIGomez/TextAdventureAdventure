package characters;

public class Mage extends Character{

    public Mage(String name, int hp, int mp, int attack, int defense, int agility) {
        super(name, hp, mp, attack, defense, agility);
        //hp = 210, mp = 60 attack = 50, defense = 10, agility = 6
    }

    public int fire(){
        if(this.MP >= 5){
            this.MP -= 5;
            return (int) (Math.random() * (80 - 50) + 50) + this.getAttack();
        }
        System.out.println("You're fireball fizzles you don't have enough MP! A regular magic blast will be used instead");
        return attackAction();

    }
}
