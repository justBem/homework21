import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter writer=new FileWriter("alfavit.txt");
         for(char i='A',j='a';i<'Z';i++){
             writer.write(i+" ");
             writer.write(j);
             j++;
             writer.write("\n");
         }
         for(int c=1;c<=9;c++){
             writer.write(c+"\n");
         }
         writer.close();
        FileReader reader=new FileReader("alfavit.txt");
        Scanner scanner=new Scanner(reader);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();
    }
}