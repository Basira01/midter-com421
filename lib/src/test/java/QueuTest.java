package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class QueueTest {
    public static void main(String[] args) {
        // Create a new Queue
        Queue<Integer> queue = new Queue<>();

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Should print true

        // Enqueue some elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Check the size of the queue
        System.out.println("Size of the queue: " + queue.size()); // Should print 3

        // Peek at the front element
        System.out.println("Front element: " + queue.peek()); // Should print 1

        // Dequeue elements
        int item1 = queue.dequeue();
        int item2 = queue.dequeue();

        // Check the size of the queue after dequeuing
        System.out.println("Size of the queue after dequeuing: " + queue.size()); // Should print 1

        // Dequeue the remaining element
        int item3 = queue.dequeue();

        // Check if the queue is empty after dequeuing all elements
        System.out.println("Is the queue empty after dequeuing all elements? " + queue.isEmpty()); // Should print true

        // Try to dequeue from an empty queue (should throw an exception)
        try {
            int item = queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught an exception: " + e.getMessage()); // Should print "The queue is empty"
        }
    }
}
