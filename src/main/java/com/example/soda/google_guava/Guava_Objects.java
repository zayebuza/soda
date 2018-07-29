package com.example.soda.google_guava;

import com.google.common.base.Objects;

/**
 * Created by miaodongbiao
 * Date:2018/7/15-11:57
 * Description:
 */
public class Guava_Objects {
    public static void main(String[] args) {
        boolean s =Objects.equal("a",null);
        System.out.println(s);
        String b ="a";
        String c= null;
        System.out.println(b.equals(c));
    }

}
