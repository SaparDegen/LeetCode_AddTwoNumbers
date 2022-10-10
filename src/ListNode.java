import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void display() {
        ListNode listNode = this;
        String res = "";
        while (listNode != null) {
            res += listNode.val + " ";
            listNode = listNode.next;
        }
        System.out.println(res);
    }
}
