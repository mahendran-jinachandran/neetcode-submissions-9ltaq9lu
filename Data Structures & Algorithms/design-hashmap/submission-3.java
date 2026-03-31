class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private int SIZE = 1000;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        Node head = buckets[index];

        if(head == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        Node curr = head;
        while(curr != null) {
            if(curr.key == key) {
                curr.value = value;
                return;
            }

            if(curr.next == null) {
                curr.next = new Node(key, value);
            }

            curr = curr.next;
        }
    }
    
    public int get(int key) {
        
        int index = hash(key);
        Node head = buckets[index];

        while(head != null) {
            if(head.key == key) {
                return head.value;
            }

            head = head.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        
        int index = hash(key);
        Node head = buckets[index];

        Node curr = head;
        Node prev = null;
        while(curr != null) {
            if(curr.key == key) {
                if(prev == null) {
                    buckets[index] = null;
                } else {
                     prev.next = curr.next;
                }
            }

            prev = curr;
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */