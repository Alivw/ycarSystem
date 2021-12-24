package com.jalivv.car;

import org.junit.Test;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/24 21:17
 */
public class TestApplication {



    @Test

    public void shengdanshu(){

        //松叶层

        int level = 10;

        //树干层

        int rootLevel = 2;

        int spaceNum = level - 1;


        //画松叶

        for (int i = 1; i <= level; i++) {

            spaceNum--;

            for (int g = 0; g <= spaceNum; g++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= ((i * 2) -1); j++) {

                System.out.print("*");

            }


            System.out.print("\n");

        }

        System.out.println("    ❤圣诞节快乐❤");

        for (int i = 1; i <= rootLevel; i++) {

            for (int g = 1; g < level; g++) {

                System.out.print(" ");

            }

            System.out.print("*\n");

        }

    }
}
