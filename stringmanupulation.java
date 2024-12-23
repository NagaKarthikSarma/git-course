import java.util.Scanner;

public class stringmanupulation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fir = sc.next(), sec = sc.next(), thi = sc.next();
            String s1 = "";
            String s2 = "";
            String s3 = "";

            int i = 0;
            char c;

            for (i = 0; i < fir.length(); i++) {
                c = fir.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    s1 = s1 + '%';
                } else {
                    s1 = s1 + c;
                }
            }

            for (i = 0; i < sec.length(); i++) {
                c = sec.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                        s2 = s2 + '#';
                    } else {
                        s2 = s2 + c;
                    }
                }
            }

            s3 = thi.toUpperCase();
            System.out.println(s1 + s2 + s3);
            
            sc.close(); // Closing the Scanner object here some times ide cannot able to see the
            // sc.close(); so use try method to not getting worning for the leak in progrm.
        }
    }
}
