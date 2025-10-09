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