var person = "wenjie"

person match {
    case "wenjie" => println("原来是个傻B")
    case _ => println("不是文杰那个傻B")
}

person 

val num: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
    }

println(num.isDefinedAt(1))
println(num(2))
println(num(123))