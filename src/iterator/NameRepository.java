package iterator;

public class NameRepository implements Container {
    private final String[] names = new String[]{"Robert", "John", "Julie", "Lora"};
    private int index;

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
