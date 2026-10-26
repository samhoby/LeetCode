/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var curr = dummy

        var node1 = list1
        var node2 = list2
        
        while (node1 != null && node2 != null) {
            if (node1.`val` < node2.`val`) {
                curr.next = node1
                node1 = node1.next
                curr = curr.next
            } else {
                curr.next = node2
                node2 = node2.next
                curr = curr.next
            }
        }

        curr.next = if (node1 != null) node1 else node2
        return dummy.next
    }
}