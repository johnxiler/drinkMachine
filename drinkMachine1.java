import java.util.InputMismatchException;
import java.util.Scanner;
public class drinkMachine1 {
	static Scanner in= new Scanner(System.in);
	final static int Price1 = 13;
	final static String Product1 = "CocaCola";
	static int Quantity1 = 50;
	final static int Price2 = 15;
	final static String Product2 = "Royal";
	static int Quantity2 = 45;
	final static int Price3 = 13;
	final static String Product3 = "Sprite";
	static int Quantity3 = 25;
	final static int Price4 = 12;
	final static String Product4 = "PepsiCola";
	static int Quantity4 = 55;
	final static int Price5 = 15;
	final static String Product5 = "MineralWater";
	static int Quantity5 = 25;
	final static int Price6 = 30;
	final static String Product6 = "Gatorade";
	static int Quantity6 = 0;

	public static int Coins, ItemCode, ProdQty, price, stock, Change, Total;
	public static boolean BuyAgain = true, error = false;

	public static void main(String[] args) {
		 
		while(BuyAgain) {
			System.out.println("Drink Machine Simulator.\n");

			System.out.println("\tHello, Please Select your Drink"
							   +"\n|ItemCode\t|Drinks\t\t|Price|\t\t|Available|"
							   +"\n|    1 |\t|"+Product1+"\t|P"+Price1+"|\t\t|"+Quantity1+""+"pcs|"
							   +"\n|    2 |\t|"+Product2+"\t\t|P"+Price2+"|\t\t|"+Quantity2+""+"pcs|"
							   +"\n|    3 |\t|"+Product3+"\t\t|P"+Price3+"|\t\t|"+Quantity3+""+"pcs|"
							   +"\n|    4 |\t|"+Product4+"\t|P"+Price4+"|\t\t|"+Quantity4+""+"pcs|"
							   +"\n|    5 |\t|"+Product5+"\t|P"+Price5+"|\t\t|"+Quantity5+""+"pcs|"
							   +"\n|    6 |\t|"+Product6+"\t|P"+Price6+"|\t\t|"+Quantity5+""+"pcs|");
			do { try {
					System.out.print("Enter Number: ");
					ItemCode = in.nextInt();
					price = ProductPrice(ItemCode);
					error = false;
				}  catch(InputMismatchException m) {
					System.out.println("Wrong Input, try again"); error = true; in.nextLine();
				}   }while (error);
			do { try {
					System.out.println("How Many you want to Buy? ");
					ProdQty = in.nextInt();
					Total = stock(ItemCode);
					error = false;
				}catch(InputMismatchException m) {
					System.out.println("Wrong Input, try again"); error = true; in.nextLine();
				} }while (error);
			do { try {
					System.out.println("Enter Your Money: ");
					Coins = in.nextInt();
					Change = balance(Change);
					error = false;
				}catch(InputMismatchException m) {
					System.out.println("Wrong Input, try again"); error = true; in.nextLine();
				} 
			}while (error);
		}
	     
}
	public static int ProductPrice(int price) {
		if(ItemCode==1) {
			System.out.println("Name:"+Product1+"Price: "+Price1); price=Price1;
		}else if(ItemCode==2) {
			System.out.println("Name:"+Product2+"Price: "+Price2); price=Price2;
		}else if(ItemCode==3) {
			System.out.println("Name:"+Product3+"Price: "+Price3); price=Price3;
	    }else if(ItemCode==4) {
		    System.out.println("Name:"+Product4+"Price: "+Price4); price=Price4;
        }else if(ItemCode==5) {
	        System.out.println("Name:"+Product5+"Price: "+Price5); price=Price5;
        }else if(ItemCode==6) {
	        System.out.println("Name:"+Product6+"Price: "+Price6); price=Price6;
        }else {
        	System.out.println("Wrong Number Entered. ");
        }
		return price;
	}
	public static int stock(int total) {

		if(ItemCode==1) {
			if(ProdQty<=Quantity1) {
				total=Price1 * ProdQty;
				System.out.println("Total Cost: \t"+ total);
				Quantity1 = Quantity1 - ProdQty;
			} else { System.out.println("Sold Out."); }
		}else if(ItemCode==2) {
			if(ProdQty<=Quantity2) {
				total=Price2 * ProdQty;
				System.out.println("Total Cost: \t"+ total);
				Quantity2 = Quantity2 - ProdQty;
			} else { System.out.println("Sold Out."); }
		}else if(ItemCode==3) {
			if(ProdQty<=Quantity3) {
				total=Price3 * ProdQty;
				System.out.println("Total Cost: \t"+ total);
				Quantity3 = Quantity3 - ProdQty;
			} else { System.out.println("Sold Out."); }
		}else if(ItemCode==4) {
			if(ProdQty<=Quantity4) {
				total=Price4 * ProdQty;
				System.out.println("Total Cost: \t"+ total);
				Quantity4 = Quantity4 - ProdQty;
			} else { System.out.println("Sold Out."); }
		}else if(ItemCode==5) {
			if(ProdQty<=Quantity5) {
				total=Price5 * ProdQty;
				System.out.println("Total Cost: \t"+ total);
				Quantity5 = Quantity5 - ProdQty;
			} else { System.out.println("Sold Out."); }
		}else if(ItemCode==6) {
			if(ProdQty<=Quantity6) {
				total=Price6 * ProdQty;
				System.out.println("Total Cost: \t"+ total);
				Quantity6 = Quantity6 - ProdQty;
			} else { System.out.println("Sold Out."); }
		}
		return total;
	}
	
	public static int balance(int Change)
	{
		//prompt user to buy or exit.
		final Scanner in= new Scanner(System.in);
		System.out.println("Do you want to purchase? Y or N?");
		char let = in.next().charAt(0);
		switch(let){
			case 'n':
				BuyAgain=false;
				System.exit(0);
				break;
			case 'y':
			BuyAgain = true;
				break;
			default:
				System.out.println("Invalid Choice");
			in.close();	
		}
	{
	//change.
			if(Total <= Coins){
				Change = Coins - Total ;
				System.out.println("Your change is: \t" + Change); 
			}else{
				System.out.print("Sorry You don't have enough Money.!!!! ");
			}
		    return Change;
	}
  }
}
