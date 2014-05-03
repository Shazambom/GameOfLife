import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
public class ClickListener implements ActionListener
{
    //detects clicks on the buttons within the button array and sets the grid value and the color of the 
    //button accordingly
    private int x;
    private int y;
    public ClickListener(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }
    public void actionPerformed(ActionEvent event){
        Main.grid.setGrid(this.x, this.y, true);
        Main.buttonGrid[this.x][this.y].setBackground(Color.YELLOW);
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
