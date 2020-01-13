import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.Scanner;

public class MondayHomeWork {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your email and password");
        String actualEmail=scan.nextLine();
        String actuaiPassword=scan.nextLine();

        String expectedEmail="moni124@";
        String expectedPassword="ratna142";
        for(int i=0;i<5;i++){
            if(!(actualEmail.equals(expectedEmail) && actuaiPassword.equals(expectedPassword))){
            int count=5-i ;
            System.out.println("please enter your valid email and password"+ count + " more tries");

            if(i==4) {
                System.out.println("Your account will be locked for 10 min");
            }
            }else {
                System.out.println("Welcome to home page");
                break;
            }
            }
            }

        }




