
def multiply = {times, number ->
	times * number
}

def doubler = multiply.curry(2)

println doubler(10)