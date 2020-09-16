#### Level 2

Challenge : http://www.try2hack.nl/levels/level2-xfdgnh.xhtml

Here right-click and middle-click is disabled, so to view the source code hit ctrl+u OR add 'view-source:' at the start of the URL so that the final URL will be: <a>view-source:http://www.try2hack.nl/levels/level2-xfdgnh.xhtml</a>

There you will see a flash file present:
```html
<object type="application/x-shockwave-flash" data="level2.swf" width="300" height="200">
    <param name="movie" value="level2.swf" />
    <param name="bgcolor" value="#FFFFFF" />
  </object>	
```

Then view the source-code of the flash file by going to this path:
<a>view-source:http://try2hack.nl/levels/level2.swf</a>

You will see the username and password among the mess
```
txtUsername
try2hack
txtPassword
irtehh4x0r!
```

Username is try2hack and Password is irtehh4x0r!.