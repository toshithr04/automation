package org.example;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {




    public static HashMap<String,String> getWindowHandleandTitle(WebDriver Driver){
        HashMap<String,String> hash = new HashMap<>();
        Set<String> windowhandes = Driver.getWindowHandles();
        Iterator<String> it = windowhandes.iterator();
        while (it.hasNext()){
            String handle = it.next();
            String title = Driver.switchTo().window(handle).getTitle();
            hash.put(handle,title);
        }


        return hash;
    }


}
