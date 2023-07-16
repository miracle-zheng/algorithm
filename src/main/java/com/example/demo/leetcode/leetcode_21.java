package com.example.demo.leetcode;

import java.util.List;

public class leetcode_21 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode head = new ListNode();
//            ListNode headResult =  head;
//            while(true){
//                if (list1 == null && list2 == null) {
//                    break;
//                }
//                if (list1 == null) {
//                    head.next = list2;
//                    head = head.next;
//                    list2 = list2.next;
//                    continue;
//                }
//                if (list2 == null) {
//                    head.next = list1;
//                    head = head.next;
//                    list1 = list1.next;
//                    continue;
//                }
//                if (list1.val >= list2.val) {
//                    head.next = list2;
//                    head = head.next;
//                    list2 = list2.next;
//                } else {
//                    head.next = list1;
//                    head = head.next;
//                    list1 = list1.next;
//                }
//            }
//
//            return headResult.next;
//        }
//    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            if (list1.val <= list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }else {
                list2.next = mergeTwoLists(list2.next, list1);
                return list2;
            }
        }
    }
}
