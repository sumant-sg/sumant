public class ConceptPractise {
    int x = 20;
    public void getData(ConceptPractise c){
//        c.hashCode()++;
        System.out.println(c);

    }
    public static void main(String[] args) {
        ConceptPractise obj = new ConceptPractise();
        obj.getData(obj);
        System.out.println(obj.hashCode());
        ConceptPractise obj1 = new ConceptPractise();
        //obj1.getData(obj1.hashCode());
        System.out.println(obj1.hashCode());
    }
}
