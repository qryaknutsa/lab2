package Moves.Special;
import ru.ifmo.se.pokemon.*;

public class Submission extends SpecialMove {
    public Submission() {super(Type.FIGHTING,80,80); }
    @Override
    protected java.lang.String describe() { return "���������� Submission, ������� ��������� 3/4 �����, ����������� ���������"; }
    @Override
    protected void applySelfDamage(Pokemon def, double damage){
        Effect submissionEffect = new Effect();
        if(def.getStat(Stat.ATTACK)>0){ submissionEffect.stat(Stat.ATTACK, (int)-(3*(Math.random()/4)));
        }
    }
}
