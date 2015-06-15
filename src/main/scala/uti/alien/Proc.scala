package uti.alien

import scala.sys.process._
import scala.util.{Success, Failure, Try}


object Proc extends App {

  /*
   * see http://www.scala-lang.org/files/archive/nightly/docs/library/index.html#scala.sys.process.ProcessBuilder
   */
  // Executes "ls" and sends output to stdout
  //"ls".!

  // Execute "ls" and assign a `Stream[String]` of its output to "contents".
  //val contents = Process("ls").lineStream
  //println(Process("ls").lineStream.mkString("\n"))

  // Here we use a `Seq` to make the parameter whitespace-safe
  //def contentsOf(dir: String): String = Seq("ls", dir).!!


  def run(command:String) : Try[Int] = Try(Process(command).!)

}
