package ru.lj.alamar.kife;

import ru.yandex.bolts.collection.Cf;
import ru.yandex.bolts.collection.ListF;

/**
 * @author ilyak
 */
public class Main {
    public static void main(String[] args) {
        Space initial = Engine.seed(new int[] {0, 10, 0, 10, 0, 10}, 0.375f);
        System.err.println("Initial pattern population is " + initial.population());
        System.err.println(initial);
        ListF<Space> spaces = Cf.arrayList();
        Space current = initial;
        Space previous = initial;
        spaces.add(initial);
        for (int i = 1; i <= 100; i++) {
            current = Engine.step(current, Rules.LIFE);
            int population = current.population();
            if (population == 0) break;
            if (current.equals(previous)) {
                System.err.println("Final pattern population is " + current.population()); 
                break;
            }
            previous = current;
            spaces.add(current);
            System.err.println(current);
        }
        System.out.println(Space.animate(spaces));
    }
}
