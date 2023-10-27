public class lab1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        int max = 5000;
        int min = 0;
        int total = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(total);
    }
}
