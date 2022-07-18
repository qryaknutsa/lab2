package Moves.Status;
import ru.ifmo.se.pokemon.*;

public class Foresight extends StatusMove {
    public Foresight() {super(Type.NORMAL,90,100); }
    @Override
    protected java.lang.String describe() { return "использует Foresight, который заставляет противника не уклоняться и позволяет поражать ее обычными и боевыми движениями, даже если это призрак"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect foresightEffect=new Effect();
        foresightEffect.stat(Stat.EVASION,-10);
        foresightEffect.stat(Stat.ATTACK,-1);
        p.addEffect(foresightEffect);
    }
}

