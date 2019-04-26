package com.tqf.test.service;

import com.tqf.test.enity.Classroom;
import com.tqf.test.enity.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.URL;

@Service
public class TestServiceImpl {

    public void testjx(){
//
        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<student>" +
                "<age>22</age>" +
                "<classroom>" +
                "<grade>4</grade>" +
                "<id>1</id>" +
                "<name>软件工程</name>" +
                "</classroom>" +
                "<id>101</id>" +
                "<name>张三</name>" +
                "</student>";
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Student student = (Student)unmarshaller.unmarshal(new StringReader(xmlStr));

            System.out.println(student.getAge());
            System.out.println(student.getClassroom().getName());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public void fileservice(){
        try {
            SAXReader reader = new SAXReader();
            Document document = null;
            document = reader.read("classpath:schema/product.xml");
            System.out.println(document.asXML());
            String xmlStr=document.asXML();
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Student student = (Student)unmarshaller.unmarshal(new StringReader(xmlStr));

            System.out.println(student.getAge());
            System.out.println(student.getClassroom().getName());

        } catch (DocumentException e) {
            e.printStackTrace();
        }catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void createxml(){
        Classroom classroom = new Classroom(1, "软件工程", 4);
        Student student = new Student(101,"张三", 22, classroom);

        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(student, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
