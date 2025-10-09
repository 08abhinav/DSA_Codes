package main
import (
    "fmt"
    "sort"
)

func successfulPairs(potions, spells []int, success int64) []int{
    sort.Ints(potions)
    m := len(potions)
    res := make([]int, m)

    for i := 0; i < len(spells); i++{
        idx := binarySearch(potions, spells[i], success)
        
        if idx != -1{
            res[i] = m - idx
        }
    }
    return res
}