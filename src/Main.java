import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = longToNode(11111111111L);
        ListNode listNode2 = longToNode(11111111111L);
/*        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));*/
        addTwoNumbers(listNode1, listNode2).display();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long g1 = nodeToLong(l1);
        long g2 = nodeToLong(l2);
        long gg = g1 + g2;
        return longToNode(gg);
    }

/*    public static List<Integer> nodeToArr(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list);
        return list;
    }*/

    public static long nodeToLong(ListNode listNode) {
        long mnoj = 1;
        long aa = 0;
        while (listNode != null) {
            int a = listNode.val;
            listNode = listNode.next;
            aa += a * mnoj;
            mnoj *= 10;
        }
        return aa;
    }

    public static ListNode longToNode(long n) {
        ListNode head = new ListNode();
        ListNode tail = new ListNode();
        int c = 0;
        while (n != 0) {
            long reminder = n % 10;
            ListNode listNode = new ListNode((int) reminder);
            if (c == 0) {
                head = listNode;
                tail = listNode;
            } else {
                tail.next = listNode;
                tail = listNode;
            }
            n = n / 10;
            c++;
        }
        return head;
    }
}