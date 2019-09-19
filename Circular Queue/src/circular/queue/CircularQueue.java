/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.queue;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class CircularQueue {

    public static void main(String[] args) {
        
        int front = 0;
        int rear = -1;
        //int[] qData = new int[]{};
        int count = 0;
        int index = 0;
        //int capacity = 10;
        boolean check;

        queue q = new queue();
        Scanner key = new Scanner(System.in);
        int value = 1;

        while (value != -1) {
            System.out.println("Enter a Non-negative Integer  or 0 to pull out or -1 to terminate program:  ");
            value = key.nextInt();

            if (value >= 1) {
                if (q.isFull()) {
                    System.out.println("The Queue is Full.");
                } else {
                    
                
                    q.Put(value);
                    //count++;
                }
            } else if (value == 0) {
                if (q.isEmpty()) {
                    System.out.println("The Queue is Empty.");
                } else {
                    q.peek();
                    System.out.println("The value is: " + q.getValue());
                }

            } else if (value == -1) {
                System.out.println("You terminated the Program.");
                break;

            } else {
                System.out.println("The value can't be entered into the queue.");

            }
        }
    }

}
