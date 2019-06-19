package davidVardanyan3PointTriangle;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

public class DrawTriangle extends Frame {

	  public Polygon mypolygon = new Polygon();
	    
	  public void paint(Graphics g) {
	     Graphics2D ga = (Graphics2D)g;
	     ga.setPaint(Color.red);
	     ga.drawPolygon(mypolygon);
	  }
	  
	      
	  public static void main(String args[]) {
	     List< Integer > srcpoints = new ArrayList< Integer >();
	     srcpoints.add(200);srcpoints.add(200);
	     srcpoints.add(75);srcpoints.add(75);
	     srcpoints.add(100);srcpoints.add(200);
	     srcpoints.add(srcpoints.get(0));
	     srcpoints.add(srcpoints.get(1));
	     
	     DrawTriangle frame = new DrawTriangle();
	     for(int i = 0; i < srcpoints.size(); i++)
	     {
	         int x = srcpoints.get(i++);
	         int y = srcpoints.get(i);
	         frame.mypolygon.addPoint(x, y);
	     }
	     
	     frame.addWindowListener(
	      (WindowListener) new WindowAdapter()
	      {
	         public void windowClosing(WindowEvent we)
	         {
	            System.exit(0);
	         }
	      }
	     );
	     
	   frame.setSize(400, 400);
	   frame.setVisible(true);
	  }
	}