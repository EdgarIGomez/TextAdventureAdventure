package characters;

public class Fighter extends Character{

    public Fighter(String name, int hp, int mp, int attack, int defense, int agility) {
        super(name, hp, mp, attack, defense, agility);
        // hp = 250, mp = 20, attack = 70, defense = 15, agility = 8git
    }

    public int doubleHit(){
        if(this.MP >= 5){
            this.MP -= 5;
            int firstHit = (int) (Math.random() * (60 - 30) + 30) + this.getAttack();
            return firstHit * 2;
        }
        System.out.println("You're too tired and don't have enough MP! A regular attack will be used instead");
        return attackAction();
    }
}
