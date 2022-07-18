package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class Metronome extends SpecialMove {
    public Metronome() {super(Type.NORMAL,90,70); }
    @Override
    protected java.lang.String describe() { return "использует Metronome, который усыпляет противника"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect metronomeEffect=new Effect();
        metronomeEffect.sleep(p);
        p.addEffect(metronomeEffect);
    }
}
