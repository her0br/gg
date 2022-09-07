import java.util.Random;
import java.util.Scanner;
public class QuickSort {
public static void sort(int[] a)
{
quicksort(a,0,a.length-1);
}
public static void quicksort(int[] a,int low,int high)
{
int i=low,j=high,temp,pivot=a[low];
while(i<=j)
{
while(a[i]<pivot)
i++;
while(a[j]>pivot)
j--;
if(i<=j)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
j--;
}
}
if(j>low)
quicksort(a,low,j);
if(i<high)
quicksort(a,i,high);
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i;
Random r = new Random();
System.out.println("Quick Sort\nEnter the Number of times the algorithm should Run");
int times = scan.nextInt();
double totaldur=0;
for(int j=0;j<times;j++)
{
System.out.println("Random Number Generated are at POS "+j+" as follows : ");
int[] a = new int[10];
for(i=0;i<10;i++)
{
a[i]=r.nextInt(1000);
System.out.print(a[i]+" ");
}
System.out.println("");
long StartTime = System.nanoTime();
sort(a);
double EndTime = System.nanoTime();
double duration = (EndTime - StartTime);
System.out.println("Elements after Sorting are");
for(i=0;i<10;i++)
System.out.print(a[i]+" ");
System.out.println("");
totaldur=totaldur+duration;
}
System.out.println("\nTotal time taken to Sort is :"+totaldur+" Nano Seconds");
double miliseconds = (totaldur / 1000000);
System.out.println("\nTotal time taken to Sort is :"+miliseconds+" Mili Seconds");
double avg=totaldur/times;
System.out.println("The Average time Spend by the System is : "+avg+" Nano Second");
double miliavg=(avg/1000000);
System.out.println("The Avergae time Spend by the System is : "+miliavg+" Mili Seconds");
scan.close();
}
}