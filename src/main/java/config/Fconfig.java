package config;

import org.testng.annotations.Test;

public class Fconfig {
    public static String environmentName = System.getProperty("env","Akshayenv");

    @Test
    public void star(){

        for (int i=0; i<5; i++){

            for (int j=5;j>i;j++){
                System.out.print(" *");
            }
            System.out.println("\n");
        }





    }








    }
