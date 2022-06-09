public class SmashStones {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int weight : stones) {
            queue.add(weight);
        }

        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
            if (y > x)
                queue.add(y - x);
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
