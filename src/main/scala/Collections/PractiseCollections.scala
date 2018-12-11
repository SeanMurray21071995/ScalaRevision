package Collections

object PractiseCollections extends App {
  val a = (1,2,3)
  val list : List[String] = List("One","Two","Three")
  val listbuff = scala.collection.mutable.ListBuffer.empty[Int]
  listbuff += (2,3)
  listbuff += 4
  val l = listbuff.toList
  println(a,list, l)
  println("new list ="+l.map(a => a+1))
  println(l++list)
  val stream = (1 to 100000000).toStream
  println(stream.head)
}
