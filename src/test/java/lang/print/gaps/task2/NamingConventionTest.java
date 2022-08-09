package lang.print.gaps.task2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NamingConventionTest {
    @Test
    void containsUpdatedVariableNamesAccordingToConvention() throws IOException {
        Path path = Paths.get("src/main/java/lang/print/gaps/task2/NamingConvention.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line ->
                                line.contains("variable ") ||
                                line.contains("variable_one") ||
                                line.contains("variableTwo") ||
                                line.contains("variable_three") ||
                                line.contains("VARIABLE_FOUR") ||
                                line.contains("VARIABLE_FIVE") ||
                                line.contains("variableSix") ||
                                line.contains("variableSeven") ||
                                line.contains("variableEight"))
                .collect(Collectors.toList());

        assertEquals(9, result.size(), "You should follow the case that is used for variable name:" +
                " if in the snippet you see snake case -> in the solution you must follow it.");
    }
}