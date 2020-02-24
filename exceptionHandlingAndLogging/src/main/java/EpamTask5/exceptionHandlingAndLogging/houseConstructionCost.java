package EpamTask5.exceptionHandlingAndLogging;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class standardHome_NonAutomated{
	double Cost_ofHome(double area,String Automated)
	{
		if(Automated.equals("No"))
     {
		double Cost=1200*area;
		return Cost;
	}
		else
		  return(0);
	}}
class AboveStandardHome_NonAutomated{
	double Cost_ofHome(double area,String Automated)
	{
		if(Automated.equals("No"))
     {
		double Cost=1500*area;
		return Cost;
	}
		else
		  return(0);
	}
}

class HighStandardHome_NonAutomated{
	double Cost_ofHome(double area,String Automated)
	{
		if(Automated.equals("No"))
     {
		double Cost=1800*area;
		return Cost;
	}
		else
		  return(0);
	}
	
}
class HighStandardHome_Automated{
	double Cost_ofHome(double area,String Automated)
	{
		if(Automated.equals("Yes"))
     {
		double Cost=2500*area;
		return Cost;
	}
		else
		  return(0);
	}
	
}

public  class houseConstructionCost {
	
	private static final Logger LOGGER= LogManager.getLogger(houseConstructionCost.class);
	public static void main(String[] args) throws IOException {
		Scanner input =new Scanner(System.in);
		
	    standardHome_NonAutomated  Std_NAobject=new standardHome_NonAutomated();
		AboveStandardHome_NonAutomated  AStd_NAobject=new AboveStandardHome_NonAutomated();
		HighStandardHome_NonAutomated  HStd_NAobject=new HighStandardHome_NonAutomated();
		HighStandardHome_Automated  HStd_Aobject=new HighStandardHome_Automated();
		
		OutputStreamWriter display=new OutputStreamWriter(System.out);
		 
		display.write("\n-|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
		display.flush();
		display.write("\n-------------------EPAM CLEAN CODE TASK------------------------");
		display.flush();
		display.write("\n-||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
		display.flush();
		Object Continue;
		
		do {
		display.write("\nEnter the area of the House(in sq. feet):: ");
		display.flush();
		double area=input.nextDouble();
		input.nextLine();
		display.write("\nDo you want your home to be automated::Type Yes Else No::: ");
		display.flush();
		String Automated=input.nextLine();
		double Std_NA=Std_NAobject.Cost_ofHome(area,Automated);
		double AStd_NA=AStd_NAobject.Cost_ofHome(area,Automated);
		double HStd_NA=HStd_NAobject.Cost_ofHome(area,Automated);
		double HStd_A=HStd_Aobject.Cost_ofHome(area,Automated);
		
	    display.write("\n\nThere are 4 Types of Home Specially designed to suit your needs And Budget");
		display.flush();
		display.write("\n1.Home built with Standard Materials");
		display.flush();
	    display.write("\n2.Home built with Above Standard Materials");
	    display.flush();
	    display.write("\n3.Home built with High Standard Materials");
		display.flush();
		display.write("\n4.Smart Home built with High Standard materials ");
		display.flush();
		display.write("\nEnter one of your choice from the above 4 Options(Enter Between 1-4)::: ");
		display.flush();
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:if(Std_NA==0)
		            {
			         LOGGER.info("Automated version Not Available for the selected input");
			         break;
		            }
		        else
		        	display.write("\nThe Price of Your Home According to area enterred by you is :: INR "+Std_NA);
		            display.flush();
		            break;
		case 2:if(AStd_NA==0)
                    {
                    LOGGER.info("Automated version Not Available for the selected input");
                    break;
                      }
                else
                 	display.write("\nThe Price of Your Home According to area enterred by you is :: INR "+AStd_NA);
                    display.flush();
                    break;
		case 3:if(HStd_NA==0)
                     {
                     LOGGER.info("Automated version Not Available for the selected input");
                     break;
                     }
               else
    	             display.write("\nThe Price of Your Home According to area enterred by you is ::INR "+HStd_NA);
                     display.flush();
                     break;
		case 4:if(HStd_A==0)
                  {
                  LOGGER.info("Automated version Not Available for the selected input");
                  break;
                  }
               else
    	          display.write("\nThe Price of Your Home According to area enterred by you is :: INR "+HStd_A);
                  display.flush();
                  break;
        default:
                 display.write("\nYou Have Entered A Wrong Choice Please Choose From one of the above Options");
                 display.flush();
                 break;
	       
		}
		display.write("\nIf Not Satisfies::We Would Recommend to Continue::Press Yes Else No:::");
        display.flush();
        input.nextLine();
        Continue=input.nextLine();
		}while(Continue.equals("Yes"));		
		
		LOGGER.info("\n--------Thank You For Using Us::Hope You Visit Again---------------");
        input.close();
	}

}
