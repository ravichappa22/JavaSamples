package com.mycompany;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternManip {
    private static final String ALPHA_PATTHERN = "^[a-zA-Z0-9]+$";
    private static final Pattern pattern = Pattern.compile(ALPHA_PATTHERN, Pattern.CASE_INSENSITIVE);
    public static void main(String args[]) {
        Matcher matcher = pattern.matcher("username");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);

        String url = "http://host:port/imageWebServie/servlet/AxisServlet";
        String baseurl = url.substring(0, url.lastIndexOf("/")-8);
        System.out.println(baseurl);
    }
}
