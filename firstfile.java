import java.util.*;
class BasicCal{
double fstno;
double sndno;

public void add(double fsnt,double snd)
{
fstno=fsnt;
sndno=snd;
double Sum=fstno+sndno;
System.out.println("Sum of the number "+Sum);

}
public void mul(double fsnt,double snd)
{
fstno=fsnt;
sndno=snd;
double M=fstno*sndno;
System.out.println("multiplication of the number "+M);


}

public void sub(double fsnt,double snd)
{
fstno=fsnt;
sndno=snd;
double Su=fstno-sndno;
System.out.println("subtraction of the number "+Su);
//return 0;

}
public void division(double fsnt,double snd)
{
fstno=fsnt;
sndno=snd;
double D=fstno/sndno;
System.out.println("division of the number "+D);
//return 0;
}

public void perc(double fsnt,double snd)
{
fstno=fsnt;
sndno=snd;
double Per=fstno/100;
double T=Per*sndno;
System.out.println("percentage of the number "+T);
//return 0;
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
BasicCal obj1=new BasicCal();
double a;
double b;
String operator;

System.out.println("for basic Cal. type B, for advance Cal. type A");
operator=s.next();

while(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("%") || operator.equals("/") || operator.equals("B") || operator.equals("CE"))
{
a=s.nextDouble();
operator=s.next();
b=s.nextDouble();
if(operator.equals("+"))
{

obj1.add(a,b);

}
else if(operator.equals("*"))
{
obj1.mul(a,b);

}
else if(operator.equals("-"))
{
obj1.sub(a,b);

}
else if(operator.equals("/"))
{
obj1.division(a,b);

}
else if(operator.equals("%"))
{
obj1.perc(a,b);

}
else if(operator.equals("CE"))
{
System.out.print("");
break;
}

}

}


}
