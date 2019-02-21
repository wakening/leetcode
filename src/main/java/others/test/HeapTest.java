package others.test;

/**
 * 实现堆
 */
public class HeapTest {

    public static void main(String[] args) {
        Heap heap = new Heap(11);
        heap.add(0.15);
        heap.add(0.13);
        System.out.println(heap.peek());
        heap.add(0.12);
        heap.add(0.17);
        System.out.println(heap.peek());
    }

}

class Heap {
    private double[] queue;
    private int size;

    public Heap(int capacity) {
        queue = new double[capacity];
        size = 0;
    }

    public boolean add(double k) {
        if (size >= queue.length) {
            // queue扩容
        }
        int i = size;
        while (i > 0) {
            int parent = (i - 1) >>> 1;
            double p = queue[parent];
            if (k >= p) {
                break;
            }
            queue[i] = p;
            i = parent;
        }
        queue[i] = k;
        size++;
        return true;
    }

    public double peek() {
        return queue[0];
    }
}
