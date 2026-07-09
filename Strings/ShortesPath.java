import java.util.Scanner;

public class ShortesPath {

    public static float getShortestPath( String path) {
        int x=0 , y=0 ;
        for(int i =0 ; i< path.length(); i++) {
            //South 
            if(path.charAt(i) == 'S') {
                y--;

        }
        else if(path.charAt(i) == 'N') {
                y++;
            }
            else if(path.charAt(i) == 'E') {
                x++;
            }
            else if(path.charAt(i) == 'W') {
                x--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path: ");
        String path = sc.nextLine();
        float distance = getShortestPath(path);
        System.out.println("The shortest distance is: " + distance);
    }
 }