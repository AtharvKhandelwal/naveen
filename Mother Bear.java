import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
public static void main (String[] args) throws IOException
{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
	    String str=in.readLine();
	    if(str.equals("DONE"))
	    break;
	    str = str.replaceAll("\\p{Punct}","");
	    str = str.replaceAll("\\s",""); 
	     StringBuffer sb1 = new StringBuffer(str);
	     StringBuffer sb2 = sb1.reverse();
	     String str2=sb2.toString();
	     if(str.equalsIgnoreCase(str2))
	     System.out.println("You won't be eaten!");
	     else
	     System.out.println("Uh oh..");
	}
}
}

