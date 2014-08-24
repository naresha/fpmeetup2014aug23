import groovy.transform.*

def block = {name -> println "Hello " + name }

def sayHello =  { -> println "Hello"}

block('Raj')
sayHello()


class Sample{
	
	def print(){
		println 100
	}
}

def s = new Sample()
def printIt = s.&print

printIt()

@Immutable
class Person{
	String name
}

def p = new Person(name: 'Raj')
println p.dump()

p.name = 'aaaa'
println p.dump()
