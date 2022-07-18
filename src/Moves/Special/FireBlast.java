package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {super(Type.FIRE,60,110); }
    @Override
    protected java.lang.String describe() { return "использует Fire Blast, который даёт 10% возможность возгорания противника"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect fireBlastEffect = new Effect();
        fireBlastEffect.chance(0.1);
        Effect.burn(p);
        p.addEffect(fireBlastEffect);
    }
}
