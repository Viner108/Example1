import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Work1 {
    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        long size = 0;
        long size7 = 0;
        int k = 0;
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Path.of("D:/TEMP/fileName.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum(bytes));
    }
    public static void delete(){
//sa;ldkjfa;lskdjf jk;asdflkj;lkj
    }
    public static int sum( byte[] bytes) {
        int j = 0;
        int i;
        byte b1;
        byte b2;
        for (i = 0; i < bytes.length; i++) {
            b1 = bytes[i];
            b2 = bytes[i + 1];
            if (b1 == 13 || b1 == 10) {

            } else if (b1 == 48&& b2 ==13) {
                System.out.println(0);
            }
            else if (b1 == 49&& b2 ==13) {
                System.out.println(1);
            }
            else if (b1 == 50&& b2 ==13) {
                System.out.println(2);
            }
            else if (b1 == 51&& b2 ==13) {
                System.out.println(3);
            }
            else if (b1 == 52&& b2 ==13) {
                System.out.println(4);
            }
            else if (b1 == 53&& b2 ==13) {
                System.out.println(5);
            }
            else if (b1 == 54&& b2 ==13) {
                System.out.println(6);
            }
            else if (b1 == 55&& b2 ==13) {
                System.out.println(7);
            }
            else if (b1 == 56&& b2 ==13) {
                System.out.println(8);
            }
            else if (b1 == 57&& b2 ==13) {
                System.out.println(9);;
            }
            else if (b1 == 48&& b2 !=13) {
                System.out.print(0);
            }
            else if (b1 == 49&& b2 !=13) {
                System.out.print(1);
            }
            else if (b1 == 50&& b2 !=13) {
                System.out.print(2);
            }
            else if (b1 == 51&& b2 !=13) {
                System.out.print(3);
            }
            else if (b1 == 52&& b2 !=13) {
                System.out.print(4);
            }
            else if (b1 == 53&& b2 !=13) {
                System.out.print(5);
            }
            else if (b1 == 54&& b2 !=13) {
                System.out.print(6);
            }
            else if (b1 == 55&& b2 !=13) {
                System.out.print(7);
            }
            else if (b1 == 56&& b2 !=13) {
                System.out.print(8);
            }
            else if (b1 == 57&& b2 !=13) {
                System.out.print(9);;
            }
            else {
                System.out.print(bytes[i]);
            }
        }
        return j;
    }
}
