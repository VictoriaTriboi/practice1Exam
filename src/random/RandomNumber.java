package random;



		import java.util.Random;
		import java.util.Set;
		import java.util.TreeSet;

		public class RandomNumber {

			public static void main(String[] args) {
			
				
				int n=1;
				
				Set<Integer> myData = new TreeSet<Integer>();
				
			    while (myData.size() < 500) {
			    	myData.add(getRandomNumber());
			    }
		  
			    System.out.println(myData);
			    
			    Object [] obj = myData.toArray();
			    
			    System.out.println(obj[n-1]);
			    
			}

			   public static int getRandomNumber() {
				   
				   Random random = new Random();
				   int randomNumber = random.nextInt(900) + 100;
				   return randomNumber;
			   }

			
			
	}


