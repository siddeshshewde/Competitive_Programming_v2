#### Intro 2

Challenge : https://defendtheweb.net/playground/intro2

Check the source code of the page (ctrl+u) and there you will find the username and password present in the form with rgb value set to transparent:

```html
<label for="username">Username <span style='color: rgba(0,0,0,0)'>is somethingnew</span></label>                            
<label for="password">Password <span style='color: rgba(0,0,0,0)'>is 962f83bca3</span></label>                            
```
You can easily figure the username is somethingnew and password is 962f83bca3.