package practiice.fileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        write(2, 9);

    }

    public static void write(int first, int second) throws IOException {

        FileWriter fileWriter = new FileWriter("file1.txt");
        for (int i = first; i <= second; i++) {   // Пока first меньше second итерируем до значения true
            fileWriter.write(i + "\n");
        }
        fileWriter.close();
    }
}
