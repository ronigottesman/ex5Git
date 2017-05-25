import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Created by ddj on 22/05/17.
 */
public class Parser {
    String NEW_LINE="\n";

    File commands;
    Scanner reader;
    public Parser(String path) {
        this.commands=new File(path);
        try {
            reader =new Scanner(commands);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }


//    public String[] parse(){
//        String[] lines=new String[];
//        reader.
//        while(reader.hasNext()) {
//            lines.add(reader.next());
////             System.out.println(lines);
////            System.out.println(reader.next());
//        }
//        return lines;
//    }
    private String cleanLine(String line){
        if(line.contains(NEW_LINE)){
            line.replace(NEW_LINE,"");
        }
        return line;
    }








//    String parse(){
//        while (reader.hasNextLine()){
//
//        }
//
//    }


}
