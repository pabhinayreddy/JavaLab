import java.util.*;
class Patient {
    String name;
    int emergencyLevel;
    Patient(String name, int emergencyLevel) {
        this.name = name;
        this.emergencyLevel = emergencyLevel;
    }
    public String toString() {
        return name + "-" + emergencyLevel;
    }
}
public class B2 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Ravi");
        queue.offer("Sita");
        queue.offer("Anil");
        System.out.println("Queue: " + queue);
        System.out.println("Next Customer: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
            System.out.println("Queue: " + queue);
        }
        System.out.println("Polling Empty Queue: " + queue.poll());
        Comparator<Patient> comparator =
                (p1, p2) -> Integer.compare(
                        p2.emergencyLevel, p1.emergencyLevel);
        PriorityQueue<Patient> priorityQueue =
                new PriorityQueue<>(comparator);
        priorityQueue.offer(new Patient("Charan", 1));
        priorityQueue.offer(new Patient("Bala", 2));
        priorityQueue.offer(new Patient("Amit", 3));
        System.out.println("Priority Queue Order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        Queue<String> linkedQueue = new LinkedList<>();
        linkedQueue.offer("Ravi");
        linkedQueue.offer("Sita");
        linkedQueue.offer("Anil");

        System.out.println("LinkedList Queue: " + linkedQueue);

        System.out.println("LinkedList Queue Service:");
        while (!linkedQueue.isEmpty()) {
            System.out.println("Serving: " + linkedQueue.poll());
        }
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("First");
        deque.offerLast("Last");

        System.out.println("Deque: " + deque);
        System.out.println("Final Queue Size: " + queue.size());
        System.out.println("Final Priority Queue Size: "
                + priorityQueue.size());
    }
}