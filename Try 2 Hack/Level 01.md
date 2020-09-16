#### Level 1

Challenge : http://www.try2hack.nl/levels/

Right Click on the page and click on view-page source or just ctrl+u. There you can see a javascript:

```javascript
<script type="text/javascript">
      <!--
      function Try(passwd) {   
        if (passwd =="h4x0r") {
          alert("Alright! On to level 2...");   
          location.href = "level2-xfdgnh.xhtml";
        }
        else {
          alert("The password is incorrect. Please don't try again.");
          location.href = "http://www.disney.com/";
        }
      }
      //-->  
    </script>
```

You can easily see that the password is: h4x0r