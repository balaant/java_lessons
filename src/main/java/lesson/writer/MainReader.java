package lesson.writer;

import java.io.*;
public class MainReader {
    public static void main(String... args) {

        try(FileReader reader = new FileReader("notes.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }}