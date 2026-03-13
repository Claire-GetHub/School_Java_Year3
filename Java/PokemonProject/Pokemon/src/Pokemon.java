public class Pokemon {
    //Pokemon Attributees
    protected String name, nickname, type, specialMove;
    protected int level, hp, attack;
    private final int maxHp;

    //constructor
    public Pokemon(String name, String type, int level, int hp, int attack) {
        this.name = name;
        this.nickname = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        maxHp = hp;
        this.attack = attack;
        this.specialMove = "None";
    }

    //healing
    public void heal(int amount) {
        System.out.printf("%s healed %d points!%n", name, amount);
        if(hp + amount > maxHp) {
            hp = maxHp;
            return;
        }
        hp += amount;
    }
    //no arg healing heals 10 points
    public void heal() {
        heal(10);
    }

    //take damage
    public void takeDamage(int amount) {
        System.out.printf("%s damaged %d points!%n", name, amount);
        if(hp - amount <= 0) {
            System.out.printf("%s knocked out!%n", name);
            hp = 0;
            return;
        }
        hp -= amount;
    }

    // basic attack
    public void attackMove() {
        System.out.printf("%s used basic attack!%n", name);
    }

    //level up
    public void levelUp() {
        System.out.printf("%s leveled up!%n", name);
        level++;
        hp++;
        attack++;
    }

    public void status() {
        System.out.printf("name: %s%nnickname: %s%ntype: %s%nlevel: %s%nhp: %s%nattack: %s%n",name, nickname, type, level, hp, attack);
    }

    //setters
    public void changeNickname(String nickname) {
        this.nickname = nickname;
    }


    //getters
    public String Name() {
        return this.name;
    }

    public String Nickname() {
        return this.nickname;
    }

    public String Type() {
        return this.type;
    }
    public String SpecialMove() {
        return this.specialMove;
    }
}
