import java.util.Scanner;

public class TryWithResources {
    public static void main(String args[]) {
        // Try with resources
        try (Scanner scan1 = new Scanner(System.in);
             Scanner scan2 = new Scanner(System.in)) {
            // tu jakieś treści
        } catch (IllegalArgumentException e) {
            System.err.println("Failed: " + e.getMessage());
        }

        ////////////////////////////////////////////////////////////////

        Scanner scan1 = null;
        Scanner scan2 = null;
        try {
            scan1 = new Scanner(System.in);
            scan2 = new Scanner(System.in);
            // tu jakieś treści
//            scan1.close(); <- złe miejsce
        } catch (IllegalArgumentException e) {
            System.err.println("Failed: " + e.getMessage());
        } finally {
            if (scan1 != null) {
                scan1.close();
            }
            if (scan2 != null) {
                scan2.close();
            }
        }

    }
}
