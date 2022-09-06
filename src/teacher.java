public class teacher {
    String name;
    String mpno;
    String branch;

    teacher(String name,String branch,String mpno){
        this.name= name;
        this.mpno= mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Phone number  : "+ this.mpno);
        System.out.println("Majority : "+this.branch);
    }
}
