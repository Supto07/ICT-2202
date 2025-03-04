public class Activity implements Comparable<Activity> {
    private String name;
    private int start, end;

    public Activity(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    
    @Override
    public int compareTo(Activity other) {
        return this.end - other.end;
    }
}
