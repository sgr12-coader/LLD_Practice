package DesignPatterns.BehavioralDesignPattern.InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> contextMap=new HashMap<>();
    public void add(String key, Integer value){
        contextMap.put(key, value);
    }

    public Integer get(String key){
        return contextMap.get(key);
    }
}
