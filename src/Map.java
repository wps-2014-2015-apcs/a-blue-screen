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
  public String[][] grid;
  public String[][] gridNoCharacter;
//public int[][] screen;
  public int playerX;
  public int playerY;
  
  public Map(){
    final int SIZE = 21;
    int m = (SIZE - 1) / 2;
    playerX = m; playerY = m;
    grid = new String[SIZE][SIZE];
    for(int r = 0; r < SIZE; r++) for(int c = 0; c < SIZE; c++) grid[r][c] = "*";
    grid[m][m] = "@";
    int randRow;
    int randCol;
    for(int i = 0; i < 5; i++)// 5 Friends Houses
    {
      randRow = (int)(Math.random() * SIZE);
      randCol = (int)(Math.random() * SIZE);
      if(grid[randRow][randCol].equals("*")) grid[randRow][randCol] = "H";
      else i--;
    }
    for(int i = 0; i < 5; i++)// 5 Coffee Shops
    {
      randRow = (int)(Math.random() * SIZE);
      randCol = (int)(Math.random() * SIZE);
      if(grid[randRow][randCol].equals("*")) grid[randRow][randCol] = "C";
      else i--;
    }
    for(int i = 0; i < 5; i++)// 5 Office supply Stores
    {
      randRow = (int)(Math.random() * SIZE);
      randCol = (int)(Math.random() * SIZE);
      if(grid[randRow][randCol].equals("*")) grid[randRow][randCol] = "O";
      else i--;
    }
    for(int i = 0; i < 1; i++)// 1 School
    {
      randRow = (int)(Math.random() * SIZE);
      randCol = (int)(Math.random() * SIZE);
      if(grid[randRow][randCol].equals("*")) grid[randRow][randCol] = "S";
      else i--;
    }
    gridNoCharacter = new String[SIZE][SIZE];
    for(int r = 0; r < SIZE; r++) for(int c = 0; c < SIZE; c++) gridNoCharacter[r][c] = grid[r][c];
    gridNoCharacter[m][m] = "A";
  }//Map() constructor end
  
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
    if (d != "FORWARD" && d != "UP" && d != "BACKWARD" && d != "DOWN" && d != "LEFT" && d != "RIGHT")
      throw new Error(d+" is not a direction");
    grid[playerY][playerX] = "@";
    grid[tempY][tempX] = gridNoCharacter[tempY][tempX];
  }

  public String toString(){
    String ans = "";
    for(String[]i : grid){
      for(String s : i) ans +=" " + s + " ";
      ans += "\n";
    }
    return ans;
  }
  
  public static void main(String[] args)
  {
    Map test = new Map();
    test.movePlayer("RIGHT"); System.out.println(test);
    test.movePlayer("RIGHT"); System.out.println(test);
    test.movePlayer("UP");    System.out.println(test);
    test.movePlayer("RIGHT"); System.out.println(test);
    test.movePlayer("RIGHT"); System.out.println(test);
    test.movePlayer("UP");    System.out.println(test);
    test.movePlayer("LEFT");  System.out.println(test);
    test.movePlayer("LEFT");  System.out.println(test);
    test.movePlayer("DOWN");  System.out.println(test);
    test.movePlayer("LEFT");  System.out.println(test);
    test.movePlayer("LEFT");  System.out.println(test);
    test.movePlayer("DOWN");  System.out.println(test);
  }
}
