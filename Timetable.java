class Timetable 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a day");
		String day="Monday";

		switch(day)
		{
			case "Monday":
			{
				System.out.println("On "+day + " solve maths");
				break;
			}

			case "Tuesday":
			{
				System.out.println("On "+day + " explore Science");
				break;
			}

			case "Wednesday":
			{
				System.out.println("On "+day + " read english grammar" );
				break;
			}

			case "Thursday":
			{
				System.out.println("Om "+day + " learn Social Sciences");
				break;
			}

			case "Friday":
			{
				System.out.println("On "+day + " draw pictures");
				break;
			}

			case "Saturday":
			{
				System.out.println("its a "+day + " revise all the subjects");
				break;
			}

			case "Sunday":
			{
				System.out.println(day + " is a fun day");
				break;
			}

			default:
			{
				System.out.println("invalid input");
			}
		}


	}
}
