package convert.base64.toFile;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Scanner;

public class Base64Decoder {

	public static byte[] decodedBytes;
	public static String tempString = "Hello";

	public static void main(String[] args) throws IOException, InterruptedException {

		myBas64Decodeer();

	}

	public static void myBas64Decodeer() throws IOException, InterruptedException {

		Scanner scanner = new Scanner(System.in);

		String base64String = "";

		do {

			// Prompt the user for the Base64 encoded string
			System.out.println("Enter the Base64 encoded string:");
			base64String = scanner.nextLine();
			if (base64String == null || base64String.isEmpty()) {
				System.out.println("Base64 encoded string cannot be empty\n");
				base64String = null;
			}
		} while (base64String == null);

		// Prompt the user for the output file path
		String outputFileName = "";
		String outputFolderName = "Output";

		new File(outputFolderName).mkdirs();

		outputFileName = System.getProperty("user.dir") + "\\" + outputFolderName + "\\TempFile_" + getTime() + "."
				+ getFormat(base64String);

		// Write the decoded bytes to the output file
		try (FileOutputStream fos = new FileOutputStream(outputFileName)) {
			fos.write(decodedBytes);
		}

		File outputFile = new File(outputFileName);

		System.out.println("File decoded and saved successfully at: " + outputFileName);

		System.out.println("Opening file...");
		Thread.sleep(1500);

		Desktop desktop = Desktop.getDesktop();

		desktop.open(outputFile);

		scanner.close();
	}

	public static String getFormat(String base64String) {

		decodedBytes = Base64.getDecoder().decode(base64String);

		// Check if the file is a PDF
		if (decodedBytes.length > 3 && decodedBytes[0] == (byte) 0x25 && decodedBytes[1] == (byte) 0x50
				&& decodedBytes[2] == (byte) 0x44 && decodedBytes[3] == (byte) 0x46) {
			return "pdf";
		} else if (decodedBytes.length > 3 && decodedBytes[0] == (byte) 0xFF && decodedBytes[1] == (byte) 0xD8
				&& decodedBytes[2] == (byte) 0xFF) {
			return "jpg";
		} else if (decodedBytes.length > 3 && decodedBytes[0] == (byte) 0x89 && decodedBytes[1] == (byte) 0x50
				&& decodedBytes[2] == (byte) 0x4E && decodedBytes[3] == (byte) 0x47) {
			return "png";
		} else if (decodedBytes.length > 3 && decodedBytes[0] == (byte) 0x47 && decodedBytes[1] == (byte) 0x49
				&& decodedBytes[2] == (byte) 0x46 && decodedBytes[3] == (byte) 0x38) {
			return "gif";
		} else {
			// Add more file type checks as needed
			return "unknown";
		}
	}

	private static String getTime() {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yy-HH-mm-ss");
		return sdf.format(cal.getTime());
	}
}
