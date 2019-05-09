# Testing with Spock

This repository contains my code for testing with the wonderful
[Spock Framework](http://spockframework.org/).

I used Kotlin instead of Java as the language for the production code.
This means that the tests are written in a relatively unsafe language 
(Groovy) and the implementation in one of the most type safe
languages on the JVM :wink:.

## The good

* Spock forces you to use given, when, then making the tests very
  descriptive
* Spock makes mocking much less tedious
* Spock supports even Spring Boot

## The bad

* mixing two languages (such as Groovy and Kotlin) might be confusing.
* some intentions in IntelliJ (such as create Class) don't work
  currently in a polyglot environment.
* for now, Spock does not support JUnit5 natively (they are working on that
  & you can still use the vintage engine).

## Project

The Project consists of two cases:

* Greeter. A glorified "Hello, World" where I demonstrated some 
  features of Spock.
* Raindrops. Our (successful) attempt to implement the 
  [Raindrops Kata](https://github.com/Brunty/php-code-katas/tree/master/raindrops)
  using Spock and Kotlin in a mob.

