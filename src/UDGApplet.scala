import javax.swing._
import java.awt.event._

class UDGApplet extends JApplet {
    val text = new JTextArea()
    override def init() {
        getContentPane().add("Center", new JScrollPane(text))
        text.append("init\n")
    }
    override def start() {
        text.append("started\n");
    }
    override def stop() {
        text.append("stopped\n");
    }
}
