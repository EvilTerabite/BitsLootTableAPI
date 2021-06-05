package me.evilterabite.bitsloottableapi.lib;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightedRandomBag<T> {

    private class Entered {
        double accumulatedWeight;
        T object;
    }

    private final List<Entered> entries = new ArrayList<>();
    private double accumulatedWeight;
    private final Random rand = new Random();

    public void addEntry(T object, double weight) {
        accumulatedWeight += weight;
        Entered e = new Entered();
        e.object = object;
        e.accumulatedWeight = accumulatedWeight;
        entries.add(e);
    }

    public T getRandom() {
        double r = rand.nextDouble() * accumulatedWeight;

        for (Entered entry: entries) {
            if (entry.accumulatedWeight >= r) {
                return entry.object;
            }
        }
        return null; //should only happen when there are no entries
    }
}
