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
\*/

/**
 * The verbs of the project. 
 */
public class Verbs extends Resource {
 //fields
 public static Resource pencils = new Resource("Pencils", 0);
 public static Resource coffee = new Resource("Coffee", 0);
 public static Resource grade = new Resource("Grade", 52);
 public static Resource health = new Resource("Health", 50);
 public static Resource computerCharge = new Resource("Computer charge", 75);
 
 
 public Verbs(String name)
 {
  super(name);
 }
 
 public Verbs(String name, int number)
 {
  super(name, number);
 }
 
 //if "no more pencils" --> displays "Not enough pencils"
 //if you DO have pencils --> displays "Your assignment is finished"
  //Grade: +2
  //Pencils "Number": -1
     //Timer: available every 10 seconds 
 public static void doHomework()
 {
  String finished = "Your assignment is finished."; 
  String notEnough = "Not enough pencils.";
  if (pencils.getNumber() == 0)
  {
   System.out.println(notEnough); 
  }
  else if (grade.getNumber() == 100)
  {
   pencils.setNumber(pencils.getNumber() - 1);
   System.out.println(finished); 
  }
  else if (grade.getNumber() == 99)
  {
   pencils.setNumber(pencils.getNumber() - 1);
   grade.setNumber(100);
   System.out.println(finished); 
  }
  else 
  {
   pencils.setNumber(pencils.getNumber() - 1);
   grade.setNumber(grade.getNumber() + 2);
   System.out.println(finished); 
  }
 }
 
 //Pencils: between +1 and +5
 //Timer: available every 10 seconds
 public static void collectPencils()
 {
  int random = (int)(Math.random() * 5); 
  pencils.setNumber(pencils.getNumber() + random);
 }
 
 //Prompts text: "You are awake". 
 //Health: increases 10%
 public static void drinkCoffee() 
 {
  if (health.getNumber() <= 90)
  {
   health.setNumber(health.getNumber() + 10);
   System.out.println("You are awake.");
  }
  else if (health.getNumber() < 100 && health.getNumber() > 90)
  {
   health.setNumber(100); 
   System.out.println("You are awake."); 
  }
  else 
  {
   System.out.println("You are awake."); 
  }
 }
 
 //Prompts text: "Health increase!"
 //Health: increases 10%
 public static void playGame() 
 {
  if (health.getNumber() <= 90)
  {
   health.setNumber(health.getNumber() + 10);
   System.out.println("Health increase!");
  }
  else if (health.getNumber() < 100 && health.getNumber() > 90)
  {
   health.setNumber(100); 
   System.out.println("Health increase!"); 
  }
  else 
  {
   System.out.println("Health increase!"); 
  }
 }
 
 //Prompts text: "There is progress on your code."
 //Grade: +2
 public static void writeCode()
 {
  if (grade.getNumber() == 100)
  {
 System.out.println("There is progress on your code.");   
  }
  else if (grade.getNumber() == 99)
  {
 grade.setNumber(100); 
 System.out.println("There is progress on your code."); 
  }
  else 
  {
    grade.setNumber(grade.getNumber() + 2); 
    System.out.println("There is progress on your code."); 
  }
 }
 
 //If you don't have health at 100% you fail
 //If you pass, Grade +2
 //Michael's THOUGHT//If we are doing things that make us sleepy then the 
 //                 //harshness should be less? maybe health is accepted above
 //                 //75% or if you can stay awake through the test with the
 //                 //proper grade you can still make it through. because in
 //                 //real life if you try to lose at best you can and if you
 //                 //try to struggle often there is an opportunity to secede
 //                 //maybe Grade +0 for hitting the min
 //                 //      Grade +1 for getting avrage
 //                 //      Grade -1 for fail
 //Just a THOUGHT   //
 
 public static void takeTest()
 {
  if (health.getNumber() == 100)
  {
    if (grade.getNumber() == 100)
    {
      System.out.println("You passed."); 
    }
    else if (grade.getNumber() == 99)
    {
      System.out.println("You passed."); 
      grade.setNumber(100);
    }
    else 
    {
      System.out.println("You passed."); 
      grade.setNumber(grade.getNumber() + 2);
    }
  }
  else 
  {
   System.out.println("You failed."); 
  }
 }
}
