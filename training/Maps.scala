//import scala.math
//
//object Maps {
//
//
//class MapPoint(val _name: String = "noName", val _latitude: Double = 0,val  _longitude: Double =0) {
//
//  override def toString: String = this._name + " " + this._latitude.toString + NS + " " + this._longitude.toString + EW + "\n"
//
//  def NS: String = if (this._latitude > 0) "N" else "S"
//
//  def EW : String = if (this._longitude > 0) "E" else "W"
//
//  def -( b: MapPoint): Double = math.sqrt(math.pow(_latitude - b._latitude,2) + math.pow(_longitude - b._longitude,2))
//
//  def distanceTo(b: MapPoint): Double = math.sqrt(math.pow(_latitude - b._latitude,2) + math.pow(_longitude - b._longitude,2))
//
//  def move ( x: Double, y: Double)= MapPoint("Nearby" + _name, _latitude + x, _longitude + y)
//}
//  object MapPoint{
//
//def apply(name: String, latitude: Double, longitude: Double)= new MapPoint(name, latitude, longitude)
//
//
// }
//
//  class Route(nodes: List[MapPoint]){
//
//    def printRoute(node: List[MapPoint] = nodes, result: String =""):String ={
//      if(node.isEmpty)
//        result.toString
//      else
//        printRoute(node.tail,"-> " + result + node.head.toString)
//    }
//    override def toString: String = printRoute()
//
//
//
//  }
//
//
//
//  object Route{
//
//    def apply(name: String, latitude: Double, longitude: Double)= new MapPoint(name, latitude, longitude)
//
//
//  }
//
//
//
////  def println(city: MapPoint):Unit =
////    print(city._name + " " + city._latitude.toString + "N " + city._longitude.toString + "W \n\n" )
//
//
//  def main(args: Array[String]): Unit = {
//
//      val krk =MapPoint("Krakow", 50.061389, 19.938333)
//      println( krk)
//      val nyc = MapPoint("NYC", 40.7127, -74.0059)
//      println( nyc)
//      val porto = MapPoint("Porto", 41.162142, -8.621953)
//      println(porto)
//      val irkutsk = MapPoint("Irkutsk", 52.283333, 104.283333)
//      println(irkutsk)
//      println(porto-irkutsk)
//      println(krk-irkutsk)
//      println(krk.distanceTo(porto))
//      val r = Route(krk, nyc, porto)
//      println( r )
//    }
//
//
//}
