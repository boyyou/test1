package com.test;

import com.test.nexus.Nexus;
/**
 * 2022/5/1 21:23
 *
 * @author ycl
 */
public class TestNexus {

    public static void main(String[] args) {
        Nexus nexus = new Nexus();
        System.out.println(nexus.test("测试数据!"));
        System.out.println(nexus.test("测试数据2!"));
        System.out.println(nexus.test("测试数据3!"));
        System.out.println(nexus.test("测试数据4dev!"));
        System.out.println(nexus.test("测试数据5msater!"));
        System.out.println(nexus.test("测试数据5dev!"));
        System.out.println(nexus.test("测试数据6master!remote"));
    }

}
