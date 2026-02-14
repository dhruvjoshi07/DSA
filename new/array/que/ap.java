package que;

public class ap {
    public class Attendance {
    public static void main(String[] args) {
        int[] attendance = {1,1,0,1,0,0,1,1,1,0};

        int present = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1) {
                present++;
            }
        }

        int absent = attendance.length - present;
        double percentage = (double) present / attendance.length * 100;

        System.out.println("Total Present: " + present);
        System.out.println("Total Absent: " + absent);
        System.out.println("Attendance Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Attendance is above 75%");
        } else {
            System.out.println("Attendance is below 75%");
        }
    }
}

}
