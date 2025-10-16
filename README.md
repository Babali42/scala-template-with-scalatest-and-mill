# Scala template with tests

## How to execute mill build

- Mac & Linux : `./mill`
- Windows : `.\mill`

## Compile
- `./mill kata.compile`
- With watch mode `./mill -w kata.compile`

## Test
- `./mill kata.test`
- With watch mode `./mill -w kata.test`

## Run

- Without arguments `./mill kata.run`
- With arguments `./mill kata.run --text=so fast`


## CI

- A basic run and test CI exists on the template : https://github.com/Babali42/scala-template-with-scalatest-and-mill/actions
