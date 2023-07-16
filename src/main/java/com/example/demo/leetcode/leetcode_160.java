package com.example.demo.leetcode;

public class leetcode_160 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

     //思路：找出AB链表的长度差，并且将长的往后走长度差，将AB链表对齐，再一起往后走
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int aLength = 0;
            int bLength = 0;
            ListNode headATemp = headA;
            ListNode headBTemp = headB;
            while (headATemp != null){
                aLength++;
                headATemp = headATemp.next;
            }
            while (headBTemp != null){
                bLength++;
                headBTemp = headBTemp.next;
            }
            if (aLength > bLength) {
                for (int i = 0; i< aLength - bLength; i++){
                    headA = headA.next;
                }
            } else if (aLength < bLength){
                for (int i = 0; i< bLength - aLength; i++){
                    headB = headB.next;
                }
            }
            while (headA != null && headB != null) {
                if (headA == headB){
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
            return null;
        }
    }
}
