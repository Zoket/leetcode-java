import Execute.ListNode;

class Execute {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode pointer = head;
        int length = 0;
        while (pointer.next != null) {
            pointer = pointer.next;
            length++;
        }
        int offset = length + 1 - (k / length + 1);
        pointer.next = head;
        for (int i = 0; i < offset; i++) {
            pointer = pointer.next;
        }
        ListNode result = pointer.next;
        pointer.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode result = rotateRight(new ListNode(0, new ListNode(1, new ListNode(2))), 4);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}