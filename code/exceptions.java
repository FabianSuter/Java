public class Exceptions{
public static void foo() {
    try{
        System.out.println("A");
        throw new Exception("B");
        System.out.println("C");
    } catch (Exception e) {
        System.out.println("Catch");
        System.out.println(e);
    } finally {
        System.out.println("Finally");
    }}}
// Ausgabe: A Catch java.lang.Exception:B Finally