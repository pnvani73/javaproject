public class Main {
  public static void main(String[] args) {
    String name = "John";
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    System.out.println(name);
    System.out.println("Hello World");

/* break example */
   for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  

/* continue example  - This example skips the  vallue of 4 */
/* The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.*/

for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  

   for (String i : cars) {
  	System.out.println(i);
    }


   /* multidimensional array */
  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]);  


  }
}