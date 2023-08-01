package com.example.demo.leetcode;

public class leetcode_2 {

     public class ListNode {
          int val;
         ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //暂存头部
            ListNode l1Head = l1;
            ListNode l2Head = l2;
            //初始化链表长度
            int l1Length = 0;
            int l2Length = 0;
            //获取链表长度
            while (l1 != null){
                l1Length ++;
                l1 = l1.next;
            }
            while (l2 != null){
                l2Length ++;
                l2 = l2.next;
            }
            //对齐链表，在后面补0
            if (l1Length > l2Length){

            }

            return l1Head;
        }
    }

}
