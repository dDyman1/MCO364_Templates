/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MCO364_Templates;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.nio.file.Files;
import org.gradle.testkit.runner.GradleRunner;
import org.gradle.testkit.runner.BuildResult;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A simple functional test for the 'MCO364_Templates.greeting' plugin.
 */
public class MCO364_TemplatesPluginFunctionalTest {
    @Test public void canRunTask() throws IOException {
        // Setup the test build
        File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
            "plugins {" +
            "  id('MCO364_Templates.greeting')" +
            "}");

        // Run the build
        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        runner.withArguments("greeting");
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();

        // Verify the result
        assertTrue(result.getOutput().contains("Hello from plugin 'MCO364_Templates.greeting'"));
    }

    private void writeString(File file, String string) throws IOException {
        try (Writer writer = new FileWriter(file)) {
            writer.write(string);
        }
    }
}