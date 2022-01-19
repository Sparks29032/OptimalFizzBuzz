import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MakeFizzBuzz {
	public static void main(String[] args) throws IOException {
		generateFizzBuzz("FizzBuzz");
	}
	
	public static void generateFizzBuzz(String className) throws IOException {
		PrintWriter pw = new PrintWriter(new File(className + ".java"));
		pw.println("public class " + className + "{");
		pw.println("\tpublic static void main(String[] args) {");
		pw.print("\t\tSystem.out.println(\"");
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				pw.print("FizzBuzz\\n");
			}
			else if (i % 3 == 0) {
				pw.print("Fizz\\n");
			}
			else if (i % 5 == 0) {
				pw.print("Buzz\\n");
			}
			else {
				pw.print(i + "\\n");
			}
		}
		pw.println("\");");
		pw.println("\t}");
		pw.println("}");
		
		pw.close();
	}
}
