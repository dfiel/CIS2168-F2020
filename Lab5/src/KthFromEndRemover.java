import java.util.*;

class KthFromEndRemover {
    public static void removeKthNodeFromEnd(LinkedList head, int k){
        LinkedList offset = head;
        LinkedList end = head;

        for (int i = 0; i < k; i++){
            if(end.next == null) throw new NoSuchElementException();
            end = end.next;
        }
        while(end.next != null){
            offset = offset.next;
            end = end.next;
        }
        offset.next = offset.next.next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value){
            this.value = value;
        }
    }
}
