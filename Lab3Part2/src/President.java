public class President  { 
    String name;
    int year;

    public President(String firstName, int yearElected) {
        name = firstName;
        year = yearElected;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        President p = (President) o;
        return this.name.equals(p.name) && this.year == p.year;
    }
}
