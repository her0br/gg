import java.util.Scanner;
public class Room {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n,i;
Student[] s=new Student[100];
System.out.println("Enter the Number of Objects");
n=scan.nextInt();
for(i=0;i<n;i++)
{
s[i]=new Student();
}
for(i=0;i<n;i++)
{
System.out.println("Enter the Details in Order - Name , Usn , Branch , Phone
No");
String name = scan.next();
String usn = scan.next();
String branch = scan.next();
String phno = scan.next();
s[i].assignvalue(name, usn, branch, phno);
}
System.out.println("Students Details are as Follow:");
for(i=0;i<n;i++)
{
s[i].display();
}
scan.close();
}
}
class Student
{
String name,usn,branch,phno;
void assignvalue(String n,String u,String b,String p)
{
name=n;
usn=u;
branch=b;
phno=p;
}
void display()
{
System.out.println("Name :"+name+" USN :"+usn+" Branch :"+branch+"Phone
Number :"+phno);
}
}
