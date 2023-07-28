# Training Executable Jar
This repository shall demonstrate, how to build an executable jar. This kind of software is also known as command line interface (CLI) programs. 

## Your task

Modify main function such that: 
 * if no parameter is provided, fancyFunction is executed
 * if a parameter is provided, value 1 will execute fancyFunctionOne, value 2 will execute fancyFunctionTwo
 * if first paramter is present a second parameter shall be present and handed over to the function selected by the first one
 * if first parameter is "h" or no parameter is provided, help function shall be called.

## How to build & run

    mvn package
    java -jar target/App.jar

## Command Line Parameters
In Java it is easy to provide parameters to command line programs. In this example parameters are directly accessed and printed out. However that means developer needs to do everything from scratch, things like optional params (aka switches), checking type of a param, interdependcy of parametes, etc. So it is advisable to use a library for this task. Reading section below contains an example of an awesome open source library.

## More stuff to read
Another introduction on how to use CLI params:
https://www.baeldung.com/java-command-line-arguments

And this is one example for a library that helps you, building complex parameters.
https://picocli.info/ 