trait Censor{
    var badWords = Map(
        "shoot" -> "pucky",
        "darn" -> "beans",
        "swear" -> "hope"
    )
    def clean(input :String):String = {
		var output = input
		for((key, value) <- badWords) {
			output = output.replaceAll(key, value)
		}
		return output
	}

}

class Haha extends Censor

var haha = new Haha

val thoughtCrime = "I swear I am going to shoot the darn telescreen one day!"

val cleanThoughts = haha.clean(thoughtCrime)

println("\nTime to get vaporized!")
println(thoughtCrime)

println("\nJust kidding...")
println(cleanThoughts)
