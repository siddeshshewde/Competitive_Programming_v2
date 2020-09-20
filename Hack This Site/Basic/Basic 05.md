#### Level 5

Challenge    : https://www.hackthissite.org/missions/basic/5/
Requirements : HTML, Javascript

Go to source code. If you search for password, you will find a form containing hidden input type and the value being: "sam@hackthissite.org" and the next nput type a button and on clicking it, will send the the password for this challenge. 

```html
<form action="/missions/basic/5/level5.php" method="post">
<input type="hidden" name="to" value="sam@hackthissite.org" />
<input type="submit" value="Send password to Sam" />
```
Inspect Element and change the email to your email address which is registered with hackthissite.org and you will get the password on your mail.

Password: 6d936c77