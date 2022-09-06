public class student {
    course c1;
    course c2;
    course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    student(String name,String stuNo,String classes,course c1,course c2,course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1,int note2,int note3,int bnote1,int bnote2,int bnote3){
        if(note1 >= 0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2 >= 0 && note2<=100){
            this.c2.note=note2;
        }
        if(note3 >= 0 && note3<=100){
            this.c3.note=note3;
        }
    }
    void isPass(){
        this.average=(((this.c1.note*0.8+this.c2.note*0.8+this.c3.note*0.8)/3.0)+((this.c1.bnote*0.2+this.c2.bnote*0.2+this.c3.bnote*0.2)/3.0));
        if(this.average>55){
            System.out.println("You passed. ");
        }else{
            System.out.println("You didn't passed. ");
        }
        printNote();
    }
        void printNote(){
            System.out.println(c1.name+"Note:\t\t"+this.c1.note);
            System.out.println(c2.name+"Note:\t\t"+this.c2.note);
            System.out.println(c3.name+"Note:\t\t"+this.c3.note);
            System.out.println("Your average : "+this.average);
        }
    }

