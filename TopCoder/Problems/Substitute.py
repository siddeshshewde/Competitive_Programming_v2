# Problem      : Substitute
# Used In      : SRM 160
# Date         : 08.23.2003	
# Category     : String Manipulation	
# Division     : 2
# Level        : 1
# Round        : 1  
# Points       : 250
# Difficulty   : Easy
# Problem Type : Single
# Description  : https://www.topcoder.com/stat?c=problem_statement&pm=1333

# Class Name   : Substitute  
# Method Name  : getValue
# Return Type  : Int  
# Arg Types    : string, string 


class Substitute:
    def getValue(self, key, code):
        key = list(key)
        code = list(code)
        decode = 0
        
        for i in code:
            if i in key:
                index = key.index(i) + 1
                if index == 10:
                	index = 0
                decode = decode * 10 + index
        return decode       

# Points Received - 144.08