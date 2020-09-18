#### Level 3

Challenge    : https://www.hackthissite.org/missions/basic/3/
Requirements : Basic HTML

Go to source code. If you search for password, you will find a form containing hidden input type and the file being: password.php

```html
<form action="/missions/basic/3/index.php" method="post">
    <input type="hidden" name="file" value="password.php" />
    <input type="password" name="password" /><br /><br />
    <input type="submit" value="submit" />
</form>
```

If you check the password.php file you will find that the password is ad2fc519

<a>view-source:https://www.hackthissite.org/missions/basic/3/password.php</a>
