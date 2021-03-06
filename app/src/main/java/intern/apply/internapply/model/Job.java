package intern.apply.internapply.model;

public class Job {
    private int id;
    private final String organization;
    private final String title;
    private String location;
    private String url;
    private String description;
    private double salary;
    private int numSalaries;

    public Job(String organization, String title, String location, String url, String description, double salary, int numSalaries) {
        this.organization = organization;
        this.title = title;
        this.location = location;
        this.url = url;
        this.description = description;
        this.salary = salary;
        this.numSalaries = numSalaries;
    }

    public int getId() {
        return id;
    }

    public String getOrganization() {
        return organization;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public double getSalary() {
        return salary;
    }

    public int getNumSalaries() {
        return numSalaries;
    }
}
