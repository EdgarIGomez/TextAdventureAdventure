package areas;

import java.util.Scanner;

public class Forest {

    public void hubArea(){
        System.out.print("You enter the forest with your party there are three directions to which way will you go? \n 1 - Straight \n 2 - Left \n 3 - Right \n");
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();
    }
}
