/*
 *This class contains the biz logic 
*/

package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List getBrands(String color){
         List brands =new ArrayList();
        
        try{
       
        if(color.equals("amber")){
            brands.add("BeerBrand amber");
            brands.add("one more amber brand");
            
        }
        else if(color.equals("light")){
            brands.add("BeerBrand Light");
        }
        else{
            brands.add("BeerBrand brown or dark");
        }
        
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return brands;
    }
    
    
    
    
}
