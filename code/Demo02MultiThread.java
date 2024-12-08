public class Demo02MultiThread {
    public static void main(String[] args) {
        var thread1 = new Thread(() -> print("A"));
        var thread2 = new Thread(() -> print("B"));
        thread1.start();
        thread2.start();
        System.out.println("main finished");
    }
        static void print(String label) {
            for (int i = 0; i<5; i++) {
                System.out.println(label + ": " + i + ",");
        }
    } 
}
// Ausgabe: A:1, B:1, A:2, B:2, ...