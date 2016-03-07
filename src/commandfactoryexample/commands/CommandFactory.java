/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandfactoryexample.commands;

import java.util.HashMap;

/**
 *
 * @author pravin
 */
public class CommandFactory {
    private HashMap<String,Commands> commands=initialize();
    private HashMap<String,Commands> initialize(){
        HashMap<String,Commands> c=new HashMap<String,Commands>();
        c.put("+", new AddCommand());
        c.put("-", new SubCommand());
        c.put("*", new MulCommand());
        c.put("/", new DivCommand());
        return c;
    }
    public Commands getCommand(String key){
        if(isCommand(key)){
        return (Commands) commands.get(key);
        }
        else
            return null;
    }
    public Boolean isCommand(String key){
        return commands.containsKey(key);
    }
    
}
