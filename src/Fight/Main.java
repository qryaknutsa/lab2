package Fight;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Latios("", 35);
        Pokemon p2 = new Surskit("", 20);
        Pokemon p3 = new Masquerain("", 26);
        Pokemon p4 = new NidoranM("", 21);
        Pokemon p5 = new Nidorino("", 28);
        Pokemon p6 = new Nidoking("", 34);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}










