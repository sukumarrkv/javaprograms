package com.practice.hackerrank;

public class TimeConversionRunner {

	public static void main(String[] args) {
		System.out.println(timeConversion("06:40:03AM"));

	}
	
    public static String timeConversion(String s) {
    // Write your code here
    
    String date = s.substring(0, s.length()-2);
    int hh = Integer.parseInt(s.substring(0, 2));
    String res = null;
    
    if(s.endsWith("AM")){
        if(hh==12){
            hh=0;
        }
            String str = String.valueOf(hh);
            if(str.length()==1){
                str = "0"+ str;
            }
            res = str+date.substring(2, date.length());
    }else {
        if(hh!=12){
        	 hh = hh+12;
             String str = String.valueOf(hh);
             res = str+date.substring(2, date.length());
         }
     }
     return res;
 }
}
