package Moves.Physical;
import ru.ifmo.se.pokemon.*;

public class Rollout extends PhysicalMove {
    public Rollout() {super(Type.ROCK,30,90); }
    @Override
    protected java.lang.String describe() { return "использует Rollout, который удваивает силу каждый раз, когда Rollout использован успешно после первого хода, прекращает после пяти ходов"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect rolloutEffect = new Effect();
        if(rolloutEffect.success())rolloutEffect.turns(4);
        rolloutEffect.stat(Stat.ATTACK,30);
        p.addEffect(rolloutEffect);
    }
}

