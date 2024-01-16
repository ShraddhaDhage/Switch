import java.util.*;
class  Shop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter what you want to buy?");
		String buy=sc.nextLine();
		System.out.println("You entered "+buy);

		switch(buy)
		{
			case "fruits":
			{
				System.out.println("Enter which fruit");
				String fruit=sc.nextLine();
				System.out.println("you choosed"+fruit);

				switch(fruit)
				{
					case "Mango":
					{
						System.out.println("The price of 1 kg "+ fruit + " is " + 500);
						break;
					}

					case "Apple":
					{
						System.out.println("The price of 1 kg "+ fruit + " is " + 200);
						break;
					}

					case "Oranges":
					{
						System.out.println("The price of 1 kg "+ fruit + " is " + 150);
						break;
					}

					case "Pomogranates":
					{
						System.out.println("The price of 1 kg "+ fruit + " is " + 300);
						break;
					}

					default:
					{
						System.out.println("The entered fruit is not available");
					}

					
				}

				break;
			}

			case "vegetables":
			{

				System.out.println("Enter the vegetable you want to buy");
				String veg=sc.nextLine();
				System.out.println("You choosed "+veg);

				switch(veg)
				{
					case "Tomato":
					{
						System.out.println("The price of 1 kg "+ veg + " is " + 50);
						break;
					}

					case "Potato":
					{
						System.out.println("The price of 1 kg "+ veg + " is " + 40);
						break;
					}

					case "onion":
					{
						System.out.println("The price of 1 kg "+ veg + " is " + 80);
						break;
					}

					default:
					{
						System.out.println("Entered vegetable is not available");
					}
				}
				break;
			}

			case "flowers":
			{
				System.out.println("Enter the flowers you want to buy");
				String flower=sc.nextLine();
				System.out.println("You choosed"+flower);

				switch(flower)
				{
					case "Roses":
					{
						System.out.println("The price of 1 dozen "+ flower + " is " + 300);
						break;
					}

					case "tulip":
					{
						System.out.println("The price of 1 dozen "+ flower + " is " + 100);
						break;
					}

					case "jasmine":
					{
						System.out.println("The price of 1 dozen "+ flower + " is " + 250);
						break;
					}

					default:
					{
						System.out.println("Entered flower is not available");
					}
				}
				break;
				
			}

			default:
			{
				System.out.println("The product you want to buy is not available in this shop");
				break;
			}
		}
	}
}
