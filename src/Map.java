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

public class Map {
  public String[][] grid;
//public int[][] screen
  public int playerX;
  public int playerY;
  
  public Map () { grid = new String[63][63];playerX = 32; playerY = 32; }
  public Map (String[][] grid) { this.grid = grid; playerX = (grid.size+1)/2; playerY = (grid[0].size+1)/2; }
  
  public String getDataPoint(int x, int y){return grid[x][y];}
  public String[][]getData(){return grid;}
  public int getPlayerX(){return playerX;}
  public int getPlayerY(){return playerY;}
  
  public void movePlayer(String d){
    d = d.toUpperCase();
    if (d == "FORWARD" || d == "UP") playerY--;
    if (d == "BACKWARD" || d == "DOWN") playerY++;
    if (d == "LEFT") playerX--;
    if (d == "RIGHT") playerX++;
    checkData()
  }
  public void checkData(){}
  public String toString(){
    String ans = "";
    for(String[] i : grid){
      for(String s : i){
        ans += i.equals("") ? " " : i;
      }
      ans += "\n";
    }
    return ans;
  }
}
