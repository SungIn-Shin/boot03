package com.si.project.utils;

public class StringUtils {
    public static String lpad(String strContext, int iLen, String strChar) {
        String strResult = "";

        StringBuilder sb = new StringBuilder();
        for (int i = strContext.length(); i < iLen; i++) {
            sb.append(strChar);
        }
        strResult =  strContext + sb;

        return strResult;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.lpad("A", 10, "0"));
        System.out.println("A" + org.apache.commons.lang3.StringUtils.leftPad("12", 10, '0'));
    }
}