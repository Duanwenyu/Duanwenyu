package com.duanwenyu;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainJFrame extends javax.swing.JFrame {
	private JButton signButton;
	private JLabel jLabel2;
	private JTextField userPassward;
	private JTextField userName;
	private JLabel jLabel1;
	private JButton regButton;
	private RegJFrame reg = new RegJFrame();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainJFrame inst = new MainJFrame();
				GroupLayout instLayout = new GroupLayout((JComponent)inst.getContentPane());
				inst.getContentPane().setLayout(instLayout);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				instLayout.setVerticalGroup(instLayout.createSequentialGroup());
				instLayout.setHorizontalGroup(instLayout.createSequentialGroup());
			}
		});
	}
	
	public MainJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				signButton = new JButton();
				signButton.setText("\u767b\u5f55");
				signButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
//						System.out.println("signButton.actionPerformed, event="+evt);
						boolean flag=false;
						if(reg.userList.size()==0){
							JOptionPane.showMessageDialog(null, "Çë×¢²á£¡");
						}else{
						for (int i = 0; i < reg.userList.size(); i++) {
							if((userName.getText()).equals(reg.userList.get(i).name) && (userPassward.getText()).equals(reg.userList.get(i).password)){
								JOptionPane.showMessageDialog(null, "µÇÂ½³É¹¦£¬µÇÂ½µÄÓÊÏäÎª"+reg.userList.get(i).email);
								flag=true;
							}
						}
						if(flag==false){
						JOptionPane.showMessageDialog(null, "ÓÃ»§Ãû»òÃÜÂë´íÎó£¡");
						}
					}
					}
				});
			}
			{
				regButton = new JButton();
				regButton.setText("\u6ce8\u518c");
				regButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
//						System.out.println("regButton.actionPerformed, event="+evt);

						reg.setLocation(400, 300);
						reg.setSize(400, 400);
						reg.pack();
						reg.setVisible(true);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("\u7528\u6237\u540d\uff1a");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("\u5bc6\u7801\uff1a");
			}
			{
				userName = new JTextField();
			}
			{
				userPassward = new JTextField();
			}
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(41, 41)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(userName, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(userPassward, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(signButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					    .addComponent(regButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(40, 40));
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(26, 26)
					.addGroup(thisLayout.createParallelGroup()
					    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addPreferredGap(jLabel1, jLabel2, LayoutStyle.ComponentPlacement.INDENT)
					        .addComponent(jLabel2, 0, 55, Short.MAX_VALUE)))
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(signButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 51, Short.MAX_VALUE)
					        .addComponent(regButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					        .addGap(30))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addPreferredGap(signButton, userPassward, LayoutStyle.ComponentPlacement.INDENT)
					        .addGroup(thisLayout.createParallelGroup()
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(userPassward, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(userName, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
					        .addGap(0, 0, Short.MAX_VALUE)))
					.addContainerGap(62, 62));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
