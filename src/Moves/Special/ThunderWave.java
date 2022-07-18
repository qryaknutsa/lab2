package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends SpecialMove {
    public ThunderWave() {super(Type.NORMAL,0.0,90); }
    @Override
    protected java.lang.String describe() { return "использует Thunder wave, который парализует противника"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect thunderWaveEffect=new Effect();
        thunderWaveEffect.chance(1);
        Effect.paralyze(p);
        p.addEffect(thunderWaveEffect);
    }
}

