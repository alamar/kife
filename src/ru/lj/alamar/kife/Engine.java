package ru.lj.alamar.kife;

/**
 * @author ilyak
 */
public class Engine {
    public Space step(Space old, Rules rules) {
        Space current = new Space();
        int[] boundaries = old.boundaries();
        for (int x = boundaries[0] - 1; x <= boundaries[1] + 1; x++) {
            for (int y = boundaries[2] - 1; x <= boundaries[3] + 1; x++) {
                for (int z = boundaries[4] - 1; x <= boundaries[5] + 1; x++) {
                    if (!Cell.isGood(x, y, z)) continue;
                    Cell me = new Cell(x, y, z);
                    int neighbors = 
                        (old.isAlive(new Cell(x - 1, y - 1, z - 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x + 1, y - 1, z - 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x - 1, y + 1, z - 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x + 1, y + 1, z - 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x - 1, y - 1, z + 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x + 1, y - 1, z + 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x - 1, y + 1, z + 1)) ? 1 : 0) +
                        (old.isAlive(new Cell(x + 1, y + 1, z + 1)) ? 1 : 0);
                    boolean alive = old.isAlive(me)
                            ? rules.survive[neighbors] : rules.populate[neighbors];
                    if (alive) old.populate(me);
                }
            }
        }
        return current;
    }
}
