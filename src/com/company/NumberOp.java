package com.company;

import java.util.ArrayList;

/**
 * Created by Legat on 6/4/2016.
 */

public class NumberOp {
  static public ArrayList<Integer> union (ArrayList<Integer> num1, ArrayList<Integer> num2){
      for (int i= 0; i<num2.size(); i++){
          num1.add(num2.get(i));
      }
      return num1;
  }
    static public ArrayList<Integer>  intersection (ArrayList<Integer> num1, ArrayList<Integer> num2){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i= 0; i<num2.size(); i++){
            if (num1.contains(num2.get(i)))
            temp.add(num2.get(i));
        }
        return temp;
    }
}
