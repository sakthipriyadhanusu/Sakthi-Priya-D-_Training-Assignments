package com.javaAssignment4;

import java.util.regex.*;

public class PhoneValidation 
{
    public static void main(String[] args) 
    {

        String phone1 = "001-765-989-3421";
        String phone2 = "+1-456-765-9345";

        String regex = "^([0-9]{1,3}|\\+[0-9]{1,3})-[0-9]{3}-[0-9]{3}-[0-9]{4}$";

        System.out.println(phone1 + " : " + phone1.matches(regex));
        System.out.println(phone2 + " : " + phone2.matches(regex));
    }
}
