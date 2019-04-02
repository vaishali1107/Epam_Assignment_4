import java.io.*;
import java.util.*;

public class Solution {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();

    public static void main(String[] args) {
     
        Solution solution=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                int b=sc.nextInt();
                solution.enqueue(b);
                break;
                case 2:
                  solution.dequeue();
                   break;
                case 3:
                solution.show();
                break;

            }
        }
    }
    public  void enqueue(int a)
    {
        s1.push(a);

    }
    public  void dequeue()
    {
        int x=0;
          if(s1.isEmpty()&&s2.isEmpty())
          {
              System.out.println("error");
          }
          if (s2.isEmpty()) { 
            while (!s1.isEmpty()) { 
                 x =s1.pop(); 
                s2.push(x);   
                
            } 
        } 
        s2.pop();
        
    }
    public  void show(){
             int x=0;
          if(s1.isEmpty()&&s2.isEmpty())
          {
              System.out.println("error");
          }
          if (s2.isEmpty()) { 
            while (!s1.isEmpty()) { 
                 x =s1.pop(); 
                s2.push(x);   
                
            } 
        }
       
            x=s2.peek();
            System.out.println(x);
        
    }
}
