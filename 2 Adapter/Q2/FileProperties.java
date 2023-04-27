import java.io.IOException;
import java.util.Properties;

// FileProperties 클래스를 구현해 보세요.
class FileProperties implements FileIO {
	Properties properties;
	@Override
	public void readFromFile(String filename) throws IOException {
		properties.getProperty()
	}

	@Override
	public void writeToFile(String filename) throws IOException {

	}

	@Override
	public void setValue(String key, String value) {

	}

	@Override
	public String getValue(String key) {
		return null;
	}
}