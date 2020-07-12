""" 
https://www.codewars.com/kata/5a3dd29055519e23ec000074/train/python

The first input array contains the correct answers to an exam, like ["a", "a", "b", "d"]. The second one is "answers" array and contains student's answers.

The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer(empty string).

If the score < 0, return 0.

For example:

checkExam(["a", "a", "b", "b"], ["a", "c", "b", "d"]) → 6
checkExam(["a", "a", "c", "b"], ["a", "a", "b",  ""]) → 7
checkExam(["a", "a", "b", "c"], ["a", "a", "b", "c"]) → 16
checkExam(["b", "c", "b", "a"], ["",  "a", "a", "c"]) → 0
"""

def check_exam(arr1,arr2):
    marks = 0
    for n in range(0, len(arr1)):
        if arr2[n] == '':
            continue
        if arr1[n] == (arr2[n]):
            marks += 4
        else:
            marks -= 1
    if marks < 0:
        return 0
    return marks
