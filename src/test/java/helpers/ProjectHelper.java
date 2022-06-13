package helpers;

import configuration.Endpoints;
import models.Project;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;

public class ProjectHelper {
    public Project getProject(int project_id) {

        return given()
                .pathParam("project_id", 1)
                .get(Endpoints.GET_PROJECT)
                .then()
                .extract()
                .as(Project.class)
                .body("id", is(1))
                .body("name", equalTo("WP Test"));
    }


    }
}
