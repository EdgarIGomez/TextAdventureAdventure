package characters;

public class Monster extends Character{

    public Monster(String name, int hp, int mp, int attack, int defense, int agility) {
        super(name, hp, mp, attack, defense, agility);
    }

    public int strongHit(){

        System.out.println("The monster unleashes a strong attack you take double damage!");
        return attackAction() * 2;
    }

    @Override
    public void hpCheck() {
        if(this.HP < 0 || this.HP == 0){
            System.out.println("The monster has been defeated!");
        }
    }
}
