import java.util.*;

public class HashMapCode {
    static class HashMap<K,V> { //generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; //n - nodes
        private int N; //N - buckets
        private LinkedList<Node> buckets[]; //N = buckets.length
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++) {
                if(ll.get(i).key == key) {
                    return i; //di
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i=0; i<N*2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1
            if(di == -1) { //key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { //key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;

            if(lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1
            if(di == -1) { //key doesn't exist
                return false;
            } else { //key exists
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1
            if(di == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1
            if(di == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++) { //bi
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++) { //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty() {
            return n == 0;
        }
    }
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++) {
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}


class HAshmapReImplement{
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
//Given an array and multiple queries, find the freuqency of elements
class elementfreq{
    public static void main(String[] args) {
        int[] abc = {1,2,3,4,5,1,2,3,6,7,8,6,7};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < abc.length; i++){
            if(map.containsKey(abc[i])) map.put(abc[i],map.get(abc[i]) + 1);
            else map.put(abc[i] , 1);
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for(Map.Entry<Integer,Integer> e: set){
            System.out.println(e);
        }
        int ele = 3;
        if(map.containsKey(ele)) System.out.println("freq. of element: " + map.get(ele));
        else System.out.println("ele not present");

    }
}
//1st non repeating element
class NonRepeatingEle{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i]) + 1);
            else map.put(arr[i], 1);

        }
        for(int i =0; i< arr.length; i++){
            if(map.get(arr[i]) == 1){
                System.out.println("1st non repeating ele. is: " + arr[i]);
                break;
            }

        }
    }
}
//check if a sub array with sum =0 exists????????
class SubarraySumZero{
    public static void main(String[] args) {
        int[] arr = {1,-3,1,2,-4,6,2,-4,1,-5,7};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
        //using HashMap
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < prefix.length;i++){
            if(map.containsKey(prefix[i])) map.put(prefix[i], map.get(prefix[i]) + 1);
            else map.put(prefix[i],1);
        }
//        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
//        for(Map.Entry<Integer,Integer> e : set){ ////////just to printtttttt
//            System.out.println(e);
//        }
        boolean val = false;
        for(int i = 0; i < prefix.length;i++){
            if(prefix[i] == 0) val = true;
            else{
                if(map.get(prefix[i]) > 1) val = true;
            }

        }
        if(val == true) System.out.println("SubArray exists");
        else System.out.println("SubArray Not Exists");

        //USING HASHSETTTTTTTTTTT
        Set<Integer> set = new HashSet();
        for(int i =0; i < prefix.length; i++){
            if(prefix[i] == 0) System.out.println("Sub array exists");
            else if(set.contains(prefix[i])) System.out.println("sub array exist");
            else set.add(prefix[i]);
        }
    }
}
class checkSumEqualsToK{
    public static void main(String[] args) {
        int[] arr = {1,-3,1,2,-4,6,2,-4,1,-5,7};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];

        }
        int  k = 7;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < prefix.length;i++){
            //if(prefix[i] - prefix[i-1] == k) System.out.println("sub array exists with sum = k");
            set.add(prefix[i]);
            if(set.contains(prefix[i]-k)) System.out.println("sub array exists with sum = k");
        }

    }
}
class HashMapPrac{
    static class hash<K,V>{
        private class Node{
            K key;
            V val;
            public Node(K key, V val){
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
            for(int i = 0; i < bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }
        }
        public int searchLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];
            for(int i =0; i < ll.size(); i++){
                if(ll.get(i).key == key) return i;

            }
            return -1;
        }
        public void rehash()
        {
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N*2];
            for(int i =0; i < bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }
            for(int i =0; i < oldBucket.length;i++){
                LinkedList<Node> ll = bucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.val);
                }
            }

        }
        public void put(K key, V val){
            int bi = Math.abs(key.hashCode()) % N;
            int di = searchLL(key, bi);
            if(di == -1){
                bucket[bi].add(new Node(key,val));
                n++;
            }
            else bucket[bi].get(di).val = val;
            int lambda = n / N;
            if(lambda > 2) rehash();
        }
    }
}







