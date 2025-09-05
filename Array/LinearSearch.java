package Array;
public class LinearSearch {
    // public static int LinearSearch(int number[], int key){
    //     for (int i = 0; i < number.length; i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String []args){
        
    //     int number[] = {5,4,3,2,1,7,8};
    //     int key = 7;
    //     int index = LinearSearch (number,key);
    //     if (index == -1){
    //         System.out.print("Not found");
    //     }
    //     else{
    //         System.out.println("Key is at index: "+index);
        // }
    // }

    public static int LinearSearch(String fruits[], String key){
        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String key = "papaya";
        String fruits[] = {"apple", "banana", "papaya","mango"};
        int index = LinearSearch(fruits, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key is at index: "+index);
        }
    }
}
