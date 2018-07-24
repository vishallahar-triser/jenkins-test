def x = 20

1.upto(5, {
    println (x+ it) })

String greet(String otherPerson) {
       "Hello ${otherPerson}"
    }

println greet("Vishal")
def env = System.getenv()
env.each{
println it
}