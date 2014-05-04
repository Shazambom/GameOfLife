import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
/* Main issue currently: 
 * Get the Logic to work correctly
 */
public class Main
{
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 750;
    static Grid grid = new Grid();
    static JButton[][] buttonGrid;
    static ActionListener[][] listener;
    //is the main function of the program. Sets up the frame, grid object, Button array, and 
    //clicklistener array(which needs to fucking remember its position in the array)
    //HURRAY CLICKLISTENER REMEMBERS ITS POSITION
    public static void main ( String[] args ){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(grid.getX(),grid.getY()));
        buttonGrid = new JButton[grid.getX()][grid.getY()];
        listener = new ClickListener[grid.getX()][grid.getY()];
        for(int i = 0; i < grid.getX(); i++){
            for(int j = 0; j < grid.getY(); j++){
                buttonGrid[i][j] = new JButton();
                final JButton aButton = buttonGrid[i][j];
                final ActionListener a = new ClickListener(i,j);
                listener[i][j] = a;
                aButton.addActionListener(a);
                buttonGrid[i][j].setBackground(Color.lightGray);
                frame.add(buttonGrid[i][j]);
            }
        }
        frame.pack();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame startButton = new JFrame();
        startButton.setLayout(new GridLayout(1,1));
        startButton.setSize(200,100);
        JButton start = new JButton("Start");
        ActionListener sListener = new StartListener();
        start.addActionListener(sListener);
        startButton.add(start);
        
        JButton step = new JButton("Step");
        ActionListener stListener = new TimerListener();
        step.addActionListener(stListener);
        startButton.add(step);
        startButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startButton.setVisible(true);
    }
}
