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
       "Hello ${otherPerson}"
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
println p.getName()
println p.greet("Vishal")



def env = System.getenv()
env.each{
println it
}