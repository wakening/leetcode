package others;

import java.util.PriorityQueue;

/**
 * 优先队列
 * PriorityQueue
 *
 * Heap(Binary, Binomial, Fibonacci)
 *   Mini Heap, Max Heap
 * 堆（二叉堆，二项式堆，斐波那契堆）
 * Binary Search Tree 二叉搜索树
 */
public class KLargest703 {

    public static void main(String[] args) {
        // 第K大的数
        int[] arr = {4, 5, 8, 2, 9, 6};
        int k = 3;
        KLargest kLargest = new KLargest(k, arr);
        System.out.println(kLargest.priorityQueue.peek());
        kLargest.priorityQueue.forEach(System.out::print);
        System.out.println();
//        kLargest.priorityQueue.queue;
    }

    static class KLargest {
        private PriorityQueue<Integer> priorityQueue;
        private int k;

        public KLargest(int k, int[] arr) {
            this.k = k;
            this.priorityQueue = new PriorityQueue<>(k);
            for (int a : arr)
                add(a);
        }

        private void add(Integer a) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(a);
            } else if (priorityQueue.peek() < a) {
                priorityQueue.poll();
                priorityQueue.add(a);
            }
        }
    }



}
