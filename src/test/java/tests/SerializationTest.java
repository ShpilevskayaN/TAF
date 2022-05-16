package tests;

import Models.Project;
import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class SerializationTest {

    @Test
    public void objectToJsonTest() throws IOException {
        Gson gson = new Gson();
        Project project = new Project("Test Project","Big Test data...", false, 2);

        String objectGson = gson.toJson(project);
        System.out.println(objectGson);

        FileWriter file = new FileWriter("projectResult.json")
                gson.toJson(project,file);
        file.close();
    }

    @Test
    public void jsonToObjectTest() throws IOException {
        Gson gson= new Gson();
        String json= " \"name\" : \"Test Project\",\n" +
                "  \"announcement\" : \"Big Announcement text...\",\n" +
                "  \"show announcement\" : true,\n" +
                "  \"type\" : 1"
        Project projectFromString = gson.fromJson(json, Project.class);
        System.out.println(projectFromString.toString());
        System.out.println(projectFromString.getName());

        Reader reader = Files.newBufferedReader(Paths.get("progectResult.json"));
        Project projectFromFile = gson.fromJson(reader,Project.class);
        System.out.println(projectFromFile.toString());
        System.out.println(projectFromFile.getName());

    }
}
