
import java.util.ArrayList;

class Map <K, V> {

  // to store array of chains
  private ArrayList<Node<K, V>>  bucket;

  // Current capacity of arrayList
  private int numBucket;

  // Current size of arrayList
  private int size;

  public Map() {
    this.bucket = new ArrayList<>();
    this.numBucket = 10;
    this.size = 0;

    for (int i = 0; i < numBucket; i++) bucket.add(null);
  }

  public int size() { return this.size; }
  public boolean isEmpty() { return size() == 0; } 

  // Implement hash function to find index for a key
  private int getBucketIndex(K key) {
    int hash = key.hashCode();
    int index = hash & numBucket;

    return index;
  } 

  public V remove(K key) {
    // get the index of the key
    int index = getBucketIndex(key);

    // gets the head node
    Node<K, V> head = bucket.get(index);
    Node<K, V> prev = null;

    while (head != null) {
      if (head.key.equals(key)) break;

      prev = head;
      head = head.next;
    }
    
    // if Key is empty
    if (head == null) return null;

    this.size--;

    if (prev != null) prev.next = head.next;
    else bucket.set(index, head.next);

    return head.value;
  }

  public V get(K key) {
    
    // Finds head of chain based on key
    int index = getBucketIndex(key);
    Node <K, V> head = bucket.get(index);

    while (head != null) {
      if (head.key.equals(key)) return head.value;
      head = head.next;
    }

    return null;
  }

  public void add(K key, V value) {
    // finds head
    
    int index = getBucketIndex(key);
    Node <K, V> head = bucket.get(index);

    // Check if key already present
    
    while (head != null) {
      if (head.key.equals(key)) {
        head.value = value;
        return;
      }

      head = head.next;
    }

    // insert key in chain

    size++;
    head = bucket.get(index);
    Node <K, V> newNode = new Node<K, V>(key, value);

    newNode.next = head;
    bucket.set(index, newNode);

    // if load factor goes beyond threshold, then
    // double hash table size
    if ((1.0 * this.size) / numBucket >= 0.7) {
      ArrayList<Node<K, V>> temp = bucket;
      bucket = new ArrayList<>();
      size = 0;
      for (int i = 0; i < numBucket; i++) {
        bucket.add(null);
      }

      for (Node<K, V> headNode: temp) {
        while(headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }
}





