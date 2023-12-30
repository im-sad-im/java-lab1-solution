import java.io.*;

public class ByteCharacterStream {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String byteStreamOutputFile = "byteStreamOutput.txt";
        String charStreamOutputFile = "charStreamOutput.txt";
        // Using Byte Stream (FileInputStream and FileOutputStream)
        byteStream(inputFile, byteStreamOutputFile);
        // Using Character Stream (FileReader and FileWriter)
        charStream(byteStreamOutputFile, charStreamOutputFile);
    }

    private static void byteStream(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
                FileOutputStream fos = new FileOutputStream(outputFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                // Convert to uppercase
                byteData = Character.toUpperCase((char) byteData);
                // Write to the output file using Byte Stream
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void charStream(String inputFile, String outputFile) {
        try (FileReader fr = new FileReader(inputFile);
                FileWriter fw = new FileWriter(outputFile)) {

            int charData;
            while ((charData = fr.read()) != -1) {
                // Convert to uppercase
                charData = Character.toUpperCase((char) charData);
                // Write to the output file using Character Stream
                fw.write(charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
