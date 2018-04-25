package prog;

import data.Person;
import data.Student;

public class Prog {

	public static void main(String[] args) {
		new Prog();

	}

	public Prog() {
		//
		Person p1 = new Person();
		p1.setVorname("Peter");
		p1.setNachname("Krauss");
		//p1.setFemale(false);
		System.out.println(p1);
		Person.getPersonenListe().add(p1);
		//
		Person p2 = new Person();
		p2.setVorname("Anna");
		p2.setNachname("Mayer");
		p2.setFemale(true);
		System.out.println(p2);
		Person.getPersonenListe().add(p2);
		//
		Student s1 = new Student();
		s1.setVorname("Hans");
		s1.setNachname("Hansi");
		s1.setGrade(2018);
		System.out.println(s1);
		//
		//Student s2 = (Student) p2;
		//das geht nicht
		Person p3 = s1;
		Person.getPersonenListe().add(p3);
		//
		System.out.println("----");
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
		System.out.println("----");
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Student);
		System.out.println("----");
		System.out.println(p3 instanceof Person);
		System.out.println(p3 instanceof Student);
		//
		//for ( int i = 0; i < Person.getPersonenListe().size(); i++) {
		//	
		//} Kurzform unten
		for (Person p : Person.getPersonenListe()) {
			System.out.println(p.getVorname() + " " + p.getNachname());
			//
			if (p instanceof Student) {
				Student s = (Student) p;
				System.out.println(s.getGrade());
			}
		}
	}
}
