/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.javacollectiondemo;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author zhangjh
 */
public class HashMapDemo {
    public static void main(String[] args){
        HashMap hm;
        hm = new HashMap<>();
        Integer sum = 0;
        hm.put("S001",1);
        hm.put("S002",2);
        hm.put("S003",5);
        hm.put("S004",5);
        hm.put("S005",10);
        
        for(Iterator<String> it=hm.keySet().iterator();it.hasNext();){
            String key = it.next();
            System.out.println("hm has :" + hm.get(key));
            Integer value = (Integer) hm.get(key);
            sum += value;
           
        }
        System.out.println("sum is : " + sum);
        
    }
}
