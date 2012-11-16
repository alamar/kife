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
        for (int i = 1; i <= 50; i++) {
            current = Engine.step(current, Rules.LIFE);
            System.err.println("After " + i + " generations population is " + current.population());
            if ((i % 10) == 0) {
                System.out.println(current);
            }
        }
    }
}
