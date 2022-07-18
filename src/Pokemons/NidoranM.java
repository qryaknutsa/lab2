package Pokemons;
import Moves.Special.Flamethrower;
import Moves.Special.PoisonSting;
import ru.ifmo.se.pokemon.*;

public class NidoranM extends Pokemon  {
    public NidoranM(String name,int level){
        super(name,level);
        setType(Type.POISON);
        setStats(46D,57D,30D,40D,40D,50D);
        setMove( new Flamethrower(),new PoisonSting());
    }
}

