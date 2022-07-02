import java.util.HashMap;

    public class dataStructure<T> {
        HashMap<T, Integer> map;
        int size;

        public dataStructure() {
            map = new HashMap<T, Integer>();
            size = 0;
        }

        public void add(T value) {
            map.put(value, 0);
            size++;
        }

        public void remove(T value) {
            map.remove(value, 0);
            size--;
        }

        public int size() {
            return size;
        }
    }

