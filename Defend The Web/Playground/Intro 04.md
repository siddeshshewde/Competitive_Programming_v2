#### Intro 4

Challenge    : https://defendtheweb.net/playground/intro4
Difficulty   : Bronze
Success Rate : 87%

Check the source code of the page (ctrl+u) and there you will find a hidden input-type:

```html
<input type="hidden" name="passwordfile" id="passwordfile" value="../../extras/playground/9d2K4Fw.json" maxlength="" placeholder="" class="u-full-width" />
```
You can easily figure here that the username and password is somewhere in a JSON file: ../../extras/playground/9d2K4Fw.json

If you navigate to that file: https://defendtheweb.net/extras/playground/9d2K4Fw.json

```JSON
{
    username: "thomas",
    password: "S9234HKFnsd"
}
```

Say no more! :)