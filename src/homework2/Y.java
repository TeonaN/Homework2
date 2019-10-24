package homework2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Y {
    public static void main(String[] args) {
        double y;
        double x;
        try {
            File file = new File("Function.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file);
            for(int i = 100; i <=200; i++){
                x = i/100.0;
                y = x*x + 2*x + 3;
                writer.println(y);


            }


            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

