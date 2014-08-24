
def numbers = [1, 3, 9, 5, 2 ,4]


def print = {println it}

def printIfOdd = {number ->
	if(number % 2 !=0 ) println number
}
//print(10)


numbers.each(printIfOdd)



def getOperation(String op){
	
	def add = { a, b ->
		a + b
	}

	def subtract = { a, b ->
		a - b
	}
	
	switch(op){
		case '+':
			return add
			
		case '-':
			return subtract
	}
}

def operation = getOperation('-')

println operation(1, 2)


