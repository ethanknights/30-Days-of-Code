object Solution {
    def main(args: Array[String]) = {

        // Take all input
        val inputs: List[String] = io.Source.stdin.getLines.toList
        val nEntries: Int = inputs.head.toInt
        
        def splitToMap(str: String): (String, String) = {
            // Return Name + Number splits
            val splits = str.split(" ")
            (splits(0) -> splits(1))
        }
        
        val phonebook = inputs.tail.slice(0, nEntries).foldLeft[Map[String,String]](Map.empty)((listAcc: Map[String,String], e: String) => listAcc + splitToMap(e))

        
        def find(entry: String): String = phonebook.get(entry) match {
            // Find & return any query names that match an entry 
            case Some(i) => entry + "=" + i
            case None => "Not found"
        }

        val queries = inputs.tail.drop(nEntries)
        val outputs = queries.map(find(_))
        println(outputs.mkString("\n"))
    }
}
