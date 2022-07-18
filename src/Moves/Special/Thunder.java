package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {super(Type.ELECTRIC,110,70); }
    @Override
    protected java.lang.String describe() { return "���������� Thunder, ������� ��� 30% ����������� ������������ ����������"; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect thunderEffect = new Effect();
        thunderEffect.chance(0.3);
        Effect.paralyze(p);
        p.addEffect(thunderEffect);
    }
}
