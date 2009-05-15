import scala.collection.mutable._

class Point(val x: Int, val y: Int) {
  override def equals(other: Any): Boolean = {
    other match {
      case that: Point =>
        (that canEqual this) &&
        that.x == x &&
        that.y == y
      case _ => false
    }
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Point]

  override def hashCode(): Int = 41 * ( 41 + x ) + y
}

class UnitDiskGraphNode(location:Point) {
  val neightbours: Set[UnitDiskGraphNode] = new HashSet[UnitDiskGraphNode]
}

class UnitDiskGraph(radius: Double) {
  val nodes: Set[UnitDiskGraphNode] = new HashSet[UnitDiskGraphNode]
}

object foo {
  def BuildUDG(radius: Double, points: Set[Point]): UnitDiskGraph = {
    val graph = new UnitDiskGraph(radius)
      points.foreach((x) => graph.nodes += (new UnitDiskGraphNode(x)))
    graph
    //TODO find neighbours
  }
}
