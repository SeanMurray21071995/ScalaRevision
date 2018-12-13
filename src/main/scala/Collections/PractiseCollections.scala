package Collections

object PractiseCollections extends App {
  val a = List(1,2,3)
  val list : List[String] = List("One","Two","Three")
  val listbuff = scala.collection.mutable.ListBuffer.empty[Int]
  listbuff += (2,3)
  listbuff += 4
  val l = listbuff.toList
  println(a,list, l)
  println("new list ="+l.map(a => a+1))
  println(l++list)
  println(a::l)
  println(a:::l)
  val stream = (1 to 100000000).toStream
  println(stream.head)
  println(stream(45))
  val multidimensions = Array.ofDim[Int](3,3)
  multidimensions(1)(2)=3
  println(multidimensions(1)(2))
  println(l.map(x=>x+2))
  println(l.map(x=>x+2).foldLeft(1)(_/_+1))
  println(l.map(x=>x+2).foldRight(1)(_/_+1))
  println(l.map(x=>x+2).sortWith((a,b) => a>b))
  println(list.sortBy((x)=>(x.charAt(0),x.charAt(1))))
  println(list.sortBy((x)=>(x.charAt(1),x.charAt(0))))
  println(list.sortBy((x)=>(x.charAt(1),x.charAt(2))))
}
