package applet;
import java.awt.*;

import java.applet.*;

public class AnimationEx extends Applet 

  {

    Image pic;
	Image pic1;

    public void init()

      {

        pic=getImage(getDocumentBase(),"pic.png");
	//pic.start();
	pic1=getImage(getDocumentBase(),"pic1.jpg");
	//pic1.start();

      }

    public void paint(Graphics grp)

      {
        for(int i=50;i<300;i++)

          {
	    grp.drawImage(pic1, 10,30,this);
	                grp.drawImage(pic,i,80,this);
            try

              {
		

                Thread.sleep(10);

              }

            catch(Exception e){}

          }

      
}
public static void main(String ar[])
{
}

  }