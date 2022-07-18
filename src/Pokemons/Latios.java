package Pokemons;
import Moves.Physical.Return;
import Moves.Physical.Rollout;
import Moves.Special.ThunderWave;
import Moves.Status.Foresight;
import ru.ifmo.se.pokemon.*;

public class Latios extends Pokemon  {
    public Latios(String name,int level){
        super(name,level);
        setType(Type.DRAGON);
        setStats(80D,90D,80D,130D,110D,110D);
        setMove( new Return(),new ThunderWave(),new Rollout(),new Foresight());
    }
}
