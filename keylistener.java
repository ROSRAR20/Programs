import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="SimpleKey" width=300 height=100>
</applet>
*/
public class keylistener extends Applet implements KeyListener {
String msg = "";
int X = 10, Y = 20; // output coordinates
@Override
public void init() {
addKeyListener(this);
}
@Override
public void keyPressed(KeyEvent ke) {
showStatus("Key Down");
}
@Override
public void keyReleased(KeyEvent ke) {
showStatus("Key Up");
}
@Override
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}
// Display keystrokes.
@Override
public void paint(Graphics g) {
g.drawString(msg, X, Y);
}
public static void main(String[] args) {
    keylistener a = new keylistener();
    a.init();
}
}