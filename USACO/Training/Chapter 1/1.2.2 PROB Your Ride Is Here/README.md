<h1 align="center">Your Ride Is Here</h1>

Title:
	Your Ride Is Here

Link:
	https://train.usaco.org/usacoprob2?a=Di95zySl5wx&S=ride

Description:
	It is a well-known fact that behind every good comet is a UFO. These UFOs often come to collect loyal supporters from here on Earth. Unfortunately, they only have room to pick up one group of followers on each trip. They do, however, let the groups know ahead of time which will be picked up for each comet by a clever scheme: 
	they pick a name for the comet which, along with the name of the group, can be used to determine if it is a particular group's turn to go (who do you think names the comets?). The details of the matching scheme are given below; 
	your job is to write a program which takes the names of a group and a comet and then determines whether the group should go with the UFO behind that comet.

	Both the name of the group and the name of the comet are converted into a number in the following manner: 
	the final number is just the product of all the letters in the name, where "A" is 1 and "Z" is 26. For instance, 
	the group "USACO" would be 21 * 19 * 1 * 3 * 15 = 17955. If the group's number mod 47 is the same as the comet's 
	number mod 47, then you need to tell the group to get ready! (Remember that "a mod b" is the remainder left over 
	after dividing a by b; 34 mod 10 is 4.)

	Write a program which reads in the name of the comet and the name of the group and figures out whether according to 
	the above scheme the names are a match, printing "GO" if they match and "STAY" if not. The names of the groups and 
	the comets will be a string of capital letters with no spaces or punctuation, up to 6 characters long.

Example:	
	Input	Output
	COMETQ  GO
	HVNGAT
	
	ABSTAR  STAY
	USACO 

Executing...
   Test 1: TEST OK [0.098 secs, 24064 KB]
   Test 2: TEST OK [0.098 secs, 23976 KB]
   Test 3: TEST OK [0.098 secs, 23988 KB]
   Test 4: TEST OK [0.100 secs, 24292 KB]
   Test 5: TEST OK [0.100 secs, 23360 KB]
   Test 6: TEST OK [0.100 secs, 23752 KB]
   Test 7: TEST OK [0.098 secs, 23672 KB]
   Test 8: TEST OK [0.098 secs, 24052 KB]
   Test 9: TEST OK [0.103 secs, 23532 KB]
   Test 10: TEST OK [0.100 secs, 23416 KB]

Test Input:
   	------- test 1 [length 14 bytes] ----
   	COMETQ
   	HVNGAT
   	------- test 2 [length 13 bytes] ----
   	STARAB
   	USACO
   	------- test 3 [length 12 bytes] ----
   	EARTH
   	LEFTB
   	------- test 4 [length 13 bytes] ----
   	PULSAR
   	VENUS
   	------- test 5 [length 12 bytes] ----
   	KANSAS
   	UTAH
   	------- test 6 [length 11 bytes] ----
   	APPLE
   	URSA
   	------- test 7 [length 10 bytes] ----
   	MSFT
   	MARS
   	------- test 8 [length 13 bytes] ----
   	PLUTO
   	BKHOLE
   	------- test 9 [length 13 bytes] ----
   	COWSBC
   	RIGHT
   	------- test 10 [length 14 bytes] ----
   	DRKMTR
   	SNIKER	
