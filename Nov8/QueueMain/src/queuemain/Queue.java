/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemain;

/**
 *
 * @author shahida.chauhan
 */
public class Queue {
    
   private int rear,front,size=5;
   private int queue[]=new int[size];
   
//initialize rear and front
   public Queue()
   {
       
   rear=front=-1;
   }
   
   
   public void insert(int x)
   {    
        //Check queue full condition 
       if(rear==size-1)
       {
               System.out.println("Queue Full:");
       }
       else
       {
           //check first element
           if(front==-1)
            {
           rear=front=0;
           queue[rear]=x;
            }          
          //normal insertion by increamenting rear
           else
           {
               rear++;
               queue[rear]=x;
           }
           
       }
   }
   public void  delete()
   {
       int x;
       //check condition for empty queue
       if(front==-1)
       {
           System.out.println("Queue empty:");
       }
       else
       {
           // deleting last element and setting rear and front to -1
           if(front==rear)
           {
               x=queue[front];
               rear=front=-1;
               System.out.println("x="+x+"deleted");
           }
           //deleting element and increament front
           else
           {
             x=queue[front];
             front++;
             System.out.println("x="+x+"deleted");
                        
           }
       }
       
   }
   public void display()
   {
       //checking for queue empty
        if(front==-1)
        {
            System.out.println("Queue is empty:");
        }
        else
        {
            //display element by traversing from front to rear
             for(int i=front;i<=rear;i++)
             {
            System.out.println(queue[i]);  
            }
             
        }
       
   }
   
   
   
    
}
