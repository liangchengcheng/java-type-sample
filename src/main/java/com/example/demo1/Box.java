package com.example.demo1;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年12月12日20:19:56
 * Description:
 */
public class Box<T> {

    private T data;

    public  Box(){

    }

    public  Box(T data){
        this.data=data;
    }

    public T getData(){
        return data;
    }
}
