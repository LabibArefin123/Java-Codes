package A1;

import java.io.FileReader;

public class File1 {
    //FileReader class is used to read the data from a file. It returns data in byte format.
    public static void main(String[] args) throws Exception{
        FileReader f = new FileReader("C:\\Users\\USER\\IdeaProjects\\A1\\src\\A1\\Test.txt");
        int i;
        while( (i=f.read())!= -1){
            System.out.println((char)i);
        }
        f.close();
    }
}
