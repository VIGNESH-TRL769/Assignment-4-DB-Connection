package org.example;
import java.util.logging.Logger;
class Database {
    static int temp=0;
    static int v=0;
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    static Database dbObject=null;
    private Database() {
    }

    public static Database getInstance()
    {

        if(v == 0)
        {
            LOGGER.info("New Connection");
            dbObject = new Database();
            v=1;
        }
        else
        {

            LOGGER.info("Already Connection Exists");
        }
        return dbObject;
    }

    public static void getConnection()
    {
        temp=1;
        String print="Connected Successfully:"+dbObject;
        LOGGER.info(print);
    }
    public static void newConnection()
    {
        temp=0;
        v=0;
        dbObject=getInstance();
        String print="New Connection Initiziated:"+dbObject;
        LOGGER.info(print);
    }
    public static void viewStatus()
    {
        if(temp==1)
        {
            LOGGER.info("Connection ON");
        }
        else
        {
            LOGGER.info("Connection OFF");
        }
    }
    public  static void closeConnection()
    {
        temp=0;
        v=0;
        String print="Connection closed";
        LOGGER.info(print);
    }

}
