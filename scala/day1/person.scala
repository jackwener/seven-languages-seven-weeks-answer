val stringList = List("a","b","cd")

var totalStringSize2 = (0 /: stringList) {(total, string) => total + string.length }
var totalStringSize = stringList.foldLeft(0)((total, string) => total + string.length)

println(totalStringSize)
println(totalStringSize2)