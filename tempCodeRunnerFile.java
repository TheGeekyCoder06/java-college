import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class SonAgeException extends Exception {
    public SonAgeException(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative");
        }
        this.fatherAge = age;
        System.out.println("Father's age set to " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAgeException, SonAgeException {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new SonAgeException("Son's age cannot be >= Father's age");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age set to " + sonAge);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter son and father's age");
        int sonAge = sc.nextInt();
        int fatherAge = sc.nextInt();
        try {
            Son s = new Son(sonAge , fatherAge);
        } catch (WrongAgeException e) {
            System.out.println("Wrong Age exception: " + e.getMessage());
        } catch (SonAgeException e) {
            System.out.println("Son age error: " + e.getMessage());
        }
    }
}
