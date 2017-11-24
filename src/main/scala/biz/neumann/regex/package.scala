package biz.neumann

import scala.util.matching.Regex

package object regex {
		// http://biercoff.com/easily-measuring-code-execution-time-in-scala/
	def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0).toDouble/1000000 + "ms")
    result
	}


	def timeRegex(re: Regex, text: String, times: Int) = {
		println(s"For re $re")
		time { (0 to times).toList.foreach{ _ => re.findFirstIn(text) }}
	}

}
