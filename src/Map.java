/*\
|*|2014 - 2015 APCS A Blue Screen project.
|*|
|*|@author Lucy Dong
|*|@author Lukas Goodman
|*|@author Jefferson Kim
|*|@author Qiuyue Liu
|*|@author Sarah Luettgen
|*|@author Billy Miller
|*|@author Michael Moran
|*|@author William Qi
|*|@author Kristine Xu
|*|@author Ashley Yu
|*|@author Jeremy Yu
|*|
|*|This is the map and the methods for moving around the map
|*|
\*/
  
public class Map {
  
//fields  
  private String[][] grid;
  private String[][] gridHelp;
  //public int[][] screen;
  private int playerX;
  private int playerY;
  public final static String[][] school = {
    {"?","?","?","?","?"},
    {"?","?","?","?","?"},
    {"?","?","?","?","?"},
    {"?","?","?","?","?"},
    {"?","?","?","?","?"}
  };
  private boolean spaces = true;
  private int attackCount = -3;
  
//constructors
  public Map(){
    final int SIZE = 21;
    int m = (SIZE - 1) / 2;
    playerX = m; playerY = m;
    grid = new String[SIZE][SIZE];
    for(int r = 0; r < SIZE; r++) for(int c = 0; c < SIZE; c++) grid[r][c] = "?";
    grid[m][m] = "@";
    build("H", 5);// 5 Friends Houses
    build("C", 5);// 5 Coffee Shops
    build("O", 5);// 5 Office supply Stores
    build("E", 1);// 1 School
    grid[m][m] = "A";
  }
  public Map(String[][] grid){
    final int SIZE = grid.length;
    int m = SIZE/2;
    this.grid = grid;
    playerX = m; playerY = m;
  }
  public Map(String[][] grid , int x, int y){
    this.grid = grid;
    playerX = x; playerY = y;
  }
  
//constructor helpers 
  private void build(String b,int n){//String Building int number
    int SIZE = grid.length;
    for(int i = 0; i < n; i++)
    {
    int randRow = (int)(Math.random() * SIZE);
    int randCol = (int)(Math.random() * SIZE);
      if(grid[randRow][randCol].equals("?"))
        grid[randRow][randCol] = b;
      else i--;
    }
  }
  
//public get methods
  public String[][]getData(){
    String[][]ans = new String[grid.length][grid[0].length];
    System.arraycopy(grid,0,ans,0,grid.length);
    ans[playerY][playerX] = "@";
    return ans;
  }
  public int getPlayerX(){return playerX;}
  public int getPlayerY(){return playerY;}
  public int getX(){return playerX;}
  public int getY(){return playerY;}
  public String playerOn(){return grid[playerY][playerX];}
//public set methods
  public String movePlayer(String d){
    String ans = "";
    d = d.toUpperCase();
    if (d == "FORWARD" || d == "UP") playerY--;
    if (d == "BACKWARD" || d == "DOWN") playerY++;
    if (d == "LEFT") playerX--;
    if (d == "RIGHT") playerX++;
    if (d != "FORWARD" && d != "UP" && d != "BACKWARD" && d != "DOWN" && d != "LEFT" && d != "RIGHT")
      throw new Error(d+" is not a direction");
    if (playerX >= grid.length){playerX--; ans = "YOU ARE TOO FAR OUT";}
    if (playerY >= grid.length){playerY--; ans = "YOU ARE TOO FAR OUT";}
    if (playerX < 0){playerX++; ans = "YOU ARE TOO FAR OUT";}
    if (playerY < 0){playerY++; ans = "YOU ARE TOO FAR OUT";}
    supriseAttack();
    return ans;
  }
  
//Random attacks and fighting
  public void supriseAttack()
  {
    if(attackCount > 0)
    {
      int randNum = (int)(Math.random() * 5);
      if(randNum == 1)
      {
        fight();//this should now be a event in MapIterface
        attackCount = -3;
      }
    }
  }
  
  public static void fight()
  {
    int randNum = (int)(Math.random() * 5);
    if(randNum == 0);//dodge
    else
     Verbs.health.setNumber(Verbs.health.getNumber() - 20);
  }
  

  
//print methods
  public String toString(){
    String ans = "";
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){ 
        String s = grid[i][j];
        if(i == playerY && j == playerX)s = "@";
        if(spaces)ans +=" " + s + " ";
        else ans += s;
      }
      ans += "\n";
    }
    return ans;
  }
  
//main
  public static void main(String[] args)
  {
    Map test = new Map();
    test.movePlayer("RIGHT"); System.out.println(test + test.playerOn());
    test.movePlayer("RIGHT"); System.out.println(test + test.playerOn());
    test.movePlayer("UP");    System.out.println(test + test.playerOn());
    test.movePlayer("RIGHT"); System.out.println(test + test.playerOn());
    test.movePlayer("RIGHT"); System.out.println(test + test.playerOn());
    test.movePlayer("UP");    System.out.println(test + test.playerOn());
    test.movePlayer("LEFT");  System.out.println(test + test.playerOn());
    test.movePlayer("LEFT");  System.out.println(test + test.playerOn());
    test.movePlayer("DOWN");  System.out.println(test + test.playerOn());
    test.movePlayer("LEFT");  System.out.println(test + test.playerOn());
    test.movePlayer("LEFT");  System.out.println(test + test.playerOn());
    test.movePlayer("DOWN");  System.out.println(test + test.playerOn());
    Map test2 = new Map(school);
    System.out.println(test2);
    System.out.print(new Map(test.getData(),test.getX(),test.getY()));
  }
}