
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JPanel

class GeometryPanel extends JPanel {
    override def paint(g: Graphics) {
        val g2d = g.asInstanceOf[Graphics2D]
        g2d.drawString("It works", 50, 50)
    }
}
