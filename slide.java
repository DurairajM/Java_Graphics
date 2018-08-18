package applet;

import java.applet.*;

import java.awt.*;

public class slide extends Applet

  {

    Image pic;

    public void init()

      {

        pic =getImage(getDocumentBase(),"pic.png");

      }

    public void paint(Graphics grp)

      {

        grp.drawImage(pic, 100,30,this);

      }

  }

/*

<applet code="slide.class" width="400" height="400">

</applet

*/
