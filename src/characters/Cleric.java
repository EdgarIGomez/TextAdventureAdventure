package characters;

public class Cleric extends Character{

    public Cleric(String name, int hp, int mp, int attack, int defense, int agility) {
        super(name, hp, mp, attack, defense, agility);
//        hp = 225, mp = 40, attack = 35, defense = 20, agility = 5
    }

    public int heal(){
        if(this.MP > 5){
            this.MP -= 5;
            return (int) (Math.random() * (40 - 20) + 40) + this.getAttack();
        }else{
            System.out.println("You're too tired and don't have enough MP! A regular attack will be used instead");
            return attackAction();
        }
    }

    @Override
    public void hpCheck() {
        if(this.HP < 0 || this.HP == 0){
            System.out.println(this.name + " has been downed!");
        }
    }

}
