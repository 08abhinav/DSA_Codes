package main
import "fmt"
func areIsomophic(s1, s2 string)bool{
	if len(s1) != len(s2){
		return false;
	}
	map1 := make([]int, 256)
	map2 := make([]int, 256)

	for i := 0; i < 256; i++{
		map1[i] = -1
		map2[i] = -1
	}

	for i := 0; i < len(s1); i++{
		c1 := s1[i]
		c2 := s2[i]

		if map1[c1] == -1 && map2[c2] == -1{
			map1[c1] = int(c2)
			map2[c2] = int(c1)
		}else if map1[c1] != int(c2) && map2[c2] != int(c1){
			return false
		}
	}
	return true;
}

func main(){
	s1 := "aab"
	s2 := "xxy"
	fmt.Println(areIsomophic(s1, s2))
}