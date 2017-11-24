package biz.neumann.regex.quantifiers
import biz.neumann.regex.timeRegex

object GreedinesBacktracking {
/*
* Example taken from: Gadsby
* https://de.wikipedia.org/wiki/Gadsby
* https://en.wikisource.org/wiki/Gadsby
*
* a novel wtihout 'e'
* */

	val paragraphWithoutE = """As this is a history of a city I must not stay around any part too long. So, as it was
												almost “a small morning hour,” Nina Adams, a widow, was sitting up; for Virginia, a High School girl, was still out; and, around two-thirty, was brought back in a fast car; two youths actually dumping an unconscious form on Nina’s front porch, and dashing madly away. But Nina Adams saw it; and, calling for aid in carrying Virginia indoors, put in a frantic call for old Doc Wilkins, an old, long-ago school pal, who found Nina frantic from not knowing Virginia’s condition, nor why the pair of youths shot madly away without calling anybody. But it only took Doctor Wilkins an instant to find out what was wrong; and Nina, noting his tight lips and growing scowl was in an agony of doubt.
	                |
	                |“What is it, Tom? Quick!! I’m almost crazy!!”
	                |
	                |Dr. Wilkins, standing by Virginia’s couch, said, slowly:—
	                |
	                |“It’s nothing to worry about, Nina. Virginia will pull through all right, by morning.”"""

	val findEGreedy = ".*e".r
	val findENonGreedy = ".*?e".r
	val negationTrick = "[^e]*e".r

	println("---e at beginning---")
	List(findEGreedy,findENonGreedy, negationTrick).foreach{re =>
		timeRegex(re, "e" + paragraphWithoutE, 5000)
	}

	println("---e at end---")
		List(findEGreedy,findENonGreedy, negationTrick).foreach{re =>
		timeRegex(re,paragraphWithoutE + "e", 5000)
	}

		println("---e in the middle---")
		List(findEGreedy,findENonGreedy, negationTrick).foreach{re =>
		timeRegex(re,
			text = paragraphWithoutE.take(paragraphWithoutE.size/2) + "e" +  paragraphWithoutE.drop(paragraphWithoutE.size/2) + "e",
			5000)
	}


}
