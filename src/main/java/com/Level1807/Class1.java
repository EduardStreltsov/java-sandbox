package main.java.com.Level1807;

import java.io.*;

public class Class1 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        InputStream is = new ByteArrayInputStream(data.getBytes());

        System.setIn(is);

        getReadAndPringLine();

    }

    private static void getReadAndPringLine() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }

        br.close();
        isr.close();
    }
}
