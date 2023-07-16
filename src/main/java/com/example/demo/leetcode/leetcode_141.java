package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_141 {

    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

    public class Solution {
//        public boolean hasCycle(ListNode head) {
//
//            List<ListNode> list = new ArrayList<>();
//
//            while(head != null){
//                list.add(head);
//                head = head.next;
//                if (list.contains(head)) {
//                    return true;
//                }
//            }
//
//            return false;
//        }


        //快慢指针的思路，快指针一次走两个，慢指针一次走一个，如果存在环，必然两者会相遇
        public boolean hasCycle(ListNode head) {
            ListNode fastPtr = head;
            ListNode slowPtr = head;
            while (fastPtr != null && fastPtr.next != null && fastPtr.next.next !=null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;

                if (slowPtr == fastPtr) {
                    return true;
                }
            }
            return false;
        }
    }
}
