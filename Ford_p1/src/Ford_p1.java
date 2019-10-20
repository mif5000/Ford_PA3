import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class Ford_p1 {

    public static int mult1() {
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        return rand_int1 * rand_int2;
    }
    public static int mult2() {
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        return rand_int1 * rand_int2;
    }
    public static int mult3() {
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        return rand_int1 * rand_int2;
    }
    public static int mult4() {
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        return rand_int1 * rand_int2;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int userNum, num;
        int i;
        int counter = 0;
        int difficulty;
        System.out.println("Enter difficulty:");
        difficulty = sc2.nextInt();
        switch(difficulty){
            case 1:
                for(i = 0; i < 10; i++) {
                    num = mult1();
                    userNum = sc.nextInt();
                    if (userNum == num) {
                        counter++;
                    }
                    else {
                        continue;
                    }
                }
                break;
            case 2:
                for(i = 0; i < 10; i++) {
                    num = mult2();
                    userNum = sc.nextInt();
                    if (userNum == num) {
                        counter++;
                    }
                    else {
                        continue;
                    }
                }
                break;
            case 3:
                for(i = 0; i < 10; i++) {
                    num = mult3();
                    userNum = sc.nextInt();
                    if (userNum == num) {
                        counter++;
                    }
                    else {
                        continue;
                    }
                }
                break;
            case 4:
                for(i = 0; i < 10; i++) {
                    num = mult4();
                    userNum = sc.nextInt();
                    if (userNum == num) {
                        counter++;
                    }
                    else {
                        continue;
                    }
                }
                break;
        }
        while (true) {

            if (counter >= 8) {
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("Enter difficulty:");
                counter =0;
                difficulty = sc2.nextInt();
            }
            else if (counter < 8){
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("Enter difficulty:");
                counter =0;
                difficulty = sc2.nextInt();
                }

            switch(difficulty){
                case 1:
                    for(i = 0; i < 10; i++) {
                        num = mult1();
                        userNum = sc.nextInt();
                        if (userNum == num) {
                            counter++;
                        }
                        else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    for(i = 0; i < 10; i++) {
                        num = mult2();
                        userNum = sc.nextInt();
                        if (userNum == num) {
                            counter++;
                        }
                        else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    for(i = 0; i < 10; i++) {
                        num = mult3();
                        userNum = sc.nextInt();
                        if (userNum == num) {
                            counter++;
                        }
                        else {
                            continue;
                        }
                    }
                    break;
                case 4:
                    for(i = 0; i < 10; i++) {
                        num = mult4();
                        userNum = sc.nextInt();
                        if (userNum == num) {
                            counter++;
                        }
                        else {
                            continue;
                        }
                    }
                    break;
            }

            }
        }
    }

