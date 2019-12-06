import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by SQLI Maroc/oujda.
 *
 * @author : Yamani Mohammed on 22/11/2019
 * @project : echallenge-java
 * @email: yamani.mohammed92@gmail.com LinkedIn : in/mohammed-yamani/
 */

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(1);list.add(5);list.add(1);list.add(3);list.add(3);list.add(2);
		String str = " ymm yamani Mohammed med code";
		// Test compress
		System.out.println("compresse msg : " +str);
		System.out.println(compress(str));
		
		// Test count non unique 
		System.out.println("Count non unique : ");
		
		 System.out.println(list);
		 System.out.println(countNonUniuque(list));
		 
		 // Test count pair 
		System.out.println("Count pair : ");
		
		System.out.println(countPair(list, 2));

	}
	
	/**
	 * 
	 * @param input contains a string
	 * @return string msg as a compressed message
	 */
	public static String compress(String str) {
		 int length = str.length();
		 int count=1;
	     StringBuilder sb = new StringBuilder(); 

		   

		    for(int i=0; i<length; i++){
		        
		    	if(i== length - 1){         
		            sb.append(str.charAt(i)+""+((count == 1) ? "" : count) );
		            break;
		        }

		        if(str.charAt(i)==str.charAt(i+1)){   
		            count++;
		        }
		        else{                           
		            sb.append(str.charAt(i)+""+((count == 1) ? "" : count) );
		            count=1;
		        }
		   
		    }
		return sb.toString();
	}
	
	/**
	 * 
	 * @param list of number type Integer
	 * @param k is difference between pair member of list 
	 * @return count pair
	 */
	public static int countPair(List<Integer> listNumbers, int k ) {
	       Set<Integer> collections = new HashSet<>();
	        
	       for(int i = 0;i<listNumbers.size();i++) {
	        	for(int j = i+1;j<listNumbers.size();j++) {
	        		if(listNumbers.get(i)!= null && Math.abs(listNumbers.get(i)-listNumbers.get(j)) == k) {
	        			collections.add(listNumbers.get(i));
	        			break;
	        		}
	        	}
	        }
		return collections.size();
	}
	
	/**
	 * 
	 * @param list number of type integer 
	 * @return count member non unique in list
	 */
	public static int countNonUniuque(List<Integer> list) {
	       Set<Integer> collections = new HashSet<>();

	       for(int i = 0;i<list.size();i++) {
	        	for(int j = i+1;j<list.size();j++) {
	        		if(list.get(i).equals(list.get(j))) {
	        			collections.add(list.get(i));
	        			break;
	        		}
	        	}
	        }
	       
		return collections.size();
	}

}
