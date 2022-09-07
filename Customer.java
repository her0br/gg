import java.util.Scanner;
import java.util.StringTokenizer;
public class Customer {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String name;
System.out.println("Enter the Name & DOB in the Format <name,dd/mm/yyyy>");
name=scan.next();
StringTokenizer st = new StringTokenizer(name,"/");
int count=st.countTokens();
for(int i=1;i<=count&&st.hasMoreTokens();i++)
{
System.out.print(st.nextToken());
if(i<count)
System.out.println(",");
}
scan.close();
}
}
