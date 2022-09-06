public class course {
    teacher Teacher;
    String name;
    String code;
    String prefix;
    int note;
    int bnote;

    course(String name,String code,String prefix){
        this.name = name;
        this.code=code;
        this.prefix=prefix;
        int note = 0;
    }
    void addTeacher(teacher Teacher){
        if(Teacher.branch.equals(this.prefix)){
            this.Teacher = Teacher;
        }else{

        }
        this.Teacher=Teacher;
    }
    void printTeacher(){
        this.Teacher.print();
    }
}
