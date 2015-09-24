package ru.lj.alamar.kife;

/**
 * @author ilyak
 */
public class Main {
    public static void main(String[] args) {
        Space initial = Engine.seed(new int[] {0, 10, 0, 10, 0, 10}, 0.375f);
        System.err.println("Initial pattern population is " + initial.population());
        System.out.println(initial);
        Space current = initial;
        Space previous = null;
        for (int i = 1; i <= 100; i++) {
            current = Engine.step(current, Rules.LIFE);
            int population = current.population();
            System.err.println("After " + i + " generations population is " + population);
            if (population == 0) break;
            if (current.equals(previous)) {
                System.out.println(current);
                break;
            }
            previous = current;
            if ((i % 10) == 0) {
                System.out.println(current);
            }
        }
    }
}
