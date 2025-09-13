/*
 * TODO: Jonathan
 * TODO: sept 12
 * TODO: pd 4
 * TODO: The first line of output must include the name of the user and a welcome message.  
The second line of output should tell the user either “Congratulations” for being 18 and  being able to vote or it should tell them how many more years they will have to wait until they  can vote.  
The third line of output should output to the user one of five different, school appropriate,  positive or motivating messages based on their cumulative GPA – the breakdown points are  4.5+, 4.0 – 4.49, 3.5 – 3.99, 3.0 – 3.49, and anything below a 3.0.  
The last output will be all the multiples of the length of the person’s name up to and possibly  including their favorite number. The multiples should be labeled and appear on a single line  with commas separating them. (If there are so many multiples that they go to an additional  line, that is ok.)  

 */
//Yes, I know the file name should be something like ReviewProgram - working on it!
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		 Scanner keyB = new Scanner(System.in);
		
		System.out.println("What is Your name");
		String name = keyB.nextLine();
		System.out.println("what is your age?");
        int age = keyB.nextInt();
		System.out.println("What is your favorite 3 digit number?");
        int num = keyB.nextInt();
		System.out.println("what is your GPA?");
    	double gpa = keyB.nextDouble();

		System.out.println("thank you for the information.  Welcome "+name);

		if(age>= 1){
			System.out.println("congratulations for being able to vote!");
		}
		else{
			System.out.println("you have "+(18-age)+" years until you can vote.");
		}
		if(gpa >= 4.5){
			System.out.println("WOW your GPA is outstanding!");
		}
		else if(gpa >= 4 && gpa <= 4.49){
			System.out.println("Great work, your GPA is really solid!");
		}
		else if(gpa >= 3.5 && gpa <= 3.99){
			System.out.println("You're on the right track, keep up the good work!");
		}
		else if(gpa >= 3 && gpa <= 3.49){
			System.out.println("Not bad, your GPA could definitely improve though...");
		}
		else if(gpa <= 3){
			System.out.println("what are we even doing here smh.  Study harder!");
		}
		int count1 = 0;
		int count2 = 1;
		int nameLength = name.length();
		while(count1 < num){
			System.out.print(nameLength*count2 + ",");
			count1 += nameLength;
			count2++;
		
		}
		
		keyB.close();
		
		
	}

}
