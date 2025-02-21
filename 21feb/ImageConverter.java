import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageConverter {
    public static void main(String[] args) {
        String inputImagePath = "original.jpg";
        String outputImagePath = "copied.jpg";

        try {
            byte[] imageData = convertImageToByteArray(inputImagePath);
            writeByteArrayToImage(imageData, outputImagePath);

            boolean isIdentical = verifyFiles(inputImagePath, outputImagePath);
            System.out.println(isIdentical ? " Images are identical!" : " Images are different!");

        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }

    public static byte[] convertImageToByteArray(String filePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(filePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    public static void writeByteArrayToImage(byte[] data, String filePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(filePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static boolean verifyFiles(String file1, String file2) throws IOException {
        byte[] fileData1 = Files.readAllBytes(new File(file1).toPath());
        byte[] fileData2 = Files.readAllBytes(new File(file2).toPath());

        return Arrays.equals(fileData1, fileData2);
    }
}