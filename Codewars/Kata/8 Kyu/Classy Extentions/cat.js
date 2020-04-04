/*
Title:
	Classy Extentions

Kata:
	https://www.codewars.com/kata/55a14aa4817efe41c20000bc/train/javascript

Description:
	Classy Extensions, this kata is mainly aimed at the new JS ES6 Update introducing extends keyword. You will be preloaded with the Animal class, so you should only edit the Cat class.

Task:
	Your task is to complete the Cat class which Extends Animal and replace the speak method to return the cats name + meows. 

Example:
	'Mr Whiskers meows.'
	The name attribute is passed with this.name (JS), @name (Ruby) or self.name (Python).

*/

class Cat extends Animal
{
    speak()
    {
        return this.name + " meows.";
    };
}



