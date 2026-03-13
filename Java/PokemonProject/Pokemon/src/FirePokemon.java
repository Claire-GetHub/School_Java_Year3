public class FirePokemon extends Pokemon {

    public FirePokemon(String name, String fireMove, int level, int hp, int attack) {
        super(name, "Fire", level, hp, attack);
        this.specialMove = fireMove;
    }


    //fire attack
    @Override
    public void attackMove() {
        System.out.printf("%s used %s!%n", name, specialMove);
    }
}
