//Date Class
import java.util.*;
class Util1
{
       public static void main(String args[])
{
     Date d= new Date();
System.out.println("Current Year:"+(d.getYear()+1900));
System.out.println("Current Month:"+(d.getMonth()+1));
System.out.println("Current Day:"+(d.getDay()));
System.out.println("Current Time:"+(d.getTime()));
System.out.println("Current Hour:"+(d.getHours()));
System.out.println("Current Minute:"+(d.getMinutes()));
System.out.println("Current Second:"+(d.getSeconds()));
System.out.println(d);
}
}