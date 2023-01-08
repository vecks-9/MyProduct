public class Sample {
 
    public static void main(String[] args) {
        char c1 = 'c';
        int num = Character.getNumericValue(c1);
        System.out.println("num : " + num);
        
        char c2 = (char)num;
        System.out.println("c2 : " + c1);
    }
 
}