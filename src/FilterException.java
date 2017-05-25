import java.io.IOException;

/**
 * Created by ddj on 22/05/17.
 */
public class FilterException extends DirectoryProcessorExceptions{

    //String FILTER_EXCEPTION_MESSAGE="Bad Filter Format";

    public FilterException() {
        super("Bad Filter Format");
    }

    public FilterException(String message) {
        super(message);
    }
}




