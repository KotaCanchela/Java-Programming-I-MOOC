import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weight = 0;
        if (this.items.isEmpty()) {
            return;
        }

        for (Item it: this.items) {
            weight += it.getWeight();
        }
        if (!(weight + item.getWeight() > this.capacity)) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
