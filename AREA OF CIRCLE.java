/*Read the radius as double value and calculate the area of Circle using Java.
Sample Input
5
Sample Output
78.5*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        double radius = inp.nextDouble();
        System.out.println(3.14*radius*radius);
    }
}