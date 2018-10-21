/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MAHBUB
 */
public class checkPointTest {

    public static void main(String[] args) {
        ArrayList dates = new ArrayList();
        dates.add(new Date());
        dates.add(new Date(4-02-2017));
        
        Date date = (Date)dates.get(0);

        System.out.println(dates + " ");
        System.out.println(date + " ");
    }

}
