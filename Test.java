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
		List<Integer> ListOfDuplicateNumbers = new ArrayList();
		ListOfDuplicateNumbers.add(1);
		ListOfDuplicateNumbers.add(5);
		ListOfDuplicateNumbers.add(1);
		ListOfDuplicateNumbers.add(3);
		ListOfDuplicateNumbers.add(3);
		ListOfDuplicateNumbers.add(2);
		
		String message = " ymm yamani Mohammed med code";
		// Test compress
		System.out.println("compresse msg : " +message);
		System.out.println(compress(message));
		
		// Test count non unique 
		System.out.println("Count non unique : ");
		System.out.println(ListOfDuplicateNumbers);
		System.out.println(countNonUniuque(ListOfDuplicateNumbers));
		 
		 // Test count pair 
		System.out.println("Count pair : ");
		System.out.println(countPair(ListOfDuplicateNumbers, 2));

	}
	
	/**
	 * 
	 * @param input contains a string
	 * @return string msg as a compressed message
	 */
	public static String compress(String message) {
		 int length = message.length();
		 int count=1;
	     StringBuilder compressedMessage = new StringBuilder(); 

		   

		    for(int i=0; i<length; i++){
		        
		    	if(i== length - 1){         
		            compressedMessage.append(message.charAt(i)+""+((count == 1) ? "" : count) );
		            break;
		        }

		        if(message.charAt(i)==message.charAt(i+1)){   
		            count++;
		        }
		        else{                           
		            compressedMessage.append(message.charAt(i)+""+((count == 1) ? "" : count) );
		            count=1;
		        }
		   
		    }
		return compressedMessage.toString();
	}
	
	/**
	 * 
	 * @param list of number type Integer
	 * @param k is difference between pair member of list 
	 * @return count pair
	 */
	public static int countPair(List<Integer> listNumbers, int k ) {
	       Set<Integer> collectionsNumbers = new HashSet<>();
	        
	       for(int i = 0;i<listNumbers.size();i++) {
	        	for(int j = i+1;j<listNumbers.size();j++) {
	        		if(listNumbers.get(i)!= null && Math.abs(listNumbers.get(i)-listNumbers.get(j)) == k) {
	        			collectionsNumbers.add(listNumbers.get(i));
	        			break;
	        		}
	        	}
	        }
		return collectionsNumbers.size();
	}
	
	/**
	 * 
	 * @param list number of type integer 
	 * @return count member non unique in list
	 */
	public static int countNonUniuque(List<Integer> listNumbers) {
	       int countNonUniuque = 0 ;
	       Set<Integer> collectionsNumbers = new HashSet<>();
	       int sizeList = listNumbers.size();
	       for(int i = 0;i<sizeList;i++) {
	        	for(int j = i+1;j<sizeList;j++) {
	        		if(listNumbers.get(i).equals(listNumbers.get(j))) {
	        			collectionsNumbers.add(listNumbers.get(i));
	        			break;
	        		}
	        	}
	        }
	       	countNonUniuque = collectionsNumbers.size();
		return  countNonUniuque;
	}

}
