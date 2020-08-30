class Day19UC3 {
public static void main(String[] args) {
		//Constants
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		//Variables
		int empHrs=0;
		int empWage=0;

		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck == IS_PART_TIME)
		{
			System.out.println("employee is present for part time");
			empHrs=4;
		}
		else if(empCheck == IS_FULL_TIME)
		{
			System.out.println("employee is present for full time");
			empHrs=8;
		}
		else
		{
			empHrs=0;
      }
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage );
	}
}
