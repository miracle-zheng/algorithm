package com.example.demo.leetcode;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class leetcode_146 {

    class LRUCache {

        private LinkedHashMap<Integer, Integer> cache ;
        private Integer capacity;

        public LRUCache(int capacity) {
            this.cache = new LinkedHashMap<>(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return cache.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            //先放
            cache.put(key, value);
            //判断放完key之后容量是否超过最大容量，如果超过就清理最近最少使用
            if (cache.size() > capacity){
                Iterator<Integer> iterator = cache.keySet().iterator();
                //Set中第一个元素就是最久没有用过的
                Integer oldestKey = iterator.next();
                cache.remove(oldestKey);
            }
        }
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}


