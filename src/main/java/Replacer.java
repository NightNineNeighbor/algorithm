import java.util.Scanner;

public class Replacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().replace("[", "{").replace("]", "}"));
    }
}
