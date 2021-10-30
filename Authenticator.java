import java.lang.*;
import java.util.Scanner;
class Authenticator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.nextLine();
        int flag =0;
        String checkList= " ().{}[]+-*/\\";

        if (username.length() >= 6 &&  username.length() <= 15)
        {
            if(username.charAt(0) >= 'A' && username.charAt(0) <= 'Z')
            {                
                for (int i = 0; i < checkList.length(); i++) 
                {   
                    String temp = String.valueOf(checkList.charAt(i));
                    if (username.contains(temp) == true)
                    {   System.out.println("Invalid username " +username+" ,it should not contains: "+temp);  
                        flag = 1;  
                        System.exit(0);
                    }                                            
                }
                if(flag ==0)
                    System.out.println("Valid username: "+username);                
            }
            else
                {System.out.println("Invalid username: "+username+ " ,first letter should be Uppercase");
                System.exit(0);}
        }
        else
            {System.out.println("Invalid username: "+username);
            System.exit(0);}

        System.out.println("Enter password");
        String password = sc.nextLine();
        CharSequence seq = username;
        
        if (password.length() >= 8 &&  password.length() <= 256)
        {
            if(password.contains(seq) == false)
            {
                for (int i = 0; i < checkList.length(); i++) 
                {   
                    String temp = String.valueOf(checkList.charAt(i));
                    if (password.contains(temp) == true)
                    {   System.out.println("Invalid password: "+password+" ,it should not contains: "+temp);  
                        flag = 1;  
                        System.exit(0);
                    }                                            
                }
                if(flag ==0)
                    System.out.println("Valid password: "+password);     
            }      
            else    
                System.out.println("Invalid password: "+password+ " ,it contains username"); 
        }
        else
            System.out.println("Invalid password: "+password);
    }
}