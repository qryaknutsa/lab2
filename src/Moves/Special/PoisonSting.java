package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class PoisonSting extends SpecialMove {
    public PoisonSting() {super(Type.POISON,15,100); }
    @Override
    protected java.lang.String describe() { return "использует Poison sting, который даёт 30% возможность отрваления противника"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect poisonStingEffect = new Effect();
        poisonStingEffect.chance(0.3);
        Effect.poison(p);
        p.addEffect(poisonStingEffect);
    }
}
