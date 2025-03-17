package practice.linkedlist.problems.LinkedListCycle;


import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    /*
    Process:
    we traverse through the list.
    we put the node in map (the entire object, the memory location)
    before putting, we check whether this object already exist in the map
    if it does, then break the loop and return true
    else continue the loop
     */
    public boolean hasCycle(ListNode head) {
        var map = new HashMap<ListNode, Boolean>();
        var current = head;
        while(current != null) {
            if (map.get(current) != null) {
                return true;
            }
            map.put(current, true);
            current = current.next;
        }
        return false;
    }
}
