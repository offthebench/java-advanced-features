package reader;

public class ReaderFactory {

    private static ReaderFactory instance;

    private ReaderFactory() {
    }

    public static ReaderFactory getInstance() {
        if (null == instance) {
            instance = new ReaderFactory();
        }
        return instance;
    }

    public Reader getReader() {
        return new ConsoleReader();
    }

    public Reader getReader(String filePath) {
        return new CustomFileReader(filePath);
    }
}
