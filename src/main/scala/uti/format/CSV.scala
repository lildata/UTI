package uti.format

object CSV {

  val deli:String = ";"

  /*
   * partial function (T) => String
   */
  type Renderer = PartialFunction[Any, String]

  lazy val simpleRenderer: Renderer = {
    case Some(x: Any) => simpleRenderer(x)
    case s: String => "\"" + s.replaceAllLiterally("\"", "\"\"") + "\""
    case None => "NA"
    case a: Any => a.toString
  }


  def toCSV(header:Option[Seq[Any]]=None, table:Seq[Seq[String]]) : String = {
    //TODO Check sizes
    val r = simpleRenderer
    header.fold("(no header)")(_.map{r(_)}.mkString(deli))+ "\n"+ table.map { line => line.map{r(_)}.mkString(deli)}.mkString("\n")
  }

}
