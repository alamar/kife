package ru.lj.alamar.kife;

/**
 * @author ilyak
 */
public class Rules {
    public static final Rules LIFE = new Rules(
            new boolean[] {false, false,  true,  true, false, false, false, false, false},
            new boolean[] {false, false, false,  true, false, false, false, false, false});

    public final boolean[] survive;
    public final boolean[] populate;

    public Rules(boolean[] survive, boolean[] populate) {
        assert(survive.length == 9);
        assert(populate.length == 9);
        this.survive = survive;
        this.populate = populate;
    }

    @Override
    public String toString() {
        String survival = "";
        for (int i = 0; i < 9; i++) if (survive[i]) survival += i;
        String population = "";
        for (int i = 0; i < 9; i++) if (populate[i]) population += i;
        return "Rules [" + survival + "/" + population + "]";
    }
}
