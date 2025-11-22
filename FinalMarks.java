import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n =	 sc.nextInt();

        External ext[] = new External[n];
        Internals inMarks[] = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            // Internals
            int im[] = new int[5];
            System.out.println("Enter 5 Internal Marks (out of 50): ");
            for (int j = 0; j < 5; j++)
                im[j] = sc.nextInt();
            inMarks[i] = new Internals(im);

            // SEE Marks
            int sm[] = new int[5];
            System.out.println("Enter 5 SEE Marks (out of 100): ");
            for (int j = 0; j < 5; j++)
                sm[j] = sc.nextInt();

            ext[i] = new External(usn, name, sem, sm);
        }

        // Display Final Marks
        System.out.println("\n================ Final Marks ================");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + ext[i].name + " (" + ext[i].usn + ")");
            System.out.println("Semester: " + ext[i].sem);

            System.out.println("Course\tInternal\tSEE\tFinal");
            for (int j = 0; j < 5; j++) {
                int finalMarks = inMarks[i].internalMarks[j] + ext[i].seeMarks[j];
                System.out.println((j + 1) + "\t\t" + inMarks[i].internalMarks[j] +
                        "\t\t" + ext[i].seeMarks[j] + "\t" + finalMarks);
            }
        }

        sc.close();
    }
}
