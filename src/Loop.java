import java.io.IOException;

public class Loop{
    public static void main(String[] args) throws IOException, InterruptedException {
        for(int x = 0; x < 2100; x++){
            System.out.println( x + ") "+ "print('Hello World')");
        }
}
}