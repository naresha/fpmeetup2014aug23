def numbers = [1, 3, 9, 5, 2 ,4]

/*
def sum = 0
for(number in numbers){
	sum += number * number
}

println sum
*/

def square = { number -> number * number }

def sum = {s, number ->
	s + number
}


println numbers.collect(square).inject(sum)