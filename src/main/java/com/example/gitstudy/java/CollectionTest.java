package com.example.gitstudy.java;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.size());
        System.out.println();

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.poll());
        System.out.println();

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("danny", 1);
        map.put("amy", 2);
        map.put("ben", 3);
        map.put("clyne", 4);

        System.out.println(map.get("danny"));
        System.out.println(map.getOrDefault("elliot", 100));

    }
}
