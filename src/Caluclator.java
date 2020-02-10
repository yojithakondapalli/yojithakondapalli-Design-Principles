import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
public class Caluclator implements ActionListener 
{
public void actionPerformed (ActionEvent ae )
{

}
public static void main(String[] args) {
JFrame j = new JFrame("Caluclator");
Container c = j.getContentPane();
JPanel p1 = new JPanel();
p1.setLayout(new BorderLayout());
p1.setLayout(new GridLayout(4,4,4,4));
final JTextField t = new JTextField(100);
c.add(t,BorderLayout.NORTH);
final JButton b1 = new JButton("1");
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b1.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b2 = new JButton("2");
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b2.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b3 = new JButton("3");
b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b3.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b4 = new JButton("4");
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b4.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b5 = new JButton("5");
b5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b5.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b6 = new JButton("6");
b6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b6.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b7 = new JButton("7");
b7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b7.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b8 = new JButton("8");
b8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b8.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b9 = new JButton("9");
b9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b9.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b10 = new JButton("0");
b10.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b10.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b11 = new JButton("+");
b11.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b11.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b12 = new JButton("-");
b12.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b12.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b13 = new JButton("*");
b13.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b13.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b14 = new JButton("/");
b14.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = b14.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
}
});
final JButton b15 = new JButton("=");
b15.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String global = t.getText();
ScriptEngineManager seg = new ScriptEngineManager();
ScriptEngine engine = seg.getEngineByName("JavaScript");
try {
String st = engine.eval(global).toString();
t.setText(st);
} 
catch (ScriptException e1) 
{
e1.printStackTrace();
}
}
});
final JButton b16 = new JButton("C");
b16.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String global = t.getText();
global = null;
t.setText(global);
}
});
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b10);
p1.add(b11);
p1.add(b12);
p1.add(b13);
p1.add(b14);
p1.add(b15);
p1.add(b16);
c.add(p1,BorderLayout.CENTER);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setSize(300,300);
j.setVisible(true);
}
}
