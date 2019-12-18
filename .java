import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CenterWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("Hello World");
		
		shell.open();
		
		Rectangle rect=shell.getDisplay().getBounds();
		Point point=shell.getSize();
		
		int left=(rect.width-point.x)/2;
		int top=(rect.height-point.y)/2;
		
		shell.setBounds(left,top,point.x,point.y);
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();
	}

}
