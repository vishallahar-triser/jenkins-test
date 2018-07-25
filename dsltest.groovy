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
    String greet(String otherPerson) {
       "Hello ${otherPerson}"
    }
    String setName(String name){
    	this.name = name
    }
    String getName(){
    	name
    }
}
def p = new Person()
p.setName "Jim"
println p.greet("Vishal") + ". My name is " + p.getName()



def env = System.getenv()
env.each{
println it
}