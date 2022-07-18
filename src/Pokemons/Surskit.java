package Pokemons;
import Moves.Special.FireBlast;
import Moves.Special.Metronome;
import Moves.Special.Submission;
import ru.ifmo.se.pokemon.*;

public class Surskit extends Pokemon  {
    public Surskit(String name,int level){
        super(name,level);
        setType(Type.BUG);
        setStats(40D,30D,32D,50D,52D,65D);
        setMove( new FireBlast(),new Metronome(),new Submission());
    }
}

