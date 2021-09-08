package A1;

import java.io.*;

public class File2 {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("");
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\A1\\src\\A1\\Test.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!= -1){
                //System.out.print((char)i);
                str.append((char)i);
            }
            bin.close();
            fin.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        System.out.print(str);
        String s = str.toString();
        System.out.print(s);
        String[] c = s.split(" ");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
}
