package JavaPractice;

public class Array2 {
    
    public static void main(String[] args) {

        String[] store = new String[4];

        store[0] = "Nike";
        store[1] = "Addidas";
        store[2] = "World Balance";
        
        for(int i = 1; i<store.length; i++){
            System.out.println(store[i]);
        }
    }
}
