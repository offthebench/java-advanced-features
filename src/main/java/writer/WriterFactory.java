package writer;

public class WriterFactory {

    private static WriterFactory instance;

    public WriterFactory() {
    }

    public static WriterFactory getInstance() {
        if (null == instance) {
            instance = new WriterFactory();
        }
        return instance;
    }

    public Writer getWriter(WriterType writerType) {
        if (writerType.equals(WriterType.CONSOLE)) {
            return new ConsoleWriter();
        } else if (writerType.equals(WriterType.FILE)) {
            return new CustomFileWriter();
        }
        return null;
    }
}
