public class Battle {
    PokemonTrainer final trainer1;
    Pokemon activePoke1;
    PokemonTrainer final trainer2;
    Pokemon activePoke2;

    public Battle (PokemonTrainer t1, PokemonTrainer t2) {
        this.trainer1 = t1;
        this.trainer2 = t2;
    }
    public void showTeam1() {trainer1.showTeam();}
    public void showTeam2() {trainer2.showTeam();}

    public void trainer1chooses(int i) {}
    public void trainer2chooses(int i) {}

    private void trainerChooses(PokemonTrainer trainer, Pokemon activePoke) {
        System.out.printf("%s chooses %s%n", trainer.name, activePoke.name);
    }



}