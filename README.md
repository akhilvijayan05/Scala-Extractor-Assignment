# Scala-Extractor-Assignment

# Scala Assignment 2

## Aim: Implement the following problems descriptions.

### Problems: Complete  Extractor definition  for URL parsing.

object URL{

  def apply(protocal:String,domain:String,path:String, params:Map[String,String]):String = {
     //definition
  }

  def unapply(url:String):Option[(String , String, String,Map[String,String])] = {
            //definition
  }

}

Description :
 val  url = “https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112”

  Extract following fields:
    protocal =” https”
    domain   = “aws.amazon.com”
    path        =”/console/home”
    params = Map(“state” -> “hash”, “isauthcode” -> “true”, “code” -> 112)

### Write regular expression for email parsing.
Description :
       val EMAIL = “ regular expression definition”.r
      val EMAIL(user, domain) = “knol@knoldus.com”
              user = knol
             domain = knoldus.com
Deadline:
  Last date/time to submit the document is 27 January 2017, 5:00 PM. We will be opening a form to collect your assignments.
