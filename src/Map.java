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
//public int[][] screen;
  public int playerX;
  public int playerY;
  
  public Map(){
    grid = new String[21][21];
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
        ans += s;
      }
      ans += "\n";
    }
    return ans;
  }
}
