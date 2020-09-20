#### Level 4

Challenge    : https://www.hackthissite.org/missions/basic/4
Requirements : HTML

Go to source code. If you search for password, you will find a form containing hidden input type and the value being: "sam@hackthissite.org" and the next nput type a button and on clicking it, will send the the password for this challenge. 

```html
<form action="/missions/basic/4/level4.php" method="post">
<input type="hidden" name="to" value="sam@hackthissite.org" />
<input type="submit" value="Send password to Sam" />
```
Inspect Element and change the email to your email address which is registered with hackthissite.org and you will get the password on your mail.

Password: b1fb0c55