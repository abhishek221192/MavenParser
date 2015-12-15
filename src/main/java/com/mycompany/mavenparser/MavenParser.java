/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenparser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;

/**
 *
 * @author abhisheksingh
 */
public class MavenParser {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\abhisheksingh\\Desktop\\mychatserver\\pom.xml");
        final Model model = MavenPomReader.readModel(file);

// Print the dependencies on the console
        final List<Dependency> dependencies = model.getDependencies();
        for (int i = 0; i < dependencies.size(); i++) {
            final Dependency dependency = dependencies.get(i);
            System.out.println(dependency.getGroupId() + " / " + dependency.getArtifactId() + " / "
                    + dependency.getVersion());
        }

        System.out.println(model.getArtifactId() + "-" + model.getVersion());
    }
}
