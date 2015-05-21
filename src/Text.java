import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by David on 5/20/2015.
 */
public class Text {

    private String cmdOut;
    private String cmdIn;
    private String currDirct;
    private GUI gui;

    public Text()
    {

    }

    public Text(GUI g)
    {
        gui = g;
        try {
            getCurrentDirectory();
            sendString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendString() throws java.io.IOException, java.lang.InterruptedException
    {
        cmdOut = "ls";
        // Get runtime
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        // Start a new process: UNIX command ls
        java.lang.Process p = rt.exec("ls");
        // You can or maybe should wait for the process to complete
        p.waitFor();
        // Get process' output: its InputStream
        java.io.InputStream is = p.getInputStream();
        java.io.BufferedReader reader = new java.io.BufferedReader(new InputStreamReader(is));
        // And print each line
        String s = null;
        while ((s = reader.readLine()) != null) {
            gui.addText(s);
        }
        is.close();
        System.out.println("This ran");
    }

    public void getCurrentDirectory()
    {
        String st;
        st = System.getProperty("user.dir").toString();
        gui.printPrompt(st);
    }
}
