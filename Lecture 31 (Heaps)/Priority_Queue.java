import java.util.*;

public class Priority_Queue {
    // Define a Student class that implements Comparable interface
    static class Student implements Comparable<Student> { 
        String name; // Name of the student
        int rank;    // Rank of the student

        // Constructor to initialize name and rank
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // Overriding the compareTo method for custom sorting logic
        @Override 
        public int compareTo(Student s2) {
            // Ascending order based on rank
            return this.rank - s2.rank; 
        }
    }

    public static void main(String[] args) {
        // Create a PriorityQueue for Student objects
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        // Adding Student objects to the PriorityQueue
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 14));
        pq.add(new Student("C", 42));
        pq.add(new Student("D", 2));
        pq.add(new Student("E", 6));

        // Iterating and removing elements from the PriorityQueue
        while (!pq.isEmpty()) {
            // Peek retrieves the head of the queue without removing it
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); 
            pq.remove(); // Removes the head of the queue
        }
    }
}
