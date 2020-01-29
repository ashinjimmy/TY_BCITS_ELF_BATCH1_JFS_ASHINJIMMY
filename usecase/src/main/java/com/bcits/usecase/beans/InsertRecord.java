package com.bcits.usecase.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertRecord extends HttpServlet {

	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;

		ConsumerInfo info = new ConsumerInfo();

		try {
			EntityManagerFactory entityManagerFactory = Persistence
					.createEntityManagerFactory("usecasePersistenceUnit");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}
}
