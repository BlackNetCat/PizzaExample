package pizzahome;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class View {
	
	JFrame frame;
	String tempA;
	String string;
	String tempB;
	

	
	public View() {
		initialize();
	}
	
	public void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Pizza Market");
		lblNewLabel.setBounds(299, 11, 196, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Select Pizza");
		lblNewLabel_2.setBounds(10, 99, 125, 14);
		frame.getContentPane().add(lblNewLabel_2);
				
		final JLabel result0 = new JLabel("");
		result0.setBounds(48, 400, 538, 39);
		frame.getContentPane().add(result0);
		
		final JLabel result1 = new JLabel("");
		result1.setBounds(48, 415, 538, 39);
		frame.getContentPane().add(result1);
		
		final JLabel result2 = new JLabel("");
		result2.setBounds(48, 430, 538, 39);
		frame.getContentPane().add(result2);
		
		final JLabel result3 = new JLabel("");
		result3.setBounds(48, 445, 538, 39);
		frame.getContentPane().add(result3);
		
		final JLabel result4 = new JLabel("");
		result4.setBounds(48, 460, 538, 39);
		frame.getContentPane().add(result4);
		
		final JLabel result5 = new JLabel("");
		result5.setBounds(48, 475, 538, 39);
		frame.getContentPane().add(result5);
		
		final JLabel result6 = new JLabel("");
		result6.setBounds(48, 490, 538, 39);
		frame.getContentPane().add(result6);
		
		final JLabel result7 = new JLabel("");
		result7.setBounds(48, 505, 538, 39);
		frame.getContentPane().add(result7);
		
		final JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(420, 45, 155, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		final JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(420, 65, 155, 14);
		frame.getContentPane().add(lblNewLabel_3);
				
		final JRadioButton rNY = new JRadioButton("NY Style");
		
		JRadioButton rCH = new JRadioButton("Chicago Style");	   
	    JRadioButton rC = new JRadioButton("Custom");
	    rNY.setSelected(true); //sets this button as selected on startup
	    
	    // Create the button group to keep only one selected.
	    ButtonGroup btnGroup = new ButtonGroup();
	    btnGroup.add(rNY);
	    btnGroup.add(rCH);
	    btnGroup.add(rC);
	   
	   
	    rNY.setBounds(400, 100, 150, 30);
	    frame.getContentPane().add(rNY);
	    
	    rCH.setBounds(400, 130, 150, 30);
	    frame.getContentPane().add(rCH);
	    	    
	    rC.setBounds(400, 160, 150, 30);
	    frame.getContentPane().add(rC);		
	    
	    rNY.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	           // textField.setEditable(true);
	            lblNewLabel_4.setText("NY Style");
	            tempB = "ny"; 
	            

	        }
	    });
	    
	    rCH.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	           // textField.setEditable(true);
	            lblNewLabel_4.setText("Chicago Style");
	            tempB = "ch";
	           

	        }
	    });
	    
	    rC.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	           // textField.setEditable(true);
	            lblNewLabel_4.setText("Custom Style");
	            tempB = "cu";

	        }
	    });

	   
	    	
	    
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox) {
			       
			        	String msg = (String)comboBox.getSelectedItem();
			        	switch (msg) {			        	
			        	case "Cheese": 
			        
			        		lblNewLabel_3.setText("cheese");
			        		tempA = "cheese"; 			        		
			        		break;
			        	case "Veggie": 
			        	
			        		lblNewLabel_3.setText("veggie");
			        		tempA = "veggie"; 
		        			break;
			        	case "Pepperoni": 
			        	
			        		lblNewLabel_3.setText("pepperoni");
			        		tempA = "pepperoni"; 
		        			break;
			        	case "Clams": 
				        	
			        		lblNewLabel_3.setText("clams");
			        		tempA = "clams"; 
		        			break;
			        	default: lblNewLabel_3.setText("cheese");
			        		tempA = "cheese"; 
			        	}
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cheese", "Veggie", "Pepperoni", "Clams"}));
		comboBox.setBounds(183, 99, 155, 20);
		frame.getContentPane().add(comboBox);
		
		
		if (rNY.equals(true)) {
			lblNewLabel_3.setText("Test");
		}
		
		JButton btnCreateDrink = new JButton("Create Pizza");
		btnCreateDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
				if (tempA.equals("cheese")) {
					string = "cheese";		
	        	}else if (tempA.equals("veggie")) {
					string = "veggie";		
	        	}else if (tempA.equals("pepperoni")) {
					string = "pepperoni";	
	        	}else if (tempA.equals("clams")) {
					string = "clam";	
	        	}else string = "custom";
				
				
				PizzaStore store = new NYPizzaStore();	
				
				if (tempB == "ny"){
					 lblNewLabel_4.setText("NY Style");
					 store = new NYPizzaStore();
				}
				if (tempB == "ch"){
					 lblNewLabel_4.setText("Chicago Style");
					 store = new ChicagoPizzaStore();
				}
				
				if (tempB == "cu"){
					 lblNewLabel_4.setText("Custom Style");
					 window2();					
					 
				}
				
						
				Pizza pizza = store.orderPizza(string);			
				result0.setText("Ingredints : " + pizza.getName() + " :");	
				
				result1.setText(pizza.dough.getName());	
				
				result2.setText(pizza.sauce.getName());	  				
				
				if (pizza.cheese != null) {			
					pizza.cheese.print();
					result3.setText(pizza.cheese.getName());
				}
				
				if (pizza.pepperoni != null) {			
					pizza.pepperoni.print();	
					result4.setText(pizza.pepperoni.getName());
				}
				if (pizza.clam != null) {			
					pizza.clam.print();		
					result5.setText(pizza.clam.getName());	
				}
				
				if (pizza.veggies != null) {
					for (int i = 0; i < pizza.veggies.length; i++){
						pizza.veggies[i].print();
						result6.setText(pizza.veggies[0].getName() + ", " + pizza.veggies[1].getName() + 
							", " + pizza.veggies[2].getName() + ", " + pizza.veggies[3].getName() + ", " );	
					}
				}								
				result7.setText("Client ordered a " + pizza.getName() + "\n");			
				
			}
		});
		
		
		btnCreateDrink.setBounds(274, 255, 134, 23);
		frame.getContentPane().add(btnCreateDrink);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result0.setText("");
				result1.setText("");
				result2.setText("");
				result3.setText("");
				result4.setText("");
				result5.setText("");
				result6.setText("");
				result7.setText("");
				
			}
		});
		btnNewButton.setBounds(274, 300, 134, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	public void window2 (){
		
		final String [] toppings = {"onion", "cheese", "garlic", "pepperoni"};
		
		JFrame jf = new JFrame("Ingredients : ");
		jf.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		jf.setBounds(100, 100, 800, 640);		
		jf.getContentPane().setLayout(null);		
		jf.setVisible(true);
		
		final JLabel result0 = new JLabel("0");
		result0.setBounds(48, 400, 538, 39);
		jf.getContentPane().add(result0);
		
		final JLabel result1 = new JLabel("1");
		result1.setBounds(48, 415, 538, 39);
		jf.getContentPane().add(result1);
		
		final JLabel result2 = new JLabel("2");
		result2.setBounds(48, 430, 538, 39);
		jf.getContentPane().add(result2);
		
		final JLabel result3 = new JLabel("3");
		result3.setBounds(48, 445, 538, 39);
		jf.getContentPane().add(result3);
		
		final JLabel result4 = new JLabel("4");
		result4.setBounds(48, 460, 538, 39);
		jf.getContentPane().add(result4);
		
		final JLabel result5 = new JLabel("5");
		result5.setBounds(48, 475, 538, 39);
		jf.getContentPane().add(result5);
		
		final JLabel result6 = new JLabel("6");
		result6.setBounds(48, 490, 538, 39);
		jf.getContentPane().add(result6);
		
		final JLabel result7 = new JLabel("7");
		result7.setBounds(48, 505, 538, 39);
		jf.getContentPane().add(result7);

				
		final JCheckBox boxOnion = new JCheckBox("Onion");
		boxOnion.setBounds(10, 10, 155, 23);       
		boxOnion.setSelected(false);
		jf.getContentPane().add(boxOnion);
		
		final JCheckBox boxCheese = new JCheckBox("Cheese");
		boxCheese.setBounds(10, 30, 155, 23);       
		boxCheese.setSelected(false);
		jf.getContentPane().add(boxCheese);
		
		final JCheckBox boxGarlic = new JCheckBox("Garlic");
		boxGarlic.setBounds(10, 50, 155, 23);       
		boxGarlic.setSelected(false);
		jf.getContentPane().add(boxGarlic);
		
		final JCheckBox boxPepperoni = new JCheckBox("Pepperoni");
		boxPepperoni.setBounds(10, 70, 155, 23);       
		boxPepperoni.setSelected(false);
		jf.getContentPane().add(boxPepperoni);
		
		final JLabel res = new JLabel("Custom is not ready, only in Demo Status");
		res.setBounds(10, 200, 538, 39);
		jf.getContentPane().add(res);
		
		
		JButton btnNewBut = new JButton("OK");
		btnNewBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PizzaStore store = new NYPizzaStore();	
				Pizza pizza = store.orderPizza(toppings);		
				
				result0.setText("Ingredints : " + pizza.getName() + " :");	
				
				result1.setText(pizza.dough.getName());	
				
				result2.setText(pizza.sauce.getName());	  	
				
				if (boxOnion.getSelectedObjects() != null) {
					result3.setText(pizza.custom.get(0).getName());	 
					
				}
				else{
					result3.setText("");	
					
				}		
				
				if (boxCheese.getSelectedObjects() != null) {
					result4.setText(pizza.custom.get(1).getName());	
					
				}
				else{
					result4.setText("");	 
					
				}		
				
				if (boxGarlic.getSelectedObjects() != null) {
					result5.setText(pizza.custom.get(2).getName());	
					
				}
				else{
					result5.setText("");	
					
				}		
				
				if (boxPepperoni.getSelectedObjects() != null) {
					result6.setText(pizza.custom.get(3).getName());	 
				
				}
				else{
					result6.setText("");	
				
				}		
				
				
				
				
				
				result7.setText("Client ordered a " + pizza.getName() + "\n");	
				
				
			}
		});
		btnNewBut.setBounds(150, 150, 120, 23);
		jf.getContentPane().add(btnNewBut);
		
		
		
		
	}

}
