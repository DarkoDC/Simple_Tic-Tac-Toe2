import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split(" ");

        boolean isaAlphabeticalOrdered = true;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].compareTo(strings[i]) > 0) {
                isaAlphabeticalOrdered = false;
                break;
            }
        }
        System.out.println(isaAlphabeticalOrdered);
    }
}