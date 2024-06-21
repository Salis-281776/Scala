import scala.collection.mutable.ListBuffer

object DataStructure{

def main(args: Array[String]):Unit= {
  //List of string
  //List : Immutable, Homogenous collection of data
  val fruit: List[String] = List("apple", "Banana", "orange","strawberry");
  val fruit2: List[Any] = List("apple", 4, 4, 223, true);
  var list2=List("hello","world",3,4,true)
  //declaring an empty list
  var emptylist:List[Nothing]=List()
  var emptyList2=List()

  //list declaation
  var list3= 10::23::34::45::56::Nil

  //create a list buffer
  var cities = new ListBuffer[String]()
  cities+="Pune"
  cities+="Bhubaneswar"
  cities+=("Bangalore, Hyderabad","Mumbai")
  cities-="Mumbai"
  println(cities)

  //typecasting in Scala is done by toDataType
  cities.toList
  println(cities)

  /*println(fruit)
  println(fruit2)
  println(fruit.head)
  println(fruit.tail(1))
  println(fruit(fruit.length-1))
  println(fruit2.last)
  println(list2)*/

  //Array
  //Array data type : Array is mutable, fized size, homoginous

  val arrayList=Array("apple","orange","guave","strawberry","pie")
  //arrayList.foreach(println);
  //println(arrayList.mkString(","))
  arrayList(1)="banana"
  println(arrayList.mkString(","))


  //tuple
  //tuple declaration
  //fixed sized, hetrogenous collection(no fixed datatupes = can store multiple type data type together)
  //immutable
  var Tuple1 = (10,20,30,40,0,60,70,80,90,1111);
  println(Tuple1._2)



  // declaring a emply array
  var arr1=new Array[String](10)
  var arr2=new Array[Int](5)
  var arr3= Array.ofDim[Int](2,2)
  arr3(0)(0)=1
  arr3(0)(1)=2
  arr3(1)(0)=3
  arr3(1)(1)=4
  //print the array
  val flattenarray : Array[Int] = arr3.flatten
  //println(flattenarray.mkString(","))


  //set collection data type is immutable collection
  //HashSet - mutable collection of set
  val set1 : Set[String] = Set()
  val set2= Set("apple","bsnsns","oranges","pineapple","peach")
  println(set2)

  import scala.collection.mutable.Set
  val mutableSet=Set("apple","bsnsns","oranges","pineapple","peach")

  //Map in scala is collection of key value pairs where
  //each key is unique, IT is similar to dictionary in python

  import scala.collection.immutable.Map
  //empty map declaration
  var Mapvar : Map[String,Int] = Map()
  var Mapvar2 = Map("UST001" -> "Sandeep","UST002" -> "Midul","UST003" ->"Vinesh","UST004" ->"Abhi")
  println(Mapvar2.contains("UST003"))
  //access values using keys
  println(Mapvar2.get("UST002"))
  // print all keys
  println(Mapvar2.keys)
  // print all values
  println(Mapvar2.values)


  //iterators in scala proghramming
  //an iterator in scala represent a sequence of element that allows you to traverse through a
  //collection sequentially
  var mylist=List(20,30,40,50,60,70,80)
  var iter = mylist.iterator
  //methods of iterators to check if ther is more elements (.hasNext())
  //(.hasNext()), .next() - to retrive next value,
  // .remove() - too remove element from the mutable iterators
  println(iter.next())

  //lazy initialization using scala
  lazy val a : Int=100;
  println(a*3)
  // to use lazy we always have to use val not var, it wont work with var.

}
}