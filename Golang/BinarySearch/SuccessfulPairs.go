/*2300. Successful Pairs of Spells and Potions
You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] 
represents the strength of the ith spell and potions[j] represents the strength of the jth potion.

You are also given an integer success. A spell and potion pair is considered successful if the product of their 
strengths is at least success.

Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair 
with the ith spell.*/
package main
import (
    "fmt"
    "sort"
)

func successfulPairs(potions, spells []int, success int64) []int{
    sort.Ints(potions)
    m := len(potions)
    res := make([]int, len(spells))

    for i := 0; i < len(spells); i++{
        strength := (int64)(spells[i])
        idx := binarySearch(potions, strength, success)
        
        if idx != -1{
            res[i] = m - idx
        }
    }
    return res
}

func binarySearch(potions []int, strength, success int64) int{
    idx, low, high := -1, 0, len(potions) - 1
    
    for low <= high{
        mid := low + (high - low) / 2
        
        if(potions[mid] * int(strength) >= int(success)){
            idx = mid
            high = mid - 1
        }else{
            low = mid + 1
        }
    }
    return idx
}

func main(){
    potions := []int{2, 4, 5, 1, 3}
    spells := []int{5, 1, 3}
    success := 7
    fmt.Print(successfulPairs(potions, spells, int64(success)))
}