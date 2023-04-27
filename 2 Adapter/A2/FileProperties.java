import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties property = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        property.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        property.store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        property.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return property.getProperty(key, "");
    }
}
