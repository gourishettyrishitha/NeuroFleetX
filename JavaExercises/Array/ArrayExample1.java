public class ArrayExample1 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        System.out.println("Fruits in reverse order:");
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }
    }
}
