
import java.util.Scanner;

public class MovieDriverTask1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Scanner name1 = new Scanner (System.in);
		Movie movie1=new Movie();
				
		System.out.print("Enter The Name of The Movie:");
		String MovieTitle = name1.nextLine();
		movie1.setTitle(MovieTitle);
			
		System.out.print("Enter The Rating of The Movie:");
		String MovieRating=name1.nextLine();
		movie1.setRating(MovieRating);
			
		System.out.print("Enter The Number of The Tickets sold for this moive:");
		int NumTickets = name1.nextInt();
		movie1.setSoldTickets(NumTickets);
			
		name1.nextLine(); 
		
		System.out.println(movie1.toString());
		System.out.println("Goodbye");
			 	
			 

		}

	}  
	


