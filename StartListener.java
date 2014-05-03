import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
public class StartListener implements ActionListener
{
    public void actionPerformed(ActionEvent event){
      ActionListener listener = new TimerListener();
      Timer t = new Timer(100, listener);
      t.start();
    }
}
