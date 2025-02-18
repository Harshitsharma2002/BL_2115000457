import java.util.*;

abstract class JobRole {
    String jobTitle;

    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public abstract void displayJobRoleDetails();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String jobTitle) {
        super(jobTitle);
    }

    
    public void displayJobRoleDetails() {
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Required Skills: Java, Python, Algorithms");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String jobTitle) {
        super(jobTitle);
    }

    
    public void displayJobRoleDetails() {
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Required Skills: Python, R, Machine Learning");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String jobTitle) {
        super(jobTitle);
    }

    public void displayJobRoleDetails() {
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Required Skills: Product Strategy, Agile, Communication");
    }
}

class Resume<T extends JobRole> {
    String candidateName;
    T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void displayResumeDetails() {
        System.out.println("Candidate Name: " + candidateName);
        jobRole.displayJobRoleDetails();
    }
}

class ResumeScreeningSystem {
    public void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayJobRoleDetails();
            System.out.println("------------------------------------");
        }
    }
}

public class AIResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer seJobRole = new SoftwareEngineer("Software Engineer");
        DataScientist dsJobRole = new DataScientist("Data Scientist");
        ProductManager pmJobRole = new ProductManager("Product Manager");

        Resume<SoftwareEngineer> seResume = new Resume<>("Alice", seJobRole);
        Resume<DataScientist> dsResume = new Resume<>("Bob", dsJobRole);
        Resume<ProductManager> pmResume = new Resume<>("Charlie", pmJobRole);

        List<JobRole> resumesList = new ArrayList<>();
        resumesList.add(seJobRole);
        resumesList.add(dsJobRole);
        resumesList.add(pmJobRole);

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();

        System.out.println("Displaying Individual Resume Details:");
        seResume.displayResumeDetails();
        dsResume.displayResumeDetails();
        pmResume.displayResumeDetails();

        System.out.println("\nScreening Resumes Dynamically:");
        screeningSystem.screenResumes(resumesList);
    }
}
