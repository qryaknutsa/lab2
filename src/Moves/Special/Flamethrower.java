package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {super(Type.FIRE,90,100); }
    @Override
    protected java.lang.String describe() { return "использует Flamethrower, который даёт 10% возможность возгорания противника"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect flamethrowerEffect = new Effect();
        flamethrowerEffect.chance(0.1);
        Effect.burn(p);
        p.addEffect(flamethrowerEffect);
    }
}
