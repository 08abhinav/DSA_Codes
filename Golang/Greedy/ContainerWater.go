func maxArea(height []int)int{
	l, res, r := 0, 0, len(height)

	for l < r{
		area := min(height[l], height[r]) * (r - l)
		res : max(area, res)

		if height[l] > height[r]{
			r -= 1
		}else{
			l += 1
		}
	}
}

func min(a, b int)int{
	if a < b{
		return a
	}else{
		return b
	}
}

func max(a, b int)int{
	if a > b{
		return a
	}else{
		return b
	}
}
