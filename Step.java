import java.awt.*;
//activates on a timer and checks the grid cell by cell to see if each cell is alive and 
//it sets the cell to the appropriate true or false value
//also changes the color of the button in the graphic to reflect the grid
public class Step
{
    public static void step(Grid a){
        Grid grid = new Grid(a.getX(), a.getY());
        for(int i = 0; i < a.getX(); i++){
            for(int j = 0; j < a.getY(); j++){
                grid.setGrid(i,j,a.live(i,j));
            }
        }
        for(int i = 0; i < a.getX(); i++){
            for(int j = 0; j < a.getY(); j++){
                a.setGrid(i,j,grid.getGrid()[i][j]);
                if(a.getGrid()[i][j]){
                    Main.buttonGrid[i][j].setBackground(Color.YELLOW);
                }
                else Main.buttonGrid[i][j].setBackground(Color.lightGray);
            }
        }
    }
}
