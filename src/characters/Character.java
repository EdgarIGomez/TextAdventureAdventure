package characters;

public class Character {
    protected String name;
    protected int HP;
    protected int MP;
    protected int attack;
    protected int defense;
    protected int agility;

    public Character(String name, int hp, int mp, int attack, int defense, int agility) {
        this.name = name;
        this.HP = hp;
        this.MP = mp;
        this.attack = attack;
        this.defense = defense;
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int attackAction(){
        return (int) (Math.random() * (50 - 30) + 30) + this.attack;
    }

    public int defenseAction(){
        return (int) (Math.random() * (40 - 20) + 20) + this.defense;
    }
}
