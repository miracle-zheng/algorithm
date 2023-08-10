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
            ListNode result = l1;
            //初始化链表长度
            int l1Length = 1;
            int l2Length = 1;
            //获取链表长度
            while (l1.next != null){
                l1Length ++;
                l1 = l1.next;
            }
            while (l2.next != null){
                l2Length ++;
                l2 = l2.next;
            }
            //对齐链表，在后面补0
            if (l1Length > l2Length){
                for (int i = 0; i < l1Length - l2Length; i++){
                    ListNode temp = new ListNode(0);
                    l2.next = temp;
                    l2 = l2.next;
                }
            }
            if (l1Length < l2Length){
                for (int i = 0; i < l2Length - l1Length; i++){
                    ListNode temp = new ListNode(0);
                    l1.next = temp;
                    l1 = l1.next;
                }
            }
            //进位的标识
            boolean isCarry = false;
            //两个链表相加
            while(l1Head != null && l2Head != null){
                int add = l1Head.val + l2Head.val;
                //如果上一位进位了则两数之和+1
                if (isCarry) add++;
                l1Head.val = add % 10;
                //判断是否需要进位
                if (add >= 10) {
                    isCarry = true;
                }else {
                    isCarry = false;
                }
                //特殊判断最后一位，如果需要进位得额外加个节点
                if (l1Head.next == null && isCarry == true){
                    ListNode temp = new ListNode(1);
                    l1Head.next = temp;
                }
                l1Head = l1Head.next;
                l2Head = l2Head.next;
            }

            return result;
        }
    }

}
