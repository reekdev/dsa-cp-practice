/**
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
package practice.linkedlist.problems.RemoveLinkedListElements;



public class Solution {
    public static void main(String[] args) {
        var arr = new int[]{1,2,6,3,4,5,6};
        var result = removeElements(createListNodeFromArray(arr), 6);
        System.out.println(result);
    }


    public static ListNode removeElements(ListNode head, int val) {
        /*
          We create a dummy node, this is *not* what we will use to traverse the list
          but this will be used for the final answer.
         */
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        /*
         * This is used to traverse the list
         */
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return dummy.next;
    }

    private static ListNode createListNodeFromArray(int[] arr) {
        if (arr.length == 0)
            return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            current.next = node;
            current = node;
        }
        return head;
    }
}
