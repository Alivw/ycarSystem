package com.darksnow.utlis;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Utils {
    /**
     * md5加密方法
     * @param password
     * @return
     */
    public static String md5Password(String  password){
    try{
        //得到一个信息摘要器
        MessageDigest digest = MessageDigest.getInstance("md5");
        byte[] bytes = digest.digest(password.getBytes());
        StringBuffer buffer = new StringBuffer();
        //for循环byte做运算
        for (byte b:bytes){
            int num=b & 0xff;//加盐
            String s = Integer.toHexString(num);
            if(s.length()==1){
                buffer.append("0");
            }
            buffer.append(s);
        }
        //结果
        return  buffer.toString();
         } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return "";
     }
    }

    //测试
    public static void main(String[] args) {
        String password1 = MD5Utils.md5Password("&89oljn)....");
        System.out.println(password1);
    }
}
