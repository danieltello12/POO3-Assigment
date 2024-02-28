package Cuaderno_3.Ejercicio3_2;

public class main {
    public static void main(String[] args){
    Person p1= new Person("Dani", "villalbilla");
    System.out.println(p1.getName());
        System.out.println(p1.getAdress());
        p1.setAdress("alcala");
        System.out.println(p1.getAdress());

    Staff s1= new Staff("Dani", "villalbila", "doon pelayo",4.6);
        System.out.println(s1.getPay());
        System.out.println(s1.getSchool());
        System.out.println(s1.getAdress());
        s1.setPay(43);
        s1.setSchool("Valle inclam");
        s1.setAdress("Alcala");
        System.out.println(s1.getPay());
        System.out.println(s1.getSchool());
        System.out.println(s1.getAdress());
        Student st= new Student("Dani","Villalbila", "Ciencias",18,1.5);
        System.out.println(st.getFee());
        System.out.println(st.getProgram());
        System.out.println(st.getAdress());
        System.out.println(st.getYear());
        System.out.println(st.getName());
        st.setFee(4.5);
        st.setProgram("letras");
        st.setYear(45);
        st.setAdress("Alcala");
        System.out.println(st.getFee());
        System.out.println(st.getProgram());
        System.out.println(st.getAdress());
        System.out.println(st.getYear());
        System.out.println(st);
        System.out.println(s1);
        System.out.println(p1);



    }
}
