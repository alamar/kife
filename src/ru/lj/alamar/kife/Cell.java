package ru.lj.alamar.kife;

/**
 * @author ilyak
 */
public class Cell {
    public final int x;
    public final int y;
    public final int z;

    public Cell(int x, int y, int z) {
        assert(isGood(x, y, z));
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Cell [" + x + " : " + y + " : " + z + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cell other = (Cell) obj;
        return x == other.x &&  y == other.y && z == other.z;
    }

    public static boolean isGood(int x, int y, int z) {
        return (x % 2 == y % 2) && (x % 2 == z % 2);
    }
}
