/*
 * 2014 - 2015 APCS A Blue Screen project.
 * 
 * @author Lucy Dong
 * @author Lukas Goodman
 * @author Jefferson Kim
 * @author Qiuyue Liu
 * @author Sarah Luettgen
 * @author Billy Miller
 * @author Michael Moran
 * @author William Qi
 * @author Kristine Xu
 * @author Ashley Yu
 * @author Jeremy Yu
 * 
 */

/**
 * This is the map and the methods for moving around the map
 *
 */
public class Map {
  public enum Move{FOWARD, BACKWARD, LEFT, RIGHT};
  public String[][] grid;
  public String[][] gridNoCharacter;
//public int[][] screen;
  public int playerX;
  public int playerY;
  
  public Map(){
	 final int SIZE = 21;
	 int middle = (SIZE - 1) / 2;
	
	playerX = middle;
    playerY = middle;
    grid = new String[SIZE][SIZE];
    
    for(int r = 0; r < SIZE; r++)
    	for(int c = 0; c < SIZE; c++)
    		grid[r][c] = "*";
    
    grid[middle][middle] = "@";
    
    int randRow;
    int randCol;
    for(int i = 0; i < 5; i++)// 5 Friends Houses
    {
    	randRow = (int)(Math.random() * SIZE);
    	randCol = (int)(Math.random() * SIZE);
    	if(grid[randRow][randCol].equals("*"))
    		grid[randRow][randCol] = "H";
    	else
    		i--;
    }
    
    for(int i = 0; i < 5; i++)// 5 Coffee Shops
    {
    	randRow = (int)(Math.random() * SIZE);
    	randCol = (int)(Math.random() * SIZE);
    	if(grid[randRow][randCol].equals("*"))
    		grid[randRow][randCol] = "C";
    	else
    		i--;
    }
    
    for(int i = 0; i < 5; i++)// 5 Office supply Stores
    {
    	randRow = (int)(Math.random() * SIZE);
    	randCol = (int)(Math.random() * SIZE);
    	if(grid[randRow][randCol].equals("*"))
    		grid[randRow][randCol] = "O";
    	else
    		i--;
    }
    
    for(int i = 0; i < 1; i++)// 1 School
    {
    	randRow = (int)(Math.random() * SIZE);
    	randCol = (int)(Math.random() * SIZE);
    	if(grid[randRow][randCol].equals("*"))
    		grid[randRow][randCol] = "S";
    	else
    		i--;
    }
    
    gridNoCharacter = new String[SIZE][SIZE];
    for(int r = 0; r < SIZE; r++)
    	for(int c = 0; c < SIZE; c++)
    		gridNoCharacter[r][c] = grid[r][c];
    gridNoCharacter[middle][middle] = "A";
    
  }
  
  public String[][]getData(){return grid;}
  public int getPlayerX(){return playerX;}
  public int getPlayerY(){return playerY;}
  
  public void movePlayer(String d){
    d = d.toUpperCase();
    int tempX = playerX;
    int tempY = playerY;
    if (d == "FORWARD" || d == "UP") playerY--;
    if (d == "BACKWARD" || d == "DOWN") playerY++;
    if (d == "LEFT") playerX--;
    if (d == "RIGHT") playerX++;
    grid[playerY][playerX] = "@";
    grid[tempY][tempX] = gridNoCharacter[tempY][tempX];
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++)
    {
    	for(int c = 0; c < grid[r].length; c++)
    	{
    		ans += grid[r][c] + " ";
    	}
    	ans += "\n";
    }
    return ans;
  }
  
  public static void main(String[] args)
  {
	  Map test = new Map();
	  test.movePlayer("RIGHT");
	  test.movePlayer("RIGHT");
	  test.movePlayer("UP");
	  test.movePlayer("RIGHT");
	  test.movePlayer("RIGHT");
	  System.out.println(test);
  }
}

