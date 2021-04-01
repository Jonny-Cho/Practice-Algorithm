package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/16394">
 * https://www.acmicpc.net/problem/16394 홍익대학교
 * </a>
 */
public class BOJ_16394 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        final int HONG_DAE_OPENING_YEAR = 1946;
        System.out.println(year - HONG_DAE_OPENING_YEAR);
        sc.close();
    }
}
