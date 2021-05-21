public class Freq {
  public static void main(String[] args) {
    String str = "Java Is Fun";
    char ch = 'j';
    char ex;
    int count = 0;
    	
    // length of the string
    int len = str.length();
    
    for(int i=0; i<len; i++)	{		// 0		1
    	ex = str.charAt(i);				// J		a		
        	
        if(ch == ex)					// false	true
        	count++;					// 1
    }
    System.out.println("The number of occurances of " + ch + " is " + count);
  }
}