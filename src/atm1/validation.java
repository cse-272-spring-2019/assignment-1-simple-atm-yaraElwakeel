/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm1;

import java.util.HashMap;

/**
 *
 * @author yarae
 */
public class validation {
    HashMap userHashMap;
    public validation(){
        userHashMap=new HashMap();
        userHashMap.put("yara","1999");
    }
    
    
   public boolean validate (String username, String pincode){
       boolean validationresult= false;
       String pinString=(String)userHashMap.get(username);
       if (pinString!=null) {
           validationresult=pinString.equals(pincode);
       }
       return validationresult;
   }
    
}
