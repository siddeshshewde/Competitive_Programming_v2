#### Intro 5

Challenge    : https://defendtheweb.net/playground/intro5
Difficulty   : Bronze
Success Rate : 94%

Do an Inspect Element of the Page and search for 'password', there will be a js script tag:
```js
{
    var pass;
    pass=prompt("Password","");
    if (pass=="6e198cad6d") {
        window.location.href="?password=6e198cad6d";
}
```
You can easily figure here that the password is : `6e198cad6d`.