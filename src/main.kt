import java.util.*

fun main() {
    val obj=Scanner(System.`in`)
    var left=obj.nextInt()
    var right=obj.nextInt()
    for (i in 1..left){
        for (j in 1.. right){
            println("$i.$j")
        }
    }
}