/*
Title:
	IP Validation

Kata:
	https://www.codewars.com/kata/515decfd9dcfc23bb6000006/train/php

Description:
	Write an algorithm that will identify valid IPv4 addresses in dot-decimal format. IPs should be considered valid if they consist of four octets, with values between 0 and 255, inclusive.

	Input to the function is guaranteed to be a single string.

Example:
	
	Valid inputs:
	1.2.3.4
	123.45.67.89
	
	Invalid inputs:
	1.2.3
	1.2.3.4.5
	123.456.78.90
	123.045.067.089
	
	Note that leading zeros (e.g. 01.02.03.04) are considered invalid.

*/


function isValidIP(string $str): bool
{
    $a = explode('.', $str);
    if (count($a) == 4)
    {
        foreach ($a as $n)
        {
            if ($n < 0 || $n > 255 || !ctype_digit($n))
            {
                return false;
            }
        }
    }
    else
    {
        return false;
    }
    return true;
}




/**
 * Other solution:
 * Source: https://www.codewars.com/kata/515decfd9dcfc23bb6000006/solutions/php
 *
 * Copyright belongs to the original author.
 * If it infringes on your rights and interests, please email me: siddesh.shewde@gmail.com
 */


function isValidIP(string $str): bool
{
    return filter_var($str, FILTER_VALIDATE_IP);
}
