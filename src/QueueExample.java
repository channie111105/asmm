import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Person 1");
        queue.add("Person 2");
        queue.add("Person 3");
        queue.add("Person 4");

        System.out.println("Initial queue: " + queue);

        // Remove the first element from the queue (FIFO)
        String removedPerson = queue.poll();
        System.out.println("Served: " + removedPerson);
        System.out.println("Queue after serving: " + queue);

        // Peek at the next element in the queue without removing it
        String nextPerson = queue.peek();
        System.out.println("Next person to be served: " + nextPerson);

        // Check the size of the queue
        System.out.println("Current queue size: " + queue.size());

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
