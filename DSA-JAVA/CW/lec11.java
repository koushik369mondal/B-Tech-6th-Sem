package CW;

public class lec11 {
    public static void arrayMax(){
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
    public static void arrayMin() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        
        arrayMax();
        arrayMin();
    }
}
