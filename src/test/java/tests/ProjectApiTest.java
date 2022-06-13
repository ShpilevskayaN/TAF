package tests;

import helpers.ProjectHelper;
import models.Project;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.api.BaseApiTest;

public class ProjectApiTest extends BaseApiTest {

    ProjectHelper projectHelper;
    @Test
    public void positiveTest() {
        Project expectedProject = Project.builder()
                .typeOfProject(1)
                .name("WP Test")
                .announcement("Test An")
                .build();

        Project actualProject = projectHelper.getProject(1);

        Assert.assertTrue(actualProject.equals(expectedProject));
    }

    @Test
    public void negativeCountProjectsTest(){
        Assert.assertEquals();
    }
}
