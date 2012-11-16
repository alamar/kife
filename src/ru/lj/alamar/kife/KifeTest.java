package ru.lj.alamar.kife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author ilyak
 */
public class KifeTest {
    @Test
    public void testSpace() {
        Space space = new Space();
        space.populate(new Cell(1, -1, 5));
        space.populate(new Cell(-1, -1, 5));

        assertTrue(space.isAlive(new Cell(-1, -1, 5)));
        assertFalse(space.isAlive(new Cell(-1, -1, 3)));

        int[] boundaries = space.boundaries();
        assertEquals(-1, boundaries[0]);
        assertEquals(1, boundaries[1]);
        assertEquals(-1, boundaries[2]);
        assertEquals(-1, boundaries[3]);
        assertEquals(5, boundaries[4]);
        assertEquals(5, boundaries[5]);
    }
}
