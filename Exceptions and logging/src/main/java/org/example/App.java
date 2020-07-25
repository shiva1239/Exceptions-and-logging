package org.example;

import org.example.interest.*;
import org.example.homecost.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
         final Logger logger = LogManager.getLogger(org.example.App.class);
         Scanner sc = new Scanner(System.in);
         logger.info("1. Simple Interest\n2. Compound Interest\n3.Construction cost\nEnter your choice:");
         int choice = sc.nextInt();
         switch(choice){
             case 1: {
                 logger.info("Enter p,r,t:");
                 double p = sc.nextDouble();
                 double r = sc.nextDouble();
                 double t = sc.nextDouble();
                 Interest i = new Interest(p,r,t);
                 logger.info(i.calculate_SI());
                 break;
             }
             case 2:{
                 logger.info("Enter p,r,t:");
                 double p = sc.nextDouble();
                 double r = sc.nextDouble();
                 double t = sc.nextDouble();
                 Interest i = new Interest(p,r,t);
                 logger.info(i.calculate_CI());
                 break;
             }
             case 3:{
                 int materialType;
                 double areaOfHouse;
                 boolean isAutomated;
                 materialType = sc.nextInt();
                 areaOfHouse = sc.nextDouble();
                 isAutomated = sc.nextBoolean();
                 EstimateHomeCost e = new EstimateHomeCost(materialType,areaOfHouse,isAutomated);
                 logger.info(e.Estimate());
                 break;
             }
             default:{
                 logger.warn("That's not a valid option");
             }

         }

    }
}
