public class WaterPokemon extends Pokemon {


    public WaterPokemon(String name, String waterMove, int level, int hp, int attack) {
        super(name, "Water", level, hp, attack);
        this.specialMove = waterMove;
    }


    //water attack
    @Override
    public void attackMove() {
        System.out.printf("%s used %s!%n", name, specialMove);
    }
    
}
