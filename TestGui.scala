//90-days coding challenge
//Vipul Vaibhaw

import scala.swing._
import scala.swing.SimpleSwingApplication

object TestGui extends SimpleSwingApplication{
  def top = new MainFrame {
    title = "Hello, World!"
    size = new Dimension(500,500)
    val button = new Button("Click Me!");
  contents = new BoxPanel(Orientation.Vertical) {
      contents += button
      border = Swing.EmptyBorder(30, 30, 10, 30)
    }
 }
}