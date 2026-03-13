import java.util.ArrayList;


public class PokemonTrainer {
    //Pokemon Trainer Attribute
    private final String name;
    private final ArrayList<Pokemon> team;

    //constuctors
    public PokemonTrainer(String trainerName, ArrayList<Pokemon> team) {
        this.name = trainerName;
        this.team = team;
    }

    public PokemonTrainer(String trainerName) {
        this.name = trainerName;
        this.team = new ArrayList<>();
    }


    //add pokemon to trainers team
    public void addToTeam(Pokemon poke) {
        System.out.printf("%s added to %s's team%n", poke.Name(), name);

        team.add(poke);
    }

    //remove pokemon from trainers team
    public void removeFromTeam(String pokeNickname) {
        System.out.printf("%s removed from %s's team%n", pokeNickname, name);
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).name.equals(pokeNickname)) {
                team.remove(i);
                return;
            }
        } 
    }

    //show trainers team
    public void showTeam() {
        System.out.printf("Pokemon on %s's team:%n", name);

        for (int i = 0; i < team.size(); i++) {
            Pokemon poke = team.get(i);
            System.out.printf(" %d -> %s (%s)%n", i, poke.Nickname(), poke.Name());
        }
    }

    //get team
    public Pokemon[] getTeam() {
        return (Pokemon[])team.toArray();
    }
}
