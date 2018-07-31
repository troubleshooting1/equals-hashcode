package com.anji.equalshashcode;

import java.util.HashSet;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/30 9:33
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new A());
        hashSet.add(new A());
        hashSet.add(new B());
        hashSet.add(new B());
        hashSet.add(new C());
        hashSet.add(new C());
        hashSet.add(new D());
        hashSet.add(new D());
        for (Object hs : hashSet) {
            System.out.println(hs);
        }

    }
}
