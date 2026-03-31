class MyHashSet {

    private int bucket_size = 769;
    private LinkedList<Integer>[] table; 

    public MyHashSet() {
        table = new LinkedList[bucket_size];
        for (int i = 0; i < bucket_size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % bucket_size;
    }
    
    public void add(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];

        if(!bucket.contains(key)) {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];

        bucket.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];

        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */