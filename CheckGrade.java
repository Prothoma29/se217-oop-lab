public class CheckGrade {

    public static void main(String[] args) {
        
        double cgpa = 3.73;
        if (cgpa == 4.00) {
            System.out.println("Outstanding");
        } else if (cgpa >= 3.75) {
            System.out.println("Excellent");
        } else if (cgpa >= 3.50) {
            System.out.println("Very Good");
        } else if (cgpa >= 3.25) {
            System.out.println("Good");
        } else if (cgpa >= 3.00) {
            System.out.println("Satisfactory");

        } else {

            System.out.println("Average");

        }

    }
}