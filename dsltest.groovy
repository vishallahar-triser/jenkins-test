def x = 20

1.upto(5, {
    println (x+ it) })

class Person {
    /** the name of the person */
    String name

    /**
     * Creates a greeting method for a certain person.
     *
     * @param otherPerson the person to greet
     * @return a greeting message
     */
    def greet(String otherPerson) {
       "Hello ${otherPerson}. My name is " + getName() + "."
    }
    def setName(String name){
    	this.name = name
    }
    def getName(){
    	name
    }
}
def p = new Person()
p.setName "Jim"
Person p1 = new Person()
p1.setName "Bob"
println p.greet("Vishal")
println p1.greet("Jim")


def env = System.getenv()
env.each{
println it
}