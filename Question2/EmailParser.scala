package com.knoldus.parse

/**
  * Created by akhil on 26/1/17.
  */
class EmailParser {
def parsing()={

  val reg="""([\w\.]+)@([\w\.]+)""".r
  val reg(user,domain)="akhil.vijayan@knoldus.in"
  println("Email : akhil.vijayan@knoldus.in")
  println()
  println(s"User name=$user")
  println(s"User name=$domain")
  println()
  val reg(user1,domain1)="akhilvijayan05@gmail.com"
  println("Email : akhilvijayan05@gmail.com")
  println()
  println(s"User name=$user1")
  println(s"User name=$domain1")
  }
}

