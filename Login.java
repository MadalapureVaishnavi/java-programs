import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Login" width=400 height=200></applet>*/
public class Login extends Applet implements ActionListener
{
	Label lblUnm,lblPwd,lblRes;
	TextField txtUnm,txtPwd;
	Button btnLogin,btnClear;
	public void init(){
		setLayout(new GridLayout(4,2));
		lblUnm=new Label("User name:");
		add(lblUnm);
		txtUnm=new TextField(30);
		add(txtUnm);
		lblPwd=new Label("Password:");
		add(lblPwd);
		txtPwd=new TextField(30);
		txtPwd.setEchoChar('*');
		add(txtPwd);
		btnLogin=new Button("Login");
		add(btnLogin);
		btnClear=new Button("Clear");
		add(btnClear);
		lblRes=new Label("Welcome, Guest");
		add(lblRes);
		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btnLogin){
			if(txtUnm.getText().equals("admin")&&txtPwd.getText().equals("admin")){
				lblRes.setText("Welcome, "+txtUnm.getText());
		}
			else{
				lblRes.setText("Welcome, Guest");
			}
		}else if(ae.getSource()==btnClear){
			if(!(txtUnm.getText().equals(null))&&!(txtPwd.getText().equals(null))){
				txtUnm.setText("");
				txtPwd.setText("");
		}
		}
	}
}