package characters;

public class Warrior extends Character{

    public Warrior(String name, int hp, int mp, int attack, int defense, int agility){
        super(name, hp, mp, attack, defense, agility);
        //hp = 300, mp = 20, attack = 40, def = 20, agility = 5
    }

    public int chargedSwing(){
        if(this.MP >= 5){
            this.MP -= 5;
            return (int) (Math.random() * (80 - 50) + 50) + this.getAttack();
        }
        System.out.println("You're too tired and don't have enough MP! A regular attack will be used instead");
        return attackAction();
    }
}
