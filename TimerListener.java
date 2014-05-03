import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class TimerListener implements ActionListener
{
    //is a timer that performs the step method
    //syntax for a timer is: 
    /*
     * ActionListener listener = new TimerListener();
     * Timer t = new Timer(interval(in miliseconds), listener); 
     * t.start();
     */
    public void actionPerformed(ActionEvent event){
        Step.step(Main.grid);
    }
}
