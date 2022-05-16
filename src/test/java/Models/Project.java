package Models;

import java.io.Serializable;

public class Project implements Serializable {
    public boolean toString;
    private String name;
    private String announcement;
    private boolean show_announcement;
    private int type;

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", announcement='" + announcement + '\'' +
                ", show_announcement=" + show_announcement +
                ", type=" + type +
                '}';
    }

    public Project(String name, String announcement, boolean show_announcement, int type) {
        this.name = name;
        this.announcement = announcement;
        this.show_announcement = show_announcement;
        this.type = type;

    }

    public boolean getName() {
        return name;
    }
}
