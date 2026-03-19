import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int minn = Integer.MAX_VALUE;
        int seed = A;
        for (int i = A; i <= B; i++) {
            int maxx = 0;
            Random random = new Random(i);
            for (int j = 0; j < N; j++) {
                int num = random.nextInt(K);
                maxx = Math.max(maxx, num);
                if (maxx >= minn) break;
            }
            if (minn > maxx) {
                minn = maxx;
                seed = i;
            }
        }

        System.out.println(seed);
        System.out.println(minn);
    }
}