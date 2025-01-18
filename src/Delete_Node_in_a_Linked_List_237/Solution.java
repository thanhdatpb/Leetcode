package Delete_Node_in_a_Linked_List_237;

import Top_Interview_150.AddTwoNumbers_2.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        ListNode pre = null;

        while(node.next != null) {
            node.val = node.next.val;
            pre = node;
            node = node.next;
        }

        pre.next = null;
    }
}
