package com.bcits.usecase.mailgeneration;

import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;



public class EmailGeneration {
	
	public boolean sendMail(CurrentBillBean currentBill,ConsumerMasterBean consumerMasterBean ) {
		

		System.out.println("Sending Mail...");

		final String username = "ashinjimmy54@gmail.com";
		final String password = "********";
	

		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); 

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String dueDate = dateFormat.format(currentBill.getDueDate());
		String date = dateFormat.format(currentBill.getIssueDate());
		
		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			System.out.println(username);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ashinjimmy54@gmail.com"));
			message.setSubject("Electricity Bill");
			message.setText("Dear " +consumerMasterBean.getFirstName()+" "+ consumerMasterBean.getLastName()+" ,"+ 
			                 "\n\n This  month you have consumed "+ currentBill.getTotalUnits()+" units"+                               
					         "\n\n Your monthly current bill will be rupees " +currentBill.getBillAmount()+
					         "\n\n The Due date will be on "+dueDate+
					          "\n\n Issued On "+ date +"\n\n\n\n Thank You"
	                           	);
		
			Transport.send(message);

			System.out.println("Done");
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return false;

	}// End of main()

}// End of class