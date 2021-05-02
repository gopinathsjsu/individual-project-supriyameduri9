package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Discover implements CreditCardHandler{
    CreditCardHandler nextHandler;

    public Discover() { }

    @Override
    public String check(CreditCardEntry creditCardEntry) {
        Long a =  creditCardEntry.getCardNumber();
        String number = a.toString();
        String result = "";
        String fourDigit = number.substring(0, 4);
       // System.out.println("four digits are " + fourDigit);
        int sDigit = Integer.parseInt(number.substring(1,2));

        if(fourDigit.equals("6011") && number.length() == 16) {
            result = "Discover";
        }
        else {
            result = "No Matching Credit Card Type";
        }
        return result;
    }
}
