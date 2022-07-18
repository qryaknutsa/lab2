package Pokemons;
import Moves.Special.FireBlast;
import Moves.Special.Metronome;
import Moves.Special.Submission;
import Moves.Special.Thunder;
import ru.ifmo.se.pokemon.*;

public class Masquerain extends Pokemon  {
    public Masquerain(String name,int level){
        super(name,level);
        setType(Type.BUG);
        setStats(70D,60D,62D,100D,82D,80D);
        setMove( new FireBlast(),new Metronome(),new Submission(),new Thunder());
    }
}

