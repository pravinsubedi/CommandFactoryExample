/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandfactoryexample;

import commandfactoryexample.commands.CommandFactory;
import commandfactoryexample.commands.Commands;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pravin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CommandFactory factory=new CommandFactory();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number 1");
        double x=Double.parseDouble(reader.readLine());
        System.out.println("enter number 2");
        double y=Double.parseDouble(reader.readLine());
        System.out.println("1.Press + for addition\r\n");
        System.out.println("2.Press - for addition\r\n");
        System.out.println("3.Press * for addition\r\n");
        System.out.println("4.Press / for addition\r\n");
        String com=reader.readLine();
        Commands c=factory.getCommand(com);// its like Commands c=new AddCommand if + is typed
        System.out.println(c.execute(x, y));
    }
    
}
