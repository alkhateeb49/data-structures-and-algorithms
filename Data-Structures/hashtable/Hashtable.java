package hashtable;

public class Hashtable {
    private HashNode[] table;
    private int entryCount;

    public Hashtable() {}

    public Hashtable(int size) {
        this.table = new HashNode[size];
        this.entryCount = 0;
    }

    public int hash(int key) {
        int hashValue = key;
        hashValue = (hashValue * 485) % table.length;
        return hashValue;
    }

    public void add(int key, String value) {
        int target = hash(key);
        HashNode entry = table[target];

        while (entry != null) {
            if (entry.key==key) {
                break;
            }
            entry = entry.next;
        }
        if (entry != null) {
            entry.value = value;
        }
        else {
            HashNode newNode = new HashNode();
            newNode.key = key;
            newNode.value = value;
            newNode.next = table[target];
            table[target] = newNode;
            entryCount++;
        }
    }

    public String get(int key) {
        int target = hash(key);
        HashNode entry = table[target];

        while (entry != null) {
            if (entry.key==key) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    public boolean contains(int key) {
        int target = hash(key);
        HashNode entry = table[target];

        while (entry != null) {
            if (entry.key==key) {
                return true;
            }
            entry = entry.next;
        }

        return false;
    }


    public String toString() {
        String message="";

        if (table == null) {
            return message;
        }
        for (int i = 0; i < table.length; i++) {
            HashNode entry = table[i];
            while (entry != null) {
                message +=("HashKey : "+ i +", Value : " + entry.value + "\n");
                entry = entry.next;
            }
        }
        return message;
    }



}
