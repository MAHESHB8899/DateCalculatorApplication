package com.DateCalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController1 {
     public int getSum(int a,int b) {
		return a+b; 
     }
     public int getSub(int a,int b) {
    	 return a-b;
     }
     public int getDiv(int a,int b) {
    	 return a/b;
     }
     public int getMulti(int a,int b) {
    	 return a*b;
     }
     
}
