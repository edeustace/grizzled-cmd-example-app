package org.corespring.cmdExample

import grizzled.cmd.{KeepGoing, CommandAction, CommandHandler, CommandInterpreter}


object Main extends App {
  val cmd = new Cmd
  cmd.mainLoop
}

class Cmd extends CommandInterpreter("cmd-example") {

  val aboutHandler = new CommandHandler {
    def runCommand(command: String, unparsedArgs: String): CommandAction = {
      println("runCommand!: " + command + ", " + unparsedArgs)
      KeepGoing
    }
    val CommandName: String = "about"
    val Help: String = "Tells you a little about this example"
  }

  val handlers: List[CommandHandler] = List(aboutHandler)
}