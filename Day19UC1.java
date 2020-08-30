class Day19UC1 {
public static void main(String[] args) {
		double empcheck=Math.floor(Math.random()*10)%2;
		int IS_FULL_TIME=1;;
		if(empcheck == IS_FULL_TIME)
		{
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("employee is absent");
		}
	}
}
