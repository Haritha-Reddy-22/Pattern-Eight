public class PatternEight {
    public static void main(String[] args) {
        int n = 5; // This is the size of the pattern
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // First row: All stars
                if (i == 1) {
                    System.out.print("* ");
                }
                // Second row: Two stars, 1 O, 2 stars
                else if (i == 2 && (j == 1 || j == 2 || j == 4 || j == 5)) {
                    System.out.print("* ");
                } else if (i == 2 && j == 3) {
                    System.out.print("O ");
                }
                // Third row: Alternating stars and O's
                else if (i == 3) {
                    if (j % 2 == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("O ");
                    }
                }
                // Fourth row: Same as the second row
                else if (i == 4 && (j == 1 || j == 2 || j == 4 || j == 5)) {
                    System.out.print("* ");
                } else if (i == 4 && j == 3) {
                    System.out.print("O ");
                }
                // Fifth row: All stars
                else if (i == 5) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
