package ru.lj.alamar.kife;

import ru.yandex.bolts.collection.Cf;
import ru.yandex.bolts.collection.SetF;

/**
 * @author ilyak
 */
public class Space {
    private SetF<Cell> cells = Cf.hashSet();

    public int[] boundaries() {
        if (cells.isEmpty()) return new int[] {0, 0, 0, 0, 0, 0};
        int[] boundaries = {Integer.MAX_VALUE, Integer.MIN_VALUE,
                            Integer.MAX_VALUE, Integer.MIN_VALUE,
                            Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (Cell cell : cells) {
            if (cell.x < boundaries[0]) boundaries[0] = cell.x;
            if (cell.x > boundaries[1]) boundaries[1] = cell.x;
            if (cell.y < boundaries[2]) boundaries[2] = cell.y;
            if (cell.y > boundaries[3]) boundaries[3] = cell.y;
            if (cell.z < boundaries[4]) boundaries[4] = cell.z;
            if (cell.z > boundaries[5]) boundaries[5] = cell.z;
        }

        return boundaries;
    }

    public boolean isAlive(Cell cell) {
        return cells.containsTs(cell);
    }

    public void populate(Cell cell) {
        assert(Cell.isGood(cell.x, cell.y, cell.z));
        cells.add(cell);
    }

    @Override
    public String toString() {
        String module = "kife_draw([";
        for (Cell cell : cells) {
            module += String.format("[%d, %d, %d], ", cell.x, cell.y, cell.z);
        }
        return module.substring(0, module.length() - 2) + "]);";
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Space) {
            return cells.equals(((Space)other).cells);
        }
        return false;
    }

    public int population() {
        return cells.size();
    }
}
