public class main {
    public static void main(String[] args){
        teacher t1 = new teacher("Mahmut","HST","905000000");
        teacher t2 = new teacher("Einstein","PHCS","9051111111");
        teacher t3 = new teacher("Darwin","BIO","90522222222");

        course history = new course("History", "101","HST");
        history.addTeacher(t1);
        course physic = new course("Physic", "102","PHSC");
        history.addTeacher(t2);
        course bio= new course("Biology","101","BIO");
        bio.addTeacher(t3);

        student s1= new student("Umut","123","4",history,physic,bio);
        s1.addBulkExamNote(100,78,50,100,100,100);
        s1.isPass();
    }
}
