public class Kata{
    public static boolean nameInStr(String str, String name){
        
        int length = name.length();
        int j = 0;

        for (int i=0 ; i<str.length() ; i++)
        {
            if (str.charAt(i) == name.charAt(j))
            {
            	j++;
            }
        }
        
        if (length == j)
        {  
          System.out.println(name);
        	return true;
        }
        System.out.println(name);
        return false;
    }
}
