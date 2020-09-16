#### Level 4

Challenge: http://www.try2hack.nl/levels/level4-kdnvxs.xhtml

Blank Screen!! There is always something hidden behind it :)

If you check the source code: <a>view-source:http://www.try2hack.nl/levels/level4-kdnvxs.xhtml</a>
The only code that matters here is:
```
<object classid="java:PasswdLevel4.class" type="application/x-java-applet" height="370" width="330" >
```

You need to somehow check the code of the file: PasswdLevel4.class
The file basically contains bytecode which is a kind of instruction for JVM which then translates that bytecode into platform specific machine level instruction. If you compile a source code (java_file.java) then you will get a .class file which we have here. We now need to decompile it:
- I would recommend cavaj or http://java-decompiler.github.io/
- Any online decompiler would also work: http://www.javadecompilers.com/

Source code will be something like:
```java
import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class PasswdLevel4 extends Applet implements ActionListener {
  private URL finalurl;
  
  String infile;
  
  String[] inuser = new String[22];
  
  int totno = 0;
  
  InputStream countConn = null;
  
  BufferedReader countData = null;
  
  URL inURL = null;
  
  TextField txtlogin = new TextField();
  
  Label label1 = new Label();
  
  Label label2 = new Label();
  
  Label label3 = new Label();
  
  TextField txtpass = new TextField();
  
  Label lblstatus = new Label();
  
  Button ButOk = new Button();
  
  Button ButReset = new Button();
  
  Label lbltitle = new Label();
  
  void ButOk_ActionPerformed(ActionEvent paramActionEvent) {
    boolean bool = false;
    for (byte b = 1; b <= this.totno / 2; b++) {
      if (this.txtlogin.getText().trim().toUpperCase().intern() == this.inuser[2 * (b - 1) + 2].trim().toUpperCase().intern() && this.txtpass.getText().trim().toUpperCase().intern() == this.inuser[2 * (b - 1) + 3].trim().toUpperCase().intern()) {
        this.lblstatus.setText("Login Success, Loading..");
        bool = true;
        String str1 = this.inuser[1].trim().intern();
        String str2 = getParameter("targetframe");
        if (str2 == null)
          str2 = "_self"; 
        try {
          this.finalurl = new URL(getCodeBase(), str1);
        } catch (MalformedURLException malformedURLException) {
          this.lblstatus.setText("Bad URL");
        } 
        getAppletContext().showDocument(this.finalurl, str2);
      } 
    } 
    if (!bool)
      this.lblstatus.setText("Invaild Login or Password"); 
  }
  
  void ButReset_ActionPerformed(ActionEvent paramActionEvent) {
    this.txtlogin.setText("");
    this.txtpass.setText("");
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Object object = paramActionEvent.getSource();
    if (object == this.ButOk) {
      ButOk_ActionPerformed(paramActionEvent);
      return;
    } 
    if (object == this.ButReset)
      ButReset_ActionPerformed(paramActionEvent); 
  }
  
  public void destroy() {
    this.ButOk.setEnabled(false);
    this.ButReset.setEnabled(false);
    this.txtlogin.setVisible(false);
    this.txtpass.setVisible(false);
  }
  
  public void inFile() {
    try {
      this.countConn = this.inURL.openStream();
      this.countData = new BufferedReader(new InputStreamReader(this.countConn));
      String str;
      while ((str = this.countData.readLine()) != null) {
        if (this.totno < 21) {
          this.totno++;
          this.inuser[this.totno] = str;
          str = "";
          continue;
        } 
        this.lblstatus.setText("Cannot Exceed 10 users, Applet fail start!");
        destroy();
      } 
    } catch (IOException iOException) {
      getAppletContext().showStatus("IO Error:" + iOException.getMessage());
    } 
    try {
      this.countConn.close();
      this.countData.close();
      return;
    } catch (IOException iOException) {
      getAppletContext().showStatus("IO Error:" + iOException.getMessage());
      return;
    } 
  }
  
  public void init() {
    setLayout(null);
    setSize(361, 191);
    add(this.txtlogin);
    this.txtlogin.setBounds(156, 72, 132, 24);
    this.label1.setText("Please Enter Login Name & Password");
    this.label1.setAlignment(1);
    add(this.label1);
    this.label1.setFont(new Font("Dialog", 1, 12));
    this.label1.setBounds(41, 36, 280, 24);
    this.label2.setText("Login");
    add(this.label2);
    this.label2.setFont(new Font("Dialog", 1, 12));
    this.label2.setBounds(75, 72, 36, 24);
    this.label3.setText("Password");
    add(this.label3);
    add(this.txtpass);
    this.txtpass.setEchoChar('*');
    this.txtpass.setBounds(156, 108, 132, 24);
    this.lblstatus.setAlignment(1);
    this.label3.setFont(new Font("Dialog", 1, 12));
    this.label3.setBounds(75, 108, 57, 21);
    add(this.lblstatus);
    this.lblstatus.setFont(new Font("Dialog", 1, 12));
    this.lblstatus.setBounds(14, 132, 344, 24);
    this.ButOk.setLabel("OK");
    add(this.ButOk);
    this.ButOk.setFont(new Font("Dialog", 1, 12));
    this.ButOk.setBounds(105, 156, 59, 23);
    this.ButReset.setLabel("Reset");
    add(this.ButReset);
    this.ButReset.setFont(new Font("Dialog", 1, 12));
    this.ButReset.setBounds(204, 156, 59, 23);
    this.lbltitle.setAlignment(1);
    add(this.lbltitle);
    this.lbltitle.setFont(new Font("Dialog", 1, 12));
    this.lbltitle.setBounds(12, 14, 336, 24);
    String str = getParameter("title");
    this.lbltitle.setText(str);
    this.ButOk.addActionListener(this);
    this.ButReset.addActionListener(this);
    this.infile = new String("level4");
    try {
      this.inURL = new URL(getCodeBase(), this.infile);
    } catch (MalformedURLException malformedURLException) {
      getAppletContext().showStatus("Bad Counter URL:" + this.inURL);
    } 
    inFile();
  }
}
```

This took me a while to decode :)
Notice a file being included here:
```java
this.infile = new String("level4");
```

Let's navigate to http://try2hack.nl/levels/level4
```
level5-fdvbdf.xhtml
appletking
pieceofcake
```
You now have the URL, username and password.