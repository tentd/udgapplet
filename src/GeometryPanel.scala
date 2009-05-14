
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.geom._
import java.awt.RenderingHints
import javax.swing.JPanel

class GeometryPanel extends JPanel {
    override def paint(g: Graphics) {
        // TODO: currently just a stub

        // cast Graphics -> Graphics2D for more advanced stuff
        val g2 = g.asInstanceOf[Graphics2D]

        // setup rendering
        val saved = g2.getTransform()
        g2.scale(0.5, 0.7)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON)
        
        // draw circles
        g2.draw(new Ellipse2D.Float(50, 50, 50, 50))

        // draw points
        

        // draw grid
        
        // restore transformation matrix
        g2.setTransform(saved)
    }
}
