package assessedExercise2;

public class Teacher {
	private String TeacherID;    
	private String name;   
	private String labNo;   
    private String Requirement;       
    private String CourseNumber; 
    private String CourseInfo;
    private String Feedback;  
    

    public Teacher() {
        
    }
    
    public Teacher(String TeacherID,String name,String labNo,String Requirement,String CourseNumber,String CourseInfo,String Feedback) {
    	super();
    	this.TeacherID=TeacherID;
    	this.name=name;
    	this.labNo=labNo;
    	this.Requirement=Requirement;
    	this.CourseNumber=CourseNumber;
    	this.CourseInfo=CourseInfo;
    	this.Feedback=Feedback;
    }
    public String getTeacherID() {
    	return this.TeacherID;
    }
    public void setTeacherID(String TeacherID) {
    	this.TeacherID=TeacherID;
    }
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getLabNo() {
    	return this.labNo;
    }
    public void setLabNo(String labNo) {
    	this.labNo=labNo;
    }
    
    public String getRequirement() {
    	return this.Requirement;
    }
    public void setRequirement(String Requirement) {
    	this.Requirement=Requirement;
    }
    
    public String getCourseNumber() {
    	return this.CourseNumber;
    }
    public void setCourseNumber(String CourseNumber) {
    	this.CourseNumber=CourseNumber;
    }
    
    public String getCourseInfo() {
    	return this.CourseInfo;
    }
    public void setCourseInfo(String CourseInfo) {
    	this.CourseInfo=CourseInfo;
    }
    
    public String getFeedback() {
    	return this.Feedback;
    }
    public void setFeedback(String Feedback) {
    	this.Feedback=Feedback;
    }
    
    //Data format entered from the file    "ID  name  labNo  Requirement  CourseNumber  CourseInfo  Feedback"  
    public String fileString()
	{
		return TeacherID+" "+name+" "+labNo+" "+Requirement+"  "+CourseNumber+"  "+CourseInfo+"  "+Feedback;
	}


}
