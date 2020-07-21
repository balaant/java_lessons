package lesson.buffer;

import java.io.*;

public class BufferReadWrite {
        public static void main(String... args) {
            try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt")))
            {
                // чтение построчно
                String text;
                while(!(text=br.readLine()).equals("ESC")){
                    bw.write(text + "\n");
                    bw.flush();
                }
            } catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
}