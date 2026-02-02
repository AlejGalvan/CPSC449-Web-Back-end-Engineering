@FunctionalInterface
    interface A {
        void display();
    }

    // class B implements A {
    //     public void display() {
    //         System.out.println("Implementation of display method in class B");
    //     }
    // }





public class FunctionalDemo {
    

    public static void main(String[] args) {
        A b = () -> System.out.println("Implementation of display method using Anonymous Class");
        b.display();

    }
}
