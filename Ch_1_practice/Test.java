

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
        "http://team3061.org/wp-content/uploads/2014/04/cropped-DSC_0013Edit.jpg");
        JOptionPane.showMessageDialog(null, "Team 3061", "Title",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}    
    
