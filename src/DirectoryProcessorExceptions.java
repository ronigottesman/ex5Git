/**
 * Created by ddj on 22/05/17.
 */
public abstract class DirectoryProcessorExceptions extends Exception {

    public DirectoryProcessorExceptions() {
    }

    public DirectoryProcessorExceptions(String message) {
        super(message);
    }

    void asWarning(int line){
        System.err.println("Warning in line "+line);
    }
}
