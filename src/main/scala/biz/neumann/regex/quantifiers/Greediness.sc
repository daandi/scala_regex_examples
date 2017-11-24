val expression = """if (x != 42) && (isMonday() ||  andiHasABadDay())) then Doh!"""

val greedyRe = "(\\(.*\\))".r
val nonGreedy = "(\\(.*?\\))".r


greedyRe.findAllIn(expression).toList.foreach(println)
nonGreedy.findAllIn(expression).toList.foreach(println)
