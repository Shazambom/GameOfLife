public class Grid
{
    private boolean[][] grid;
    private int x;
    private int y;
    //initializes the grid and its lengths
    public Grid(){
        this.x = 50;
        this.y = 50;
        this.grid = new boolean[x][y];
        for(int i = 0; i < this.x; i++){
            for (int j = 0; i < this.y; i++){
                this.grid[i][j]= false;
            }
        }
    }
    //initializes the grid and its lengths with width and height parameters 
    public Grid(int a, int b){
        this.x = a;
        this.y = b;
        this.grid = new boolean[x][y];
        for(int i = 0; i < this.x; i++){
            for (int j = 0; i < this.y; i++){
                grid[i][j]= false;
            }
        }
    }
    //returns the actual boolean grid
    public boolean[][] getGrid(){
        return this.grid;
    }
    //checks if the cell is alive or not
    public boolean live(int posx, int posy){
        if(posx < this.x -1 && posy < this.y -1 && posx > 0 && posy > 0){
            int count = 0;
            if(this.grid[posx+1][posy])count++;
            if(this.grid[posx-1][posy])count++;
            if(this.grid[posx][posy+1])count++;
            if(this.grid[posx][posy-1])count++;
            if(this.grid[posx+1][posy+1])count++;
            if(this.grid[posx-1][posy-1])count++;
            if(this.grid[posx+1][posy-1])count++;
            if(this.grid[posx-1][posy+1])count++;
            if(this.grid[posx][posy]){
                if(count < 2) return false;
                else if(count >= 2 && count <= 3) return true;
                else return false;
            }
            else{
                if(count == 3) return true;
                else return false;
            }
        }
        else return false;
    }
    //sets the cell to alive or dead
    public void setGrid(int a, int b, boolean c){
        if(a < this.x && b < this.y)
        this.grid[a][b] = c;
    }
    //gets the length of the grid
    public int getX(){
        return this.x;
    }
    //gets the hight of the grid
    public int getY(){
        return this.y;
    }
}
