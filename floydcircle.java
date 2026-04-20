public class floydcircle {
    int val;
    floydcircle next;
    floydcircle(int x) { val = x; next = null; }
}

class CycleDetection {
    public boolean hasCycle(floydcircle head) {
        if (head == null) return false;
        floydcircle slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
    
