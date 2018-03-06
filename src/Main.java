import org.antlr.runtime.ANTLRFileStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello wordl !");
        //System.out.println("File to load: " + args[0]);

        //To load the file use the following code

        ANTLRFileStream input = null;

		try
		{
		    input = new ANTLRFileStream("exemples/valide/ex1.rs");
            System.out.println(input);
        }
		catch (IOException e)
        {
            e.printStackTrace();
        }


        // If everything is OK while compiling
        System.exit(0);
        // If there is an error
        //System.exit(-1);
    }
}
