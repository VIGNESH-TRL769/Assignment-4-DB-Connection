package org.example;
import java.util.Scanner;
import java.util.logging.Logger;

class DatabaseConnection {
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        while(true) {
            LOGGER.info("\n1.Connetion to DataBase\n2.new Connection\n3.Close All Connection\n4.View Status\n5.Exit\nEnter the Choice:");
            int key = input.nextInt();
            int temp=0;
            Database.getInstance();
            switch (key) {
                case 1 -> Database.getConnection();
                case 2 -> Database.newConnection();
                case 3 -> Database.closeConnection();
                case 4->  Database.viewStatus();
                case 5 -> {
                    LOGGER.info("-----Thank You-----");
                    temp = 1;
                }
                default -> LOGGER.info("Please enter Valid Choice");
            }
            if(temp==1)
            {
                break;
            }
        }

    }
}