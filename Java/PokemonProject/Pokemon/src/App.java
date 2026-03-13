public class App {
    public static void main(String[] args) {
        GrassPokemon Epoke = new GrassPokemon("StickBug", "grow", 0, 10, 100);
        FirePokemon Fpoke = new FirePokemon("Blaze", "Burn", 0, 10, 100);
        WaterPokemon Wpoke = new WaterPokemon("Turtle", "sploosh", 0, 10, 100);

        Epoke.status();
        Fpoke.status();
        Wpoke.status();

        Epoke.attackMove();
        Fpoke.attackMove();
        Wpoke.attackMove();

        Epoke.levelUp();
        Fpoke.levelUp();
        Wpoke.levelUp();

        Epoke.status();
        Fpoke.status();
        Wpoke.status();

        PokemonTrainer trainer = new PokemonTrainer("Sophee");
        trainer.addToTeam(Epoke);
        trainer.addToTeam(Fpoke);
        trainer.addToTeam(Wpoke);
        trainer.showTeam();

    }
}
