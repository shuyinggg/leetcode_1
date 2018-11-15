
class LRUCache {
    //field
    int capacity;
    int size;
    LinkedHashMap<Integer, Integer> lru;
  
    
    //constructor
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.lru = new LinkedHashMap<Integer,Integer>(capacity);
    }
    
     
    public int get(int key) {
        int res = lru.getOrDefault(key, -1); //returns value or -1 if key doesn't exist
        
        //since we just visit this pair, move to the end of the list
        if (res != -1) {
            lru.remove(key); //remove pair
            lru.put(key,res); //add it to the front
        }
        return res;
    }
    
    public void put(int key, int value) {
        //if this key already exists, delete it (update later)
        if(lru.get(key) != null) {
            lru.remove(key);
            this.size--;
        }
        
        if (this.size < this.capacity) { //within the capacity, add to the end
            lru.put(key,value);
            this.size++;
        } else { //out of the capacity, remove the head (least recently used) entry first
            int toRemove = 0;
            for (Map.Entry<Integer,Integer> entry : lru.entrySet()) {
                toRemove = entry.getKey(); //mark the key
                break;
            }
            lru.remove(toRemove); //remove head
            lru.put(key,value); //add it to the end
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
 
 /** 
 * A very clean solution by liaison
 * Use HashTable + DoubleLinkedList
 * A dummy node to handle the head and end null case
 */
 class DLinkedNode {
  int key;
  int value;
  DLinkedNode pre;
  DLinkedNode post;
}

/**
 * Always add the new node right after head;
 */
private void addNode(DLinkedNode node){
  node.pre = head;
  node.post = head.post;

  head.post.pre = node;
  head.post = node;
}

/**
 * Remove an existing node from the linked list.
 */
private void removeNode(DLinkedNode node){
  DLinkedNode pre = node.pre;
  DLinkedNode post = node.post;

  pre.post = post;
  post.pre = pre;
}

/**
 * Move certain node in between to the head.
 */
private void moveToHead(DLinkedNode node){
  this.removeNode(node);
  this.addNode(node);
}

// pop the current tail. 
private DLinkedNode popTail(){
  DLinkedNode res = tail.pre;
  this.removeNode(res);
  return res;
}

private Hashtable<Integer, DLinkedNode> 
  cache = new Hashtable<Integer, DLinkedNode>();
private int count;
private int capacity;
private DLinkedNode head, tail;

public LRUCache(int capacity) {
  this.count = 0;
  this.capacity = capacity;

  head = new DLinkedNode();
  head.pre = null;

  tail = new DLinkedNode();
  tail.post = null;

  head.post = tail;
  tail.pre = head;
}

public int get(int key) {

  DLinkedNode node = cache.get(key);
  if(node == null){
    return -1; // should raise exception here.
  }

  // move the accessed node to the head;
  this.moveToHead(node);

  return node.value;
}


public void set(int key, int value) {
  DLinkedNode node = cache.get(key);

  if(node == null){

    DLinkedNode newNode = new DLinkedNode();
    newNode.key = key;
    newNode.value = value;

    this.cache.put(key, newNode);
    this.addNode(newNode);

    ++count;

    if(count > capacity){
      // pop the tail
      DLinkedNode tail = this.popTail();
      this.cache.remove(tail.key);
      --count;
    }
  }else{
    // update the value.
    node.value = value;
    this.moveToHead(node);
  }

}
 */
