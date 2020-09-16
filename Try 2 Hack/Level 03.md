#### Level 3

Challenge : http://www.try2hack.nl/levels/level3-.xhtml

You will get an annoying prompt asking you to enter the password that disables you to view the source code with right-click or ctrl+u. Viewe the source code directly by typing in the address bar:
<a>view-source:http://www.try2hack.nl/levels/level3-.xhtml</a>

The Javascript you will find is:
```javascript

pwd = prompt("Please enter the password for level 3:","");
if (pwd==PASSWORD)
{
    alert("Allright!\nEntering Level 4 ...");
    location.href = CORRECTSITE;
}
else 
{
    alert("WRONG!\nBack to disneyland !!!");
    location.href = WRONGSITE;
}
PASSWORD="AbCdE";
CORRECTSITE="level4-sfvfxc.xhtml";
WRONGSITE="http://www.disney.com";
```

Ignore the javascript - it is commented out so will not have any effect on the page. But, check out the external javascript that is camouflaged right over it:

```javascript
<script type="text/javascript" src="JavaScript"></script>
```

Check out the source code of this script: <a>view-source:http://try2hack.nl/levels/JavaScript</a>
```
PASSWORD = "try2hackrawks";
CORRECTSITE = "level4-kdnvxs.xhtml";
WRONGSITE = "http://www.disney.com";
```

There you goo! Password is try2hackrawks
