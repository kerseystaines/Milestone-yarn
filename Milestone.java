public class Milestone {
    //attributes
    private float Milestone1;
    private float Milestone2;
    private float TerminalAssessment;
    private float AverageGrade;
   
    //getter and setter methods
    //getter methods
    public String getMilestone1() {
        return String.valueOf(Milestone1);
    }
   
    public String getMilestone2() {
        return String.valueOf(Milestone2);
    }
   
    public String getTerminalassessment() {
        return String.valueOf(TerminalAssessment);
    }    
        public String getAveGrade() {
            return String.valueOf(AverageGrade);
    }
    //setter methods
        
    public void setMilestone1(float m1) {
        Milestone1 = m1;
    }
   
    public void setMilestone2(float m2) {
        Milestone2 = m2;
    }
   
    public void setTerminalAssessment(float t) {
        TerminalAssessment = t;
    }
    //methods
    public float computeAverage() {
        AverageGrade = (Milestone1 + Milestone2 + TerminalAssessment);
        
        if (Milestone1 >= 26 || Milestone2 >= 41 || TerminalAssessment >= 36) {
        	System.out.println("[Error] Exceeded Grade Total.");
        }	
        
        if (Milestone1 <= 0 || Milestone2 <= 0 || TerminalAssessment <= 0) {
        	System.out.println("[Error] No Input.");
        }
        	
        return AverageGrade;
    }
}