
/*Write a program to accept a sentence and sort the letters 
 * of each word alphabetically and print the modified 
 * statement
 */
import java.util.*;
import java.io.*;
class s2
{
   public static void main()
   {
       Scanner in=new Scanner(System.in);
       String sent=in.nextLine();
       StringTokenizer st=new StringTokenizer(sent);
       int c=st.countTokens();
       System.out.println("No. of words : "+c);
       String str="";
       while(st.hasMoreTokens())
       {
           String wrd=st.nextToken().toUpperCase();
           for(char ch='A';ch<='Z';ch++)
           {for(int i=0;i<wrd.length();i++)
             {if(wrd.charAt(i)==ch)
                 str=str+ch;
                }
            }
            str=str+" ";
           
        }
       System.out.println(str);
       
    }
}
