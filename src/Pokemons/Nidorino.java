package Pokemons;
import Moves.Special.Bubble;
import Moves.Special.Flamethrower;
import Moves.Special.PoisonSting;
import ru.ifmo.se.pokemon.*;

public class Nidorino extends Pokemon  {
    public Nidorino(String name,int level){
        super(name,level);
        setType(Type.POISON);
        setStats(61D,72D,57D,55D,55D,65D);
        setMove( new Flamethrower(),new PoisonSting(),new Bubble());
    }
}

