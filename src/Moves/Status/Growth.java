package Moves.Status;
import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth() {super(Type.NORMAL,0,0); }
    @Override
    protected java.lang.String describe() { return "использует Growth, который повышает Атаку и Специальную атаку покемона на одну единицу"; }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect growthEffect = new Effect();
        growthEffect.chance(1);
        growthEffect.stat(Stat.ATTACK,1);
        growthEffect.stat(Stat.SPECIAL_ATTACK,1);
        p.addEffect(growthEffect);
    }
}
