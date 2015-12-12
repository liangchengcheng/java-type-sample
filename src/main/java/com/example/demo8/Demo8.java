package com.example.demo8;


import com.example.demo7.Info;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月12日21:25:16
 * Description:  通过泛型方法返回泛型类型实例
 */
public class Demo8 {

    public static void main(String args[]){
        // 返回泛型数组
        Integer i[] = fun1(1,2,3,4,5,6) ;
        fun2(i) ;
    }

    // 接收可变参数
    public static <T> T[] fun1(T...arg){
        // 返回泛型数组
        return arg ;
    }
    public static <T> void fun2(T param[]){
        // 输出
        System.out.print("接收泛型数组：") ;
        for(T t:param){
            System.out.print(t + "、") ;
        }
    }
}
