import scala.util.matching.Regex

def onStringAndEmpty(regex: Regex) =
	s"\nFor $regex" ::
	regex.findFirstIn("abcdefghijklmnopqrstuvwxyz") ::
	regex.findFirstIn("") :: Nil


// .? optional
onStringAndEmpty(".?".r)

// .+ one or many
onStringAndEmpty(".+".r)

// .* none or many
onStringAndEmpty(".*".r)

// .{3,5} two to five
onStringAndEmpty(".{3,5}".r)

// .{2,} two to infinity
onStringAndEmpty(".{2,}".r)

// .{3} three times
onStringAndEmpty(".{3}".r)