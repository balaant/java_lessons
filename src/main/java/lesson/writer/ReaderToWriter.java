package lesson.writer;

import java.io.*;
public class ReaderToWriter {
    public static void main(String... args) throws IOException {
        char[] buff = new char[10];
        FileReader reader = new FileReader("notes.txt");
        FileWriter writer = new FileWriter("to.txt");
        while (reader.ready()) {
            int nSymbols = reader.read(buff);
            writer.write(buff, 0, nSymbols);
        }
        // Также методу write() можно передать строку:
        writer.write("Привет!");
        reader.close();
        writer.close();
    }
}
