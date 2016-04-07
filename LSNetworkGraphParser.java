import java.io.*;

class LSNetworkGraphParser {
    public LSNetworkGraphParser(String filepath) throws IOException {
        parseFile(filepath);
    }

    public Graph parseFile(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();
    }
}
