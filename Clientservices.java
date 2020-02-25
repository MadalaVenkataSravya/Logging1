package com.epam.Logging1;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Clientservices{
		
		public static void main(String args[]){
			final Logger LOGGER = LogManager.getLogger(Clientservices.class);

	
			Scanner sc=new Scanner(System.in);
			LOGGER.info("Enter your choice\n1.Interest(Simple Interest/Compound Interest)\n2.Home Construction\n");
			int choice1=sc.nextInt();
			if(choice1==1) {
			while(true){
			 LOGGER.info("Enter principal amount\n");
			int pa=sc.nextInt();
			 LOGGER.info("Enter time period\n");
			    int tp=sc.nextInt();
			 LOGGER.info("Enter rate of interest\n");
		    float ri=sc.nextFloat();
		    LOGGER.info("Enter your choice\n1.Simple Interest\n2.Compound Interest\n");
		    int ch=sc.nextInt();
		    Sim_Com_Interest i=new Sim_Com_Interest();
		    if(ch==1) {
		    	LOGGER.info("Simple Interest:"+i.simpleinterest(pa,tp,ri));
		    }
		    if(ch==2) {
		    	LOGGER.info("Compound Interest:"+i.compoundinterest(pa,tp,ri));
		    		
		    }
		    LOGGER.info("\nIf you want to exit!Enter 0 Otherwise enter any number");
			 int cho= sc.nextInt();	
			 if(cho==0) {
				    LOGGER.info("exit");
					break;
				}
			}
			}
			if(choice1==2) {
			House_cost h=new House_cost();
			LOGGER.info("Enter area of a home");
			int area=sc.nextInt();
			LOGGER.info("\nSelect a Material Standard:");
			LOGGER.info("1.1200 INR--- Standard Materials\n2.1500 INR--- Above Standard Materials\n3.1800 INR--- High Standard Material\n4.2500 INR--- High Standard Material+Fully Automated Home");
			int choice=sc.nextInt();
			if(choice==1) {
				LOGGER.info("\nTotal Construction cost with Standard Materials is"+h.home_construct(1200,area));
			}
			if(choice==2) {

				LOGGER.info("\nTotal Construction cost with above Standard Materials is"+h.home_construct(1500,area));
			}
			if(choice==3) {

				LOGGER.info("\nTotal Construction cost with high Standard Materials is"+h.home_construct(1800,area));
			}
			if(choice==4) {

				LOGGER.info("\nTotal Construction cost with fully automated home is"+h.home_construct(2500,area));
			}
			
			
		}
		}
}
