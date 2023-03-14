import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Work2 {
    public static void main(String[] args) {
        int k = 0;
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Path.of("D:/TEMP/fileName.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum(bytes));
        System.out.println(txt1(bytes));
    }
    public static int sum( byte[] bytes) {
        int k = 0;
        int i;
        byte b1;
        byte b2;
        for (i = 0; i < bytes.length; i++) {
            b1 = bytes[i];
            b2 = bytes[i + 1];
            if (b1 == 13 || b1 == 10) {
            }
            else if (b1 == 48&& b2 ==13) {
                b1 = 0;
                System.out.println(b1);

            }else if (b1 == 49&& b2 ==13) {
                b1 = 1;
                System.out.println(b1);
            } else if (b1 == 50&& b2 ==13) {
                b1 = 2;
                System.out.println(b1);

            } else if (b1 == 51&& b2 ==13) {
                b1 = 3;
                System.out.println(b1);

            } else if (b1 == 52&& b2 ==13) {
                b1 = 4;
                System.out.println(b1);

            } else if ( b1 !=13) {
                b1 += bytes[i]*Math.pow(10,txt1(bytes)-1-i);
                System.out.println(b1);

            } else {
                System.out.println(bytes[i]);
            }

        }return k;
    }
   public static int txt1(byte[] bytes){
        int j = 0;
        for (int i = 0; i < bytes.length && bytes [i] != 13; i++) {
            j++;
        }
        return j;
    }

}
