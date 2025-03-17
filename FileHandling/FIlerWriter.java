package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIlerWriter {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("test.txt");
      writer.write("Hello World");
      writer.close();
      System.out.println("Success");
    } catch (IOException e) {
      e.printStackTrace();
    }


    // now we will read the data
    try
    {
      FileReader reader = new FileReader("test.txt");
      int i;
      while((i=reader.read())!=-1)
        System.out.print((char)i);
      reader.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
