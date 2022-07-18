package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble() {super(Type.WATER,40,100); }
    @Override
    protected java.lang.String describe() { return "использует Bubble, который даёт 10% возможность понизить cкорость противника на одну единицу"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect bubbleEffect = new Effect();
        bubbleEffect.chance(0.1);
        bubbleEffect.stat(Stat.SPEED,-1);
        p.addEffect(bubbleEffect);
    }
}

