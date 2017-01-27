package com.knoldus.extract

/**
  * Created by akhil on 26/1/17.
  */
class Main {

}
object Main{
  def main(args: Array[String]): Unit = {
    val  url ="https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"
    //val url="akhil@gmail.com"
    url match {
      case UrlExtractor(protocol, domain, path, param) => println("Protocol ="+protocol + " Domain = " + domain+ " path = "+path + " param = "+param)
      case _ => println("not an valid url")
    }
  }
}
