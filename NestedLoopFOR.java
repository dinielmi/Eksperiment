public class NestedLoopFOR {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n; i++){                    // outer loop
            for (int j = 0; j < n;j++){                 // inner loop
                System.out.println("Statement a"+ (i));
            }
            System.out.println("Statement b");
        }
    }
}
