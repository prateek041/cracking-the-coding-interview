package isUnique

import "fmt"

func IsUniqueBrute() {
	word := "Helo"      // declaring the string
	length := len(word) // finding the legth of the word

	if length <= 0 {
		fmt.Println("False")
		return
	}

	for i := 0; i < length; i++ {
		for j := i + 1; j < length; j++ {
			if word[i] == word[j] {
				fmt.Println("False")
				return
			}
		}
	}
	fmt.Println("True")
}
