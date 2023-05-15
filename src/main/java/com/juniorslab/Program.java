package com.juniorslab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        Configuration configuration = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Student student = new Student(1, "Ivan", 23, true);
        Student student1 = new Student();

        student1.setName("Sanya");
        student1.setAge(23);
        student.setSex(true);


        Transaction transaction = session.beginTransaction();
        List<Student> students = session.createQuery("from Student").getResultList();
        students.get(0).setName("Vanya");


        students.forEach(s -> System.out.println(s.getName()+" " + s.getAge()+ " " + s.getSex()));
        session.
        //session.persist(student1);
        transaction.commit();

    }
}
