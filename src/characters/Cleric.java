package characters;

public class Cleric extends Character{
    public Cleric(String name, int hp, int mp, int attack, int defense, int agility) {
        super(name, hp, mp, attack, defense, agility);
        //hp = 225, mp = 40, attack = 35, defense = 20, agility = 5
    }

    @Override
    public void hpCheck() {
        if(this.HP < 0 || this.HP == 0){
            System.out.println(this.name + " has been downed!");
        }
    }

}
