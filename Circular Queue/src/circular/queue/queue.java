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
public class queue {

    private int pull;
    private int capacity;
    int[] qData=new int[10];
    private int i=0;
    int m=0;
    int count=0;
    int z=0;
    public queue() {
        pull = 0;
        capacity = 10;
    }
    
    public void Put( int element) {
            
        if (m >=0 &&m < 10) {
            qData[m] = element;
            m++;
            count++;
        }
    }
    public boolean isEmpty() {
        /*if (qData == null) {
            return true;

        }
        return false;*/
        z++;
        if(z<10){
            for (int i=0;i<10;i++){
            qData[i]=0;
                    }
        }
        if (qData==null){
            return true;
        }
        return false;
        
    }

    public boolean isFull() {
        if (count >= capacity) {
            return true;

        }
        return false;

    }

  

    public void peek() {
       if(m<10){
        pull = qData[m];
        m++;

       }else{
        if(m==0){
            System.out.println("Queue Empty.");
        
        }


    }
    
    }
    public int getValue() {
        
        if(m>=10){
            m=0;
            
            int qData[]=new int[]{0,0,0,0,0,0,0,0,0,0};
            
        
        }
        return pull;
    }

}
