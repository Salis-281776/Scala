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
    val FloatN : Float=3.14f;
    val doubleN : Double=3.12345678978;

    //string data type
    val stringV : String="hello world";
    val charV : Char='A';

    //unit data type
    val unitval:Unit=();


    println(s"Integer : $intN");
    println("integr is "+intN);
    println("Float value "+FloatN);
    println("string value",stringV)
    println("unit-value "+unitval)
    println("long num "+longN)
    println("long num ",longN)

    //mutable datat type

    //boolean - true, false
    var boolV:Boolean=true;
    println("Boolean "+boolV);
    print("Boolean ",boolV);

    var intVar: Int=123;
    intVar=12345;
    var intVar2:Int=intVar+10000;
    println("updated"+intVar2);

  }
}