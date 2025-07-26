package com.oak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grade {
   private Map<String,Integer> results = new HashMap<>();
   private double gpa;

   private double determineGradeValue(String grade){
       switch (grade.toUpperCase()){
           case "A+":
               return 4.5;
           case "A":
               return 4;
           case "B+":
               return 3.5;
           case "B":
               return 3;
           case "C+":
               return 2.5;
           case "C":
               return 2.0;
           case "D+":
               return 1.5;
           case "D":
               return 1.0;
           case "E":
               return 0;
           default:
               return 0;
       }
   }

   public void addGrade(String grade){
       results.put(grade, results.getOrDefault(grade, 0) + 1);
   }
   public double getGpa(){
       int count = 0;
       for (var grade : results.entrySet()){
           gpa += grade.getValue()* determineGradeValue(grade.getKey());
           count += grade.getValue();
       }
       return Math.round( gpa/count*100.00)/100.00;
   }
   public List<String> getResults(){
       List<String> res = new ArrayList<>();
       for(var i : results.entrySet()){
           for(int j=0;j<i.getValue();j++){
               res.add(i.getKey());
           }
       }
       return res;
   }
   public void resultSummary(){
        results.forEach((g,v)->System.out.println(g.toUpperCase()+" : "+v) );
   }
}
