package ru.lj.alamar.kife;

import ru.yandex.bolts.collection.Cf;
import ru.yandex.bolts.collection.SetF;
import ru.yandex.bolts.collection.ListF;

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
        StringBuilder module = new StringBuilder("kife_draw([");
        for (Cell cell : cells) {
            module.append(String.format("[%d, %d, %d], ", cell.x, cell.y, cell.z));
        }
        return module.delete(module.length() - 2, module.length()).append("]);").toString();
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

    public static String animate(ListF<Space> spaces) {
        int i = 1;
        StringBuilder result = new StringBuilder("use <kife.scad>\n\ntranslate([-5, -5, -5]) {");
        for (Space space : spaces) {
            if (i == 1) {
                result.append("if ($t < 1/").append(spaces.size()).append(") {\n");
            } else if (i == spaces.size()) {
                result.append("} else {\n");
            } else {
                result.append("} else if ($t < ").append(i).append("/").append(spaces.size()).append(") {\n");
            }
            i++;
            result.append(space).append("\n");
        }
        return result.append("}\n}\n").toString();
    }
}
