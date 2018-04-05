package Controllers;
import java.io.*;

public class Z3Controller {
    public static void main(String[] args) throws Exception {
        try {
            String pathToFile = "../../../../../src/main/resources/static/";
            String smtFile = args[0];
            String outFile = smtFile.split("\\.")[0];
            ProcessBuilder pb = new ProcessBuilder("z3", pathToFile + smtFile);
            final Process p = pb.start();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(p.getInputStream())
            );
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(new File("../" + outFile + ".out"))
            );
            String line;
            while((line = br.readLine())!=null) {
                bw.write(line);
            }
            bw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Successful");
    }
}
