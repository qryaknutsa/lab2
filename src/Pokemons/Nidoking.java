package Pokemons;
import Moves.Special.Bubble;
import Moves.Special.Flamethrower;
import Moves.Special.PoisonSting;
import Moves.Status.Growth;
import ru.ifmo.se.pokemon.*;

public class Nidoking extends Pokemon  {
    public Nidoking(String name,int level){
        super(name,level);
        setType(Type.POISON);
        setStats(81D,102D,77D,85D,75D,85D);
        setMove( new Flamethrower(),new PoisonSting(),new Bubble(),new Growth());
    }
}

