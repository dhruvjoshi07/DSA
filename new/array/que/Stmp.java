package que;

public class Stmp {
    public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {65, 80, 90, 72, 88};

        int sum = 0;
        int highest = marks[0];
        int countAbove75 = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] > 75) {
                countAbove75++;
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Students scoring above 75: " + countAbove75);
    }
}

}
