def numbers = [1, 3, 9, 5, 2 ,4]


def sum
sum = { head, tail ->
	if(!tail){
		head
	}
	else{
		head + sum(tail.head(), tail.tail())
	}
}

println(sum(numbers.head(), numbers.tail()))


println numbers.inject(0) { s, item ->
	s  + item
}

