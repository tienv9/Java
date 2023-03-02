package timeworkcal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Timeworkcal {


    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("1.Calculate Amount of time work per week \n");
            System.out.print("5.Quit \n");
            choice = input.nextInt();
            
            switch (choice){
                case 1:
                    choice = 1;
                    System.out.println("How many day of work are there?");
                    int dayc = input.nextInt();
                    int sum = 0;
                    int summ = 0;
                    
                    for(int i = 0; i < dayc; i++){
                        
                        System.out.print("Work from hour: \n");
                        int ih = input.nextInt();
                        System.out.print("Work from min: \n");
                        int im = input.nextInt();
                        
                        System.out.print("Work to hour: \n");
                        int oh = input.nextInt();
                        System.out.print("Work to min: \n");
                        int om = input.nextInt();
                        
                                             
                        int hw = 0;
                        if(oh < ih){
                            hw = (oh + 12) - ih;
                        }
                        else{
                            hw = oh - ih;
                        }
                        
                        sum += (hw*60);
                        summ += (om - im);
                    }
                    int totalh = (sum/60);
                    double d = summ;
                    double rem = d / 60;
                    
                    //automatic remove half an hour of lunch and calculate wages 17$/hr
                    double tot = (totalh + rem)-(.5 * dayc); 
                    double wages = tot * 17;
                    System.out.printf("Total hour per week is: %.2f for 17/hrs: %.2f \n", tot, wages);
                    break;
                    
                case 5:
                    choice = 5;
                    break;
                default:
                    System.out.print("Quit or pick 1");
            }
        }while (choice != 5);
        
        
    }
    
}
