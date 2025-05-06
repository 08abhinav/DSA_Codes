import java.util.*;
class NumFreq{
    public void freqCount(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i: arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        System.out.println("Frequency of each digit is");
        System.out.print(freq);
    } 
}