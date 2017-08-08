class Funtype
{
public static void main(String args[])
{
fun1 a1=new fun1();
int t=a1.add(5,6);
System.out.println(t);
a1.P=100;
int e=a1.add(5,6);
System.out.println(e);
fun1 a2=new fun1();
int d=a2.add(6,5);
fun1 a3=a1;                                        //check it
fun2 f2=new fun2();
f2.fun(a1);
int h=a3.add(5,6);
System.out.println(h);
}
}
class fun1
{
int P=10;
int add(int a,int b)
{
int s=a+P;
return s;
}
}
class fun2
{
void fun(fun1 a4)
{
a4.P=200;
System.out.println(a4.P);
}
}