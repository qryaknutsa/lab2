package Moves.Physical;
import ru.ifmo.se.pokemon.*;

public class Return extends PhysicalMove {
    public Return() {super(Type.NORMAL,0,100); }
    @Override
    protected java.lang.String describe() { return "���������� Return, ������� �������� ���� (�� ��������� - 102) ������ � ��������"; }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect returnEffect = new Effect();
        returnEffect.chance(1);
        returnEffect.stat(Stat.ATTACK,2);//????????
        p.addEffect(returnEffect);
    }
}

