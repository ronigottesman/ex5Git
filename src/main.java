import javax.sql.rowset.serial.SerialRef;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by ddj on 22/05/17.
 */
public class main {

    public static void x() throws FilterException{
        throw new FilterException();
    }

    public static void main(String[] args) throws Exception{

        try {
            x();
        }catch (Exception e ){
            System.err.println("ERROR:bad format name");
            System.exit(0);
        }

    }
}


