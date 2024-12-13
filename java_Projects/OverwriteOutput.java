public class OverwriteOutput {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Old output");
        Thread.sleep(2000); // Wait for 2 seconds
        System.out.print("\rNew output");
    }
}

