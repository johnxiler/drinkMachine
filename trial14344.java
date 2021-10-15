import java.util.InputMismatchException;
import java.util.Scanner;

public class trial14344 {

    final static int ProPrice1 = 13;       final static String ProName1 = "Original coffe";
    final static int ProPrice2 = 13;       final static String ProName2 = "C2 Red";
    final static int ProPrice3 = 16;       final static String ProName3 = "Royal";
    final static int ProPrice4 = 18;       final static String ProName4 = "Diet Coke";
    final static int ProPrice5 = 25;       final static String ProName5 = "Gatorade";
    final static int ProPrice6 = 70;       final static String ProName6 = "1.75lt Pepsi";

    public static int Prostock1 = 10;         public static int Prostock4 = 8;
    public static int Prostock2 = 6;         public static int Prostock5 = 9;
    public static int Prostock3 = 7;         public static int Prostock6 = 10;

    public static int UserMoney, ProdNum, ProdQun, price, stock, change, total;
    
    public static boolean buygain = true, error = false;

    static Scanner in = new Scanner(System.in);
    public static void main (String [] args){
        
        while(buygain){
            System.out.println("Drinks Machine Simulator\n");
                
            System.out.println(" \tWelcome!!! Please choose your desired Drinks"
            + "\n \n|Number| \t| list of drinks | \t|  Price  | \t| Availability\t|"
            + "\n|  1   | \t| " + ProName1 + " | \t|  P"+ProPrice1+".00 | \t|\t" + Prostock1 +"\t|"
            + "\n|  2   | \t| " + ProName2 + "\t | \t|  P"+ProPrice2+".00 | \t|\t" + Prostock2 +"\t|"
            + "\n|  3   | \t| " + ProName3 + "    \t | \t|  P"+ProPrice3+".00 | \t|\t" + Prostock3 +"\t|"
            + "\n|  4   | \t| " + ProName4 + "\t | \t|  P"+ProPrice4+".00 | \t|\t" + Prostock4 +"\t|"
            + "\n|  5   | \t| " + ProName5 + "\t | \t|  P"+ProPrice5+".00 | \t|\t" + Prostock5 +"\t|"
            + "\n|  6   | \t| " + ProName6 + "\t | \t|  P"+ProPrice6+".00 | \t|\t" + Prostock6 +"\t|");

            do{ try{
                System.out.print("Enter Product Number: ");
                ProdNum = in.nextInt();
                price = ProductPrice(ProdNum);
                error = false;
            }catch(InputMismatchException e){
                System.out.println("Wrong Input, try again"); error = true; in.nextLine();
            }   }while (error); 
            
            do{ try{
                System.out.print("How many you want to buy? ");
                ProdQun = in.nextInt();
                total = Productstock(ProdNum);
                error = false;
            }catch(InputMismatchException e){
                System.out.println("Wrong Input, try again"); error = true; in.nextLine();
            }   }while (error); 
            
            do{ try{
                System.out.print("Please Enter your Money: ");
                UserMoney = in.nextInt();
                change = balance(change);
                error = false;
            }catch(InputMismatchException e){
                System.out.println("Wrong Input, try again"); error = true; in.nextLine();
            }   }while (error); 
            
            do{ try{
                System.out.println("Do you want to buy again?");
                String pickyn = in.next();
                    if(pickyn.equals("yes")){
                        buygain = true;
                    }else if(pickyn.equals("no")){
                        buygain = false;
                    }
                error = false;
            }catch(InputMismatchException e){
                System.out.println("Wrong Input, try again"); error = true; in.nextLine();
            }   }while (error); 
            
        }
    }
    public static int ProductPrice(int price){

        if(ProdNum == 1){
            System.out.println("Name: "+ProName1+ " Price: " + ProPrice1);  price = ProPrice1; 
        }else if(ProdNum == 2){
            System.out.println("Name: "+ProName2+ " Price: " + ProPrice2); price = ProPrice2; 
        }else if(ProdNum == 3){
            System.out.println("Name: "+ProName3+ " Price: " + ProPrice3); price = ProPrice3; 
        }else if(ProdNum == 4){
            System.out.println("Name: "+ProName4+ " Price: " + ProPrice4); price = ProPrice4; 
        }else if(ProdNum == 5){
            System.out.println("Name: "+ProName5+ " Price: " + ProPrice5); price = ProPrice5; 
        }else if(ProdNum == 6){
            System.out.println("Name: "+ProName6+ " Price: " + ProPrice6); price = ProPrice6; 
        }else{
            System.out.print("Wrong Number entered ");
        }
        return price;
    }
    public static int Productstock(int total){
        
        if(ProdNum == 1){
            if(ProdQun <= Prostock1){
                total = ProPrice1 * ProdQun;
                System.out.println("The total cost is: \t" + total); 
                Prostock1 = Prostock1 - ProdQun;
            }else{  System.out.print(" insefiendt stock "); }
        }
        return total;
    }
    public static int balance(int change){

        if(total <= UserMoney){
            change = UserMoney - total ;
            System.out.println("Your change is: \t" + change); 
        }else{
            System.out.print(" Your don't have enought Money! ");
        }
    return change;

    }
}

/*
        System.out.print("How many you want to buy? ");
        int ProdQun = in.nextInt();
*/