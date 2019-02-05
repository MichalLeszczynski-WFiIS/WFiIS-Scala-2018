import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util._

object Future2 {

  def psearch(list: Vector[Char], c: Char): Future[scala.Option[Char]] = {
    val split = list.grouped(list.length / 10).toList

    Future.sequence(split.map(x => Future[Int]{x.count(char => char == c)})) map {result => {if(result.sum > 0 ) Some(c) else None}
    }
  }

  def main(args: Array[String]): Unit = {
    val x = Random.alphanumeric
    val rstr = (x take 1000000).toVector

    val found = psearch( rstr, 'y')

    found onComplete   {
      case Success(f) => println("found " + f )
    }

    import scala.io._
    StdIn.readByte()
  }
}

