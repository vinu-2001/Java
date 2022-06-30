package labsession;

class Doctor
{
	//attributes
    private int doctorId;
    private String doctorName, location;
    //creating constructor
    Doctor(int i,String n,String l)
    {
        doctorId = i;
        doctorName = n;
        location = l;
    }

    public void setDoctorId(int i) {
        doctorId = i;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    //to display attributes
    public void getDetails()
    {
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Location: "+location);
    }
}