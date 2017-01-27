package com.knoldus.extract

/**
  * Created by akhil on 26/1/17.
  */
object UrlExtractor {

  def apply(protocol:String,domain:String,path:String, params:Map[String,String]):String = protocol + "@" + domain

  def unapply(str: String): Option[(String , String, String,Map[String,String])] = {

    val part1 = str split "://"
    val part2 = part1(1).split("/",2)
    val part3 = part2(1).split('?')
    val part4 = part3(1).split("=|&",6)

    println("https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112")

    val map=Map(part4(0)->part4(1),part4(2)->part4(3),part4(4)->part4(5))
    val list=List[Int]()
    if (part1.length == 2 && part2.length == 2 && part3.length == 2 && part4.length == 6) Some(part1(0), part2(0),part3(0),map) else None
  }
}