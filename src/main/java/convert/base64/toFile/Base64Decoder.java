package convert.base64.toFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Scanner;

public class Base64Decoder {

	public static void decodeBase64ToFile(String base64String, String outputFilePath) throws IOException {
		// Decode the Base64 string
		byte[] decodedBytes = Base64.getDecoder().decode(base64String);

		// Write the decoded bytes to the output file
		try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
			fos.write(decodedBytes);
		}
	}

	public static void main(String[] args) throws IOException {

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
		System.out.println("Enter the output file extension:");
		String outputFilePathExtension = scanner.nextLine();

		String outputFileName = "";
		String outputFolderName = "Output";

		new File(outputFolderName).mkdirs();

		if (outputFilePathExtension == null || outputFilePathExtension.isEmpty()) {
			outputFilePathExtension = "pdf";
		}

		outputFileName = outputFolderName + "/TempFile_" + getTime() + "." + outputFilePathExtension;

		decodeBase64ToFile(base64String, outputFileName);

		System.out.println("File decoded and saved successfully.");
		scanner.close();
	}

	private static String getTime() {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yy-HH-mm-ss");
		return sdf.format(cal.getTime());
	}
}
