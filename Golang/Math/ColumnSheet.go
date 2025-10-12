func excelSheetNum(s string)int{
	res := 0
	for i := 0; i < len(s) - 1; i++{
		res = res * 26 + (s[i] - 'A' + 1)
	}
	return res
}