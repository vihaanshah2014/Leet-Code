class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
    ListNode dummy = new ListNode();
    ListNode tail = dummy;
    
      while(list1 != null && list2 != null){
        if(list1.val <= list2.val){
          tail.next = list1;
          list1 = list1.next;
        }//end if 
        else {
          tail.next = list2;
          list2 = list2.next;
        }//end else
        tail = tail.next;
      }//end while 
      if(list1 != null){
        tail.next = list1;
      }//end if
      else {
        tail.next = list2;
      }// end else
      
      return dummy.next;
    }//end method
}//end class
