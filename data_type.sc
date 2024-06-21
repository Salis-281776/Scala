object DataType{
  //main is entry point to any scala application
  //unit define the return type of 'main' indication that it returns nothing.
  def main(args:Array[String]):Unit={
    //integer data type
    val intN:Int=20;
    val longN:Long=1234567890L;
    val shortN:Short=32765;
    val byteN:Byte=127;

    //Floating Datatype
    val FloatingN : Float=3.14f;
    val doubleN : Double=3.12345678978;

    //string data type
    val stringV : String="hello world";
    val charV : Char='A';

    //unit data type
    val unitval:Unit=();


    println(s"Integer : $intN");

  }
}