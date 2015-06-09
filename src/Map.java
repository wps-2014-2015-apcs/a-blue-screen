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
 * @author Jeremy Yu
 * 
 */

public class Map {
  public enum Move{FOWARD, BACKWARD, LEFT, RIGHT};
  public String[][] grid;
//public int[][] screen;
  public int playerX;
  public int playerY;
  
  public Map(){
    grid = new String[63][63];
    playerX = 32;
    playerY = 32;
  }
  
  public String[][]getData(){return grid;}
  public int getPlayerX(){return playerX;}
  public int getPlayerY(){return playerY;}
  
  public void movePlayer(String d){
    d = d.toUpperCase();
    if (d == "FORWARD" || d == "UP") playerY--;
    if (d == "BACKWARD" || d == "DOWN") playerY++;
    if (d == "LEFT") playerX--;
    if (d == "RIGHT") playerX++;
  }
  
  public String toString(){
    String ans = "";
    for(String[] i : grid){
      for(String s : i){
        ans += i;
      }
      ans += "\n";
    }
    return ans;
  }
}
