/*
Task 2:-Exam Seating Arrangement System in Java
------


Code:-
-------
*/
import java.util.*;

public class ExamSeatingArrangement {

    public static void main(String[] args) {
        // Create a list of students.
        List<String> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            students.add("Seat " + i);
        }

        // Create a random number generator.
        Random random = new Random();

        // Generate the seating arrangement.
        List<String> seatingArrangement = new ArrayList<>();
        HashSet<String> studentSet = new HashSet<>();
        Map<String, Integer> rollNoToSeatNoMap = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            String student = students.get(random.nextInt(students.size()));
            if (!studentSet.contains(student)) {
                studentSet.add(student);
                seatingArrangement.add(student);
                rollNoToSeatNoMap.put(student, i);
            }
        }

        // Print the seating arrangement.
        System.out.println("The seating arrangement is:");
        for (int i = 0; i < seatingArrangement.size(); i++) {
            System.out.println(seatingArrangement.get(i) + " - Roll number: " + rollNoToSeatNoMap.get(seatingArrangement.get(i)));
        }
    }
}

/*

Output 1:-
------------

The seating arrangement is:
Seat 2 - Roll number: 0
Seat 4 - Roll number: 1
Seat 3 - Roll number: 2
Seat 1 - Roll number: 3


Output 2:-
------------

The seating arrangement is:
Seat 4 - Roll number: 0
Seat 3 - Roll number: 1
Seat 0 - Roll number: 3
Seat 1 - Roll number: 4
 */

