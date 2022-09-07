import java.lang.Thread;
import java.util.Random;
class first extends Thread{
public void run()
{
int num=0;
Random r = new Random();
try
{
num=r.nextInt(100);
System.out.println("First Thread : The Number Generated is : "+num);
Thread t2=new Thread(new second(num));
t2.start();
Thread t3=new Thread(new third(num));
t3.start();
Thread.sleep(1000);
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
class second implements Runnable {
public int x;
public second(int x)
{
this.x=x;
}
public void run()
{
System.out.println("Second Thread : Square of the number is :"+x*x);
}
}
class third implements Runnable {
int x;
public third(int x)
{
this.x=x;
}
public void run()
{
System.out.println("Third Thread : Cube of the Number is :"+x*x*x);
}
}
public class Multithread {
public static void main(String[] args) {
first a = new first();
a.start();
}}