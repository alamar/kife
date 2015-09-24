package ru.lj.alamar.kife;

import java.util.Random;

import ru.yandex.bolts.function.Function1V;

/**
 * @author ilyak
 */
public class Engine {
    public static Space step(final Space space, final Rules rules) {
        final Space current = new Space();
        int[] boundaries = space.boundaries();
        withCellsInsideBoundaries(space,
            new int[] {
                    boundaries[0] - 1, boundaries[1] + 1,
                    boundaries[2] - 1, boundaries[3] + 1,
                    boundaries[4] - 1, boundaries[5] + 1},
            new Function1V<Cell>() {
                public void apply(Cell me) {
                    int neighbors =
                        (space.isAlive(new Cell(me.x - 1, me.y - 1, me.z - 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x + 1, me.y - 1, me.z - 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x - 1, me.y + 1, me.z - 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x + 1, me.y + 1, me.z - 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x - 1, me.y - 1, me.z + 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x + 1, me.y - 1, me.z + 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x - 1, me.y + 1, me.z + 1)) ? 1 : 0) +
                        (space.isAlive(new Cell(me.x + 1, me.y + 1, me.z + 1)) ? 1 : 0);
                    boolean alive = space.isAlive(me)
                            ? rules.survive[neighbors] : rules.populate[neighbors];
                    if (alive) current.populate(me);
                }
            });
        return current;
    }

    public static Space seed(int[] boundaries, final float density) {
        final Space space = new Space();
        final Random rnd = new Random();
        withCellsInsideBoundaries(space, boundaries, new Function1V<Cell>() {
            public void apply(Cell me) {
                if (rnd.nextFloat() < density) space.populate(me);
            }
        });
        return space;
    }

    private static void withCellsInsideBoundaries(Space space, int[] boundaries, Function1V<Cell> f) {
        for (int x = boundaries[0]; x <= boundaries[1]; x++) {
            for (int y = boundaries[2]; y <= boundaries[3]; y++) {
                for (int z = boundaries[4]; z <= boundaries[5]; z++) {
                    if (!Cell.isGood(x, y, z)) continue;
                    f.apply(new Cell(x, y, z));
                }
            }
        }
    }

}
