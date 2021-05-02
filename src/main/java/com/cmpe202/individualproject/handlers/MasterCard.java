package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class MasterCard implements CreditCardHandler{
    CreditCardHandler nextHandler;
    public MasterCard() {
        nextHandler = new Visa();
    }

    @Override
    public String check(CreditCardEntry creditCardEntry) {
      Long a =  creditCardEntry.getCardNumber();
      String number = a.toString();
      String result = "";

        if(number.length() <= 19 && number.length() > 0) {
           String fDigit = number.substring(0, 1);
           int sDigit = Integer.parseInt(number.substring(1,2));
           if (fDigit.equals("5") && number.length() == 16 && sDigit >= 1 && sDigit <= 5) {
               result = "Master Card";
           } else {
               return nextHandler.check(creditCardEntry);
           }
       }
       else {
           System.out.println("Invalid card type!");
       }
        return result;
    }
}
