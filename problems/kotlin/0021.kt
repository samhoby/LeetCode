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
        var list1Var = list1
        var list2Var = list2
        var curr = dummy

        while (list1Var != null && list2Var != null) {
            if (list1Var.`val` < list2Var.`val`) {
                curr.next = list1Var
                list1Var = list1Var.next
                curr = curr.next
            } else {
                curr.next = list2Var
                list2Var = list2Var.next
                curr = curr.next
            }
        }

        curr.next = if (list1Var != null) list1Var else list2Var
        return dummy.next
    }
}
