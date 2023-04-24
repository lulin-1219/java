package com.learnning;

public class LinkedList {
    private ListNode head;

    // 将val插入到链表末尾
    public void add(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    // 删除指定的节点
    public void delete(ListNode node) {
        if (node == null || head == null) {
            return;
        }
        if (head == node) {
            head = head.next;
            return;
        }
        ListNode cur = head;
        while (cur.next != null && cur.next != node) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // 打印链表中的所有值
    public void print() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
