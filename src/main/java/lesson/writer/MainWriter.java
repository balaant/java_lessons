package lesson.writer;

import java.io.*;
public class MainWriter {
    public static void main(String... args) {

        try(FileWriter writer = new FileWriter("notes.txt", false))
        {
            // запись всей строки
            String text = "Hello!";
            writer.write(text);

            // запись по символам
            writer.append('\n');
            writer.append('A');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }}