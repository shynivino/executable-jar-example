package company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Executing command...");
        ProcessBuilder pb = new ProcessBuilder("echo", "hello", "world");
        Process process = pb.start();
        int errCode = process.waitFor();
        System.out.println("execution status: " + errCode);
    }
}
