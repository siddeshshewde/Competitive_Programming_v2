/*
Problem     : Balanced Number (Special Numbers Series #1 )
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5a4e3782880385ba68000018/train/javascript
*/

const balancedNum = number => {
    const stringNum = String(number)
    const numbers = Array.from(
      { length: (stringNum.length - 1) / 2 },
      (_, index) => stringNum[index] - stringNum[stringNum.length - 1 - index]
    )
  
    return numbers.reduce((total, number) => total + number, 0) === 0 ? 'Balanced' : 'Not Balanced'
  }
  
  // Function Export
  module.exports = balancedNum