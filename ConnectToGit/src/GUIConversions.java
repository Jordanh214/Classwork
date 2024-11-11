import java.awt.EventQueue;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIConversions {

	private JFrame frame;
	private JTextField textStarting; //Starting Value that the user inputs to select which currency they are starting with
	private JTextField textConversion; //Selection of currency the user would like to convert to
	private JTextField textConvertedAmt; //The converted amount after converting to the user's chosen currency
	private JTextField textCurrencyNum;  //Starting amount that the user would like to convert
	
	public class converterInitialCommit { //https://sentry.io/answers/how-to-create-a-file-and-write-to-it-in-java/#:~:text=java%20file.,file%20will%20not%20be%20overwritten.
		public static ArrayList<String> conversionHistory= new ArrayList<>(); //ArrayList to hold the conversions and write them to a file
	}
	
	private usdConversions currency1= new usdConversions(); //Calling the usdConversions class to work the conversions with the GUI
	private eurConversions currency2= new eurConversions(); //Calling the eurConversions class to work the conversions with the GUI
	private gbpConversions currency3= new gbpConversions(); //Calling the gbpConversions class to work the conversions with the GUI
	private jpyConversions currency4= new jpyConversions(); //Calling the jpyConversions class to work the conversions with the GUI
	private audConversions currency5= new audConversions(); //Calling the audConversions class to work the conversions with the GUI
	private cadConversions currency6= new cadConversions(); //Calling the cadConversions class to work the conversions with the GUI
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIConversions window = new GUIConversions(); //Creating the GUI Window
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	public GUIConversions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(132, 132, 255)); //Background and layout
		frame.setBounds(100, 100, 597, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConversions = new JLabel("Currency Conversions"); //Title of GUI and formatting
		lblConversions.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversions.setFont(new Font("Calibri", Font.BOLD, 22));
		lblConversions.setBounds(0, 11, 581, 27);
		frame.getContentPane().add(lblConversions);
		
		JTextArea areaConversions = new JTextArea(); //Text area to set the options for the currency converter
		areaConversions.setToolTipText("");
		areaConversions.setBackground(new Color(132, 132, 255));
		areaConversions.setFont(new Font("Calibri", Font.BOLD, 18));
		areaConversions.setText("1 - US Dollar\t      4 - Japanese Yen\r\n2 - Euro\t      5 - Australian Dollar\r\n3 - Pound\t      6 - Canadian Dollar");
		areaConversions.setRows(6);
		areaConversions.setBounds(138, 42, 378, 74);
		frame.getContentPane().add(areaConversions);
		
		JLabel lblStarting = new JLabel("Enter the number of your currency:");//label to instruct the user to enter the starting currency number
		lblStarting.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblStarting.setHorizontalAlignment(SwingConstants.LEFT);
		lblStarting.setBounds(10, 144, 308, 27);
		frame.getContentPane().add(lblStarting);
		
		textStarting = new JTextField();// text field for user to enter starting currency number
		textStarting.setHorizontalAlignment(SwingConstants.CENTER);
		textStarting.setBounds(304, 146, 273, 20);
		frame.getContentPane().add(textStarting);
		textStarting.setColumns(10);
		
		JLabel lblConversion = new JLabel("Enter number of currency to convert to:"); //label for the user to enter the number of the currency they want to convert to.
		lblConversion.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblConversion.setHorizontalAlignment(SwingConstants.LEFT);
		lblConversion.setBounds(10, 196, 308, 27);
		frame.getContentPane().add(lblConversion);
		
		textConversion = new JTextField(); //text field for the user to enter the converting currency number
		textConversion.setHorizontalAlignment(SwingConstants.CENTER);
		textConversion.setBounds(318, 199, 255, 20);
		frame.getContentPane().add(textConversion);
		textConversion.setColumns(10);
		
		textConvertedAmt = new JTextField(); //text field to show the converted currency amt
		textConvertedAmt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textConvertedAmt.setEditable(false);
		textConvertedAmt.setHorizontalAlignment(SwingConstants.CENTER);
		textConvertedAmt.setBackground(new Color(255, 255, 255));
		textConvertedAmt.setBounds(123, 341, 335, 45);
		frame.getContentPane().add(textConvertedAmt);
		textConvertedAmt.setColumns(10);
		
		JLabel lblCurrencyNum; //label to tell the user to input the starting currency amt
		lblCurrencyNum = new JLabel("Enter amount you want converted:");
		lblCurrencyNum.setHorizontalAlignment(SwingConstants.LEFT);
		lblCurrencyNum.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblCurrencyNum.setBounds(10, 249, 284, 27);
		frame.getContentPane().add(lblCurrencyNum);
		
		textCurrencyNum = new JTextField(); //text field for the user to input the starting currency amt
		textCurrencyNum.setHorizontalAlignment(SwingConstants.CENTER);
		textCurrencyNum.setColumns(10);
		textCurrencyNum.setBounds(286, 252, 291, 20);
		frame.getContentPane().add(textCurrencyNum);
		
		JButton btnConvert = new JButton("Convert"); //Button the user clicks to convert their chosen currency
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int userCurrency=Integer.parseInt(textStarting.getText()); //Gets the text of the number that the user selects for their starting currency
					int convertCurrency=Integer.parseInt(textConversion.getText()); //Gets the text of the number the user  would like to convert to
					double amount1=Double.parseDouble(textCurrencyNum.getText()); //Gets the text and makes the double amount1 the user input
					String convertedResult=convertCurrency(userCurrency, convertCurrency, amount1); //Variable for holding the converted result. Calls convert method
					textConvertedAmt.setText(convertedResult);
					converterInitialCommit.conversionHistory.add(convertedResult); //Adds each result to the ArrayList
					writeToFile(); //calls the writeToFile method to store the previous conversions
				} catch (NumberFormatException ex) { //If the user does not put in a number, it will print Invalid input
	            System.out.println("Invalid input. Please enter a number for conversions.");
			} catch (IOException e1) { // Eclipse auto generated catch to handle any errors from the user not putting in a valid number
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	});
		btnConvert.setFont(new Font("Calibri", Font.BOLD, 18));
		btnConvert.setBounds(235, 307, 120, 23);
		frame.getContentPane().add(btnConvert);
		

	}
	private String convertCurrency(int userCurrency, int convertCurrency, double amount1) //Method for converting the currencies
	{
		String result= " ";
		if (userCurrency==1 && convertCurrency==2) //If user selects US Dollar (1) and Euro (2)
		{
			currency1.setCurrencyAmount(amount1); //Sets the amount in the usdConversions class to the user's input
			currency1.EUR(); //Converts the currency that the user selects into their desired one by calling the correct method
			result=currency1.toString();
		}
		else if (userCurrency==1 && convertCurrency==3)
		{
			currency1.setCurrencyAmount(amount1);
			currency1.GBP();
			result=currency1.toString();
		}
		else if (userCurrency==1 && convertCurrency==4)
		{
			currency1.setCurrencyAmount(amount1);
			currency1.JPY();
			result=currency1.toString();
		}
		else if (userCurrency==1 && convertCurrency==5)
		{
			currency1.setCurrencyAmount(amount1);
			currency1.AUD();
			result=currency1.toString();
		}
		else if (userCurrency==1 && convertCurrency==6)
		{
			currency1.setCurrencyAmount(amount1);
			currency1.CAD();
			result=currency1.toString();
		}
		else if (userCurrency==2 && convertCurrency==1)
		{
			currency2.setCurrencyAmount(amount1);
			currency2.USD();
			result=currency2.toString();
		}
		else if (userCurrency==2 && convertCurrency==3)
		{
			currency2.setCurrencyAmount(amount1);
			currency2.GBP();
			result=currency2.toString();
		}
		else if (userCurrency==2 && convertCurrency==4)
		{
			currency2.setCurrencyAmount(amount1);
			currency2.JPY();
			result=currency2.toString();
		}
		else if (userCurrency==2 && convertCurrency==5)
		{
			currency2.setCurrencyAmount(amount1);
			currency2.AUD();
			result=currency2.toString();
		}
		else if (userCurrency==2 && convertCurrency==6)
		{
			currency2.setCurrencyAmount(amount1);
			currency2.CAD();
			result=currency2.toString();
		}
		else if (userCurrency==3 && convertCurrency==1)
		{
			currency3.setCurrencyAmount(amount1);
			currency3.USD();
			result=currency3.toString();
		}
		else if (userCurrency==3 && convertCurrency==2)
		{
			currency3.setCurrencyAmount(amount1);
			currency3.EUR();
			result=currency3.toString();
		}
		else if (userCurrency==3 && convertCurrency==4)
		{
			currency3.setCurrencyAmount(amount1);
			currency3.JPY();
			result=currency3.toString();
		}
		else if (userCurrency==3 && convertCurrency==5)
		{
			currency3.setCurrencyAmount(amount1);
			currency3.AUD();
			result=currency3.toString();
		}
		else if (userCurrency==3 && convertCurrency==6)
		{
			currency3.setCurrencyAmount(amount1);
			currency3.CAD();
			result=currency3.toString();
		}
		else if (userCurrency==4 && convertCurrency==1)
		{
			currency4.setCurrencyAmount(amount1);
			currency4.USD();
			result=currency4.toString();
		}
		else if (userCurrency==4 && convertCurrency==2)
		{
			currency4.setCurrencyAmount(amount1);
			currency4.EUR();
			result=currency4.toString();
		}
		else if (userCurrency==4 && convertCurrency==3)
		{
			currency4.setCurrencyAmount(amount1);
			currency4.GBP();
			result=currency4.toString();
		}
		else if (userCurrency==4 && convertCurrency==5)
		{
			currency4.setCurrencyAmount(amount1);
			currency4.AUD();
			result=currency4.toString();
		}
		else if (userCurrency==4 && convertCurrency==6)
		{
			currency4.setCurrencyAmount(amount1);
			currency4.CAD();
			result=currency4.toString();
		}
		else if (userCurrency==5 && convertCurrency==1)
		{
			currency5.setCurrencyAmount(amount1);
			currency5.USD();
			result=currency5.toString();
		}
		else if (userCurrency==5 && convertCurrency==2)
		{
			currency5.setCurrencyAmount(amount1);
			currency5.EUR();
			result=currency5.toString();
		}
		else if (userCurrency==5 && convertCurrency==3)
		{
			currency5.setCurrencyAmount(amount1);
			currency5.GBP();
			result=currency5.toString();
		}
		else if (userCurrency==5 && convertCurrency==4)
		{
			currency5.setCurrencyAmount(amount1);
			currency5.JPY();
			result=currency5.toString();
		}
		else if (userCurrency==5 && convertCurrency==6)
		{
			currency5.setCurrencyAmount(amount1);
			currency5.CAD();
			result=currency5.toString();
		}
		else if (userCurrency==6 && convertCurrency==1)
		{
			currency6.setCurrencyAmount(amount1);
			currency6.USD();
			result=currency6.toString();
		}
		else if (userCurrency==6 && convertCurrency==2)
		{
			currency6.setCurrencyAmount(amount1);
			currency6.EUR();
			result=currency6.toString();
		}
		else if (userCurrency==6 && convertCurrency==3)
		{
			currency6.setCurrencyAmount(amount1);
			currency6.GBP();
			result=currency6.toString();
		}
		else if (userCurrency==6 && convertCurrency==4)
		{
			currency6.setCurrencyAmount(amount1);
			currency6.JPY();
			result=currency6.toString();
		}
		else if (userCurrency==6 && convertCurrency==5)
		{
			currency6.setCurrencyAmount(amount1);
			currency6.AUD();
			result=currency6.toString();
		}

		return result;
	}
	
	public void writeToFile() throws IOException {
		FileWriter writer=new FileWriter("ConversionHistory.txt", true);
		for (String conversion: converterInitialCommit.conversionHistory) 
		{
			writer.write(conversion + "\n");
		}
		writer.close();
		{
			
		}
	}
	
		
}
