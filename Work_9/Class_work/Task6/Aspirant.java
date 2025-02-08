public class Aspirant extends Student{
    protected boolean isScienceWork;
    public Aspirant(String firstName,String lastName, String group, double averageMark, double Scholarship,boolean isScienceWork){
        super(firstName, lastName, group, averageMark, Scholarship);
        this.isScienceWork = isScienceWork;
    }
    @Override
    public double getScholarship(){
        if (averageMark != 5){
            return 2200;
        }
        return 2500;
    }
}