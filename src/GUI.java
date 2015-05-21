//GUI.java

import javax.swing.*;
import java.awt.*;

public class GUI
{
    private JFrame frame;
    private JTextArea area;
    private int commandCount;

    public GUI()
    {
        commandCount = 0;
        frame = new JFrame("Programmer's Terminal");
        area = new JTextArea();
        frame.add(area);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void addText(String st)
    {
        //area.append("\n");
        area.append(st);
    }

    public void printPrompt(String st)
    {
        if(commandCount != 0)
            area.append("\n");
        area.append(st);
        area.append(" $ ");
        commandCount++;
    }


}