public class strCompareto {
    public static void main(String ars[]){
        String fruits [] = {"apple", "banana", "cherry", "date"};

        String largest = fruits[0];
        for(int i =0 ; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("Largest string: " + largest);
    }
}
