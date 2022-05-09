package com.mycompany;

public class StaticInheritance2 extends StaticInheritance {

    public static String getName(String name){
        return "Hello StaticInheritance 2 =" + name;
    }

    @Override
    public String getNameNoStatic(String name){
        return "Hello StaticInheritance 2 =" + name;
    }
}
