package kata11.kata11;

public class CharSorterMachine {

	public static char [] sort(char[] chars) {
			       
	      for(int i=0; i<chars.length-1; i++)
	      {  
	          for(int j=i+1; j<chars.length; j++){
	          if (chars[j]<chars[i])
	          {     
	        char tmp = chars[j];
	        chars[j] = chars[i];
	        chars[i] = tmp;
	          }
	         }
	    }    
	  	return chars;
	}
}