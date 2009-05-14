import javax.swing._
import java.awt.event._

class UDGApplet extends JApplet {
    val text = new JTextArea()
    val geometry = new GeometryPanel()
    override def init() {
        // add("Center", new JScrollPane(text))
        add("Center", geometry)
        text.append("init\n")
    }
    override def start() {
        text.append("started\n");
    }
    override def stop() {
        text.append("stopped\n");
    }
}

