# grizzled-cmd-example

A little example app of using the wonderful grizzled.cmd library.

https://github.com/bmc/grizzled-scala


## Build and Run

    sbt compile one-jar
    cd target/scala-2.9.2
    java -jar cmd-example-XX-one-jar

You'll then be presented with a command line prompt into which you can hook in handlers.
There's only one handler here at the moment 'about'.

For a more complete example of using grizzled.cmd have a look at:

https://github.com/bmc/sqlshell
