public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, String grassMove, int level, int hp, int attack) {
        super(name, "Grass", level, hp, attack);
        this.specialMove = grassMove;
    }

    //grass attack
    @Override
    public void attackMove() {
        System.out.printf("%s used %s!%n", name, specialMove);
    }
}
