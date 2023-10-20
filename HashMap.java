import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap{
    static class hash<K,V>{
        private class Node {
            K key;
            V val;

            public Node(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }
        private int n;
        private int N;
        LinkedList<Node> bucket[];
        public hash(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                bucket[i] = new LinkedList<>();
            }
        }
        public int hashcode(K key){
            return Math.abs(key.hashCode()) % N;
        }
        public int searchLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];
            for(int i =0; i < ll.size(); i++){
                if(ll.get(i).key == key) return i;
                //else return -1;//Syntatic wrong????????????
            }
            return -1;
        }
        public void rehash(){
            LinkedList<Node> oldbucket[];
            oldbucket = bucket;
            bucket = new LinkedList[N*2];
            for(int i =0; i < bucket.length;i++){
                bucket[i] = new LinkedList<>();
            }
            for(int i = 0; i < oldbucket.length;i++){
                LinkedList<Node> ll = bucket[i];
                for(int j = 0; j < ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.val);
                }
            }
        }
        public void put(K key, V val){
            int bi = hashcode(key);
            int di = searchLL(key, bi);
            if(di == -1){
                bucket[bi].add(new Node(key, val));
            }else{
                Node node = bucket[bi].get(di);
                node.val = val;
                //bucket[bi].get(di).val = val;
            }
            int lambda = n/N;
            if(lambda > 2) rehash();

        }
        public V get(K key){
            int bi = hashcode(key);
            int di = searchLL(key,bi);
            if(di == -1) return null;
            else return bucket[bi].get(di).val;
        }
        public boolean containsKey(K key){
            int bi = hashcode(key);
            int di = searchLL(key,bi);
            if(di == -1) return false;
            else return true;
        }
        public V remove(K key){
            int bi = hashcode(key);
            int di = searchLL(key,bi);
            if(di == -1) return null;
            else{
                Node node = bucket[bi].remove(di);
                n--;
                return node.val;
            }
        }
        public boolean isEmpty(){
            return n == 0;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        hash<String, Integer> obj1 = new hash<>();
        obj1.put("India", 123);
        obj1.put("china", 190);
        obj1.put("usa", 112);
        ArrayList<String> al = obj1.keySet();
        for(int i = 0; i < al.size(); i++){
            System.out.println("country: " + al.get(i) + " -->  population: " + obj1.get(al.get(i)));
        }
    }
}
