# :question::question::question: Game "Guess a Number" :question::question::question:

---
> Description : This is simple one player console game, written on Java language.
---
## :point_right: Introduction
In this version of the game "Guess a Number" you play versus the computer (your opponent).
The main goal of the game is to guess a number from 1 to 100 that the computer has chosen randomly beforehand.

---

## :point_right: Rules
The rules in this game are simple: Player choose a number from 1 to 100. 
Then receive answer whether the number is less than, greater than, or equal to the number chosen by the computer.

![GuessNumber.jpg](JPEG/GuessNumber.jpg)

Image Credits : Google

---

## :point_right: Gameplay
When the game start you will be able to choose a number from 1 to 100.
* Choose a number and press enter

![png_01.png](JPEG/png_01.png)

On the next line you will see if you guessed the number and a guideline for choosing the next number.
Then you will choose another number.

If you input something different from number from 1 to 100, you will get a reply for wrong input.

![png_02.png](JPEG/png_02.png)

When you guess the number you will get reply on the console. Then you will have option to play again.

![png_03.png](JPEG/png_03.png)

If you input something different from "Y" or "N" you will get reply for wrong input.

![png_04.png](JPEG/png_04.png)
---

## :point_right: Algorithm


1. The computer will choose a random number from 1 to 100.
2. User choice will be taken and stored.
3. The user input will be compared with computer choice.
   * If player number is less than computer number on the console will appear reply "Too low".
   * If player number is greater than computer number on the console will appear reply "Too high".
   * If player number is equal to computer number on the console will appear reply "You guessed it!".
4. Player choice for new game will be taken.

---

## :point_right: Live Demo

[Link to live demo](https://replit.com/@Stavr1/GuessANumber?v=1)