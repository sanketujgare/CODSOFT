package task2;
import java.util.*;

public class Grade_calculator {
	public static void calculate_grade(int avg_marks) {
		if(avg_marks>=80) {
		   System.out.println("Grade A");
		}
		else if(avg_marks>=70) {
			System.out.println("Grade B");
		}
		else if(avg_marks>=50) {
			System.out.println("Grade C");
		}
		else if(avg_marks>=35) {
			System.out.println("Grade D");
		}
		else if(avg_marks<35) {
			System.out.println("your are Fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int english,marathi,math,science,geography,history;
		Scanner input=new Scanner(System.in);
		english=input.nextInt();
		marathi=input.nextInt();
		math=input.nextInt();
		science=input.nextInt();
		geography=input.nextInt();
		history=input.nextInt();
		
		int calculate_sum=english+marathi+math+science+geography+history;
		System.out.println("your total marks are "+ calculate_sum);
		int average_marks=calculate_sum/6;
		System.out.println("your average marks are "+ average_marks);
		
		calculate_grade(average_marks);
		

	}

}
