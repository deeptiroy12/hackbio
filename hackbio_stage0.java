public class MyClass {
    public static int HammingDist(String Str1, String Str2)
    {
        int i = 0, count = 0;
    while (i <Str1.length())
    {
        if ( Str1.charAt(i) != Str2.charAt(i))
            count++;
        i++;
    }
    return count;
    }
    public static void main(String args[]) {
      String name= "Deepti Roy";
      String EmailID= "roychinu1999@gmail.com";
      String twitterhandle= "Deepti5668";
      String slackusername= "@deepti_22";
      String Biostack= "Epigenomics";
      String Str1= "Deepti5668";
      String Str2= "@deepti_22";
     
      System.out.println( name + ","+EmailID + ","+ twitterhandle + "," + slackusername + "," + Biostack + "," + HammingDist (Str1,Str2));
      
    }
}