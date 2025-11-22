 class Counter {
    static int count = 0;

    public Counter() {
        // Increment the static count every time a new Counter object is created
        count++;
    }

    public static int getCount() {
        return count;
    }

}

public class Count{
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("The number of objects created are : "+Counter.getCount());

    }
}
